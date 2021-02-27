package com.own.web.controller;

import com.github.pagehelper.PageInfo;
import com.own.bean.*;
import com.own.mapper.TraindataInfMapper;
import com.own.service.TrainService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.Date;

@Controller
@RequestMapping("/train")
public class TrainController {
    @Autowired
    private TrainService service;
    @Autowired
    private TraindataInfMapper mapper;

    @RequestMapping("/trainplan")
    public String trainPlan(){
        return "traindata/trainplanlist";
    }

    @RequestMapping("listplandata")
    @ResponseBody
    public PageData<TrainInf> list(Integer page,Integer limit){
        PageInfo<TrainInf> pageInfo = service.findTrainByPage(page, limit);
        PageData<TrainInf> pageData = new PageData<>();
        pageData.setData(pageInfo.getList());
        pageData.setCount((int) pageInfo.getTotal());
        return pageData;
    }


    //培训资料管理
    @RequestMapping("/listpage")
    public String listdata(){
        return "traindata/list";
    }

    //展示培训资料
    @RequestMapping("/listdata")
    @ResponseBody
    public PageData<TraindataInf> listData(Integer page, Integer limit){
        PageInfo<TraindataInf> pageInfo = service.findTrainDataByPage(page, limit);
        PageData<TraindataInf> pageData = new PageData<>();
        pageData.setCount((int) pageInfo.getTotal());
        pageData.setData(pageInfo.getList());
        return pageData;
    }


    //资料添加
    @RequestMapping("/addpage")
    public String addPage(){
        return "traindata/add";
    }


    //文件上传
    @RequestMapping("/add")
    public String uploadFile(@RequestParam("uploadfile") MultipartFile file, TraindataInf traindataInf, HttpServletRequest request){
        String originalFilename = file.getOriginalFilename();
        String path = request.getSession().getServletContext().getRealPath("/upload");
        try {
            file.transferTo(new File(path+"/"+originalFilename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        traindataInf.setCreatedate(new Date());
        traindataInf.setFilename(originalFilename);
        UserInf user = (UserInf) request.getSession().getAttribute("user");
        traindataInf.setUserId(user.getId());
        mapper.insert(traindataInf);
        request.setAttribute("message","上传成功");
        return "traindata/add";
    }

    //文件下载
    @RequestMapping("/download")
    public void  download(Integer id, HttpServletRequest request, HttpServletResponse response) throws IOException {
        TraindataInf traindataInf = mapper.selectByPrimaryKey(id);
        String filename = traindataInf.getFilename();
        //获取ServletContext对象
        ServletContext servletContext = request.getServletContext();
        //获取文件输入流
        InputStream is = servletContext.getResourceAsStream("/upload/" + filename);
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

    //删除
    @RequestMapping("/delete")
    public void delete(Integer id,HttpServletRequest request){
        TraindataInf traindataInf = mapper.selectByPrimaryKey(id);
        String realPath = request.getSession().getServletContext().getRealPath("/upload/"+traindataInf.getFilename());
        File file = new File(realPath);
        file.delete();
        mapper.deleteByPrimaryKey(id);
    }

    @RequestMapping("/play")
    public String play(String filename, Model model){
        model.addAttribute("filename",filename);
        return "traindata/play";
    }
}
