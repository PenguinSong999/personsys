package com.own.web.controller;


import com.github.pagehelper.PageInfo;
import com.own.bean.NoticeInf;
import com.own.bean.PageData;
import com.own.bean.UserInf;
import com.own.mapper.NoticeInfMapper;
import com.own.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    private NoticeService service;

    @Autowired
    private NoticeInfMapper mapper;

    @RequestMapping("/listpage")
    public String listPage(){
        return "notice/list";
    }

    @RequestMapping("/listdata")
    @ResponseBody
    public PageData<NoticeInf> list(Integer page,Integer limit){
        PageInfo<NoticeInf> pageInfo = service.findNoticeByPage(page, limit);
        PageData<NoticeInf> pageData = new PageData<>();
        pageData.setCount((int) pageInfo.getTotal());
        pageData.setData(pageInfo.getList());
        return pageData;
    }


    @RequestMapping("/editnotice")
    public String editPage(Integer id, Model model){
        NoticeInf noticeInf = mapper.selectByPrimaryKey(id);
        model.addAttribute("notice",noticeInf);
        return "notice/edit";
    }


    //编辑
    @RequestMapping("/update")
    public String update(NoticeInf noticeInf,Model model){
        mapper.updateByPrimaryKey(noticeInf);
        NoticeInf notice = mapper.selectByPrimaryKey(noticeInf.getId());
        model.addAttribute("notice",notice);
        model.addAttribute("message","修改成功");
        return "notice/edit";
    }

    //删除
    @RequestMapping("/deletenotice")
    public void delete(Integer id){
        mapper.deleteByPrimaryKey(id);
    }

    @RequestMapping("/addpage")
    public String addPage(){
        return "notice/add";
    }
    //添加
    @RequestMapping("/add")
    public String add(NoticeInf noticeInf, HttpServletRequest request,Model model){
        noticeInf.setCreatedate(new Date());
        UserInf user = (UserInf) request.getSession().getAttribute("user");
        noticeInf.setUserId(user.getId());
        mapper.insert(noticeInf);
        model.addAttribute("message","添加成功");
        return "notice/add";
    }
}
