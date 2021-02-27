package com.own.web.controller;

import com.github.pagehelper.PageInfo;
import com.own.bean.PageData;
import com.own.bean.UservisitInf;
import com.own.mapper.UservisitInfMapper;
import com.own.service.VisitLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VisitController {

    @Autowired
    private UservisitInfMapper mapper;

    @Autowired
    private VisitLogService service;


    @RequestMapping("/uservisit/listpage")
    public String listPage(){
        return "uservisit/list";
    }


    @RequestMapping("/uservisit/list")
    @ResponseBody
    public PageData list(Integer page,Integer limit){
        PageInfo<UservisitInf> pageInfo = service.findUserVisitInfByPage(page, limit);
        PageData pageData = new PageData<UservisitInf>();
        pageData.setCount((int) pageInfo.getTotal());
        pageData.setData(pageInfo.getList());
        return pageData;
    }

    @RequestMapping("/uservisit/deleteUserVisit")
    public void delete(Integer id){
        mapper.deleteByPrimaryKey(id);
    }
}
