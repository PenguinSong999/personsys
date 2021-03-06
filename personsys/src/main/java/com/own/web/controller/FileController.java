package com.own.web.controller;


import com.github.pagehelper.PageInfo;
import com.own.bean.DocumentInf;
import com.own.bean.PageData;
import com.own.bean.UserInf;
import com.own.mapper.DocumentInfMapper;
import com.own.service.FileService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.Date;

@Controller
@RequestMapping("/file")
public class FileController {

    @Autowired
    private FileService service;

    @Autowired
    private DocumentInfMapper mapper;

    @RequestMapping("/listpage")
    public String listPage(){
        return "file/list";
    }

    @RequestMapping("/listdata")
    @ResponseBody
    public PageData<DocumentInf> list(Integer page,Integer limit){
        PageInfo<DocumentInf> pageInfo = service.finddocumentByPage(page, limit);
        PageData<DocumentInf> pageData = new PageData<>();
        pageData.setCount((int) pageInfo.getTotal());
        pageData.setData(pageInfo.getList());
        return pageData;

    }

    @RequestMapping("/addpage")
    public String addpage(){
        return "file/add";
    }

    //文件上传
    @RequestMapping("/add")
    public String uploadFile(@RequestParam("uploadfile") MultipartFile file,DocumentInf documentInf, HttpServletRequest request){
        String originalFilename = file.getOriginalFilename();
        String path = request.getSession().getServletContext().getRealPath("/WEB-INF/files");
        try {
            file.transferTo(new File(path+"/"+originalFilename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        documentInf.setCreatedate(new Date());
        documentInf.setFilename(originalFilename);
        UserInf user = (UserInf) request.getSession().getAttribute("user");
        documentInf.setUserId(user.getId());
        mapper.insert(documentInf);
        request.setAttribute("message","上传成功");
        return "file/add";
    }

    //删除
    @RequestMapping("/deletefile")
    public void delete(Integer id){
        mapper.deleteByPrimaryKey(id);
    }


    //文件下载
    @RequestMapping("/download")
    public void  download(Integer id, HttpServletRequest request, HttpServletResponse response) throws IOException {
        DocumentInf documentInf = mapper.selectByPrimaryKey(id);
        String filename = documentInf.getFilename();
        //获取ServletContext对象
        ServletContext servletContext = request.getServletContext();
        //获取文件输入流
        InputStream is = servletContext.getResourceAsStream("/WEB-INF/files/" + filename);
        //设置响应头类型
        String mime = servletContext.getMimeType(filename);
        response.setHeader("Content-Type",mime);
        //解决中文文件名问题
        request.getHeader("user-agent");

        //防止文件名中文乱码
        filename = URLEncoder.encode(filename, "utf-8");

        //设置资源在客户端的打开方式
        response.setHeader("content-disposition","attachment;filename="+filename);

        ServletOutputStream ops = response.getOutputStream();
        IOUtils.copy(is,ops);
    }

}
