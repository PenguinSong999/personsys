package com.own.web.controller;

import com.github.pagehelper.PageInfo;
import com.own.bean.DeptInf;
import com.own.bean.PageData;
import com.own.mapper.DeptInfMapper;
import com.own.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService service;

    @Autowired
    private DeptInfMapper mapper;

    @RequestMapping("/listpage")
    public String listpage(){
        return "/dept/list";
    }

    @RequestMapping("/listdata")
    @ResponseBody
    public PageData<DeptInf> lsitData(Integer page,Integer limit){
        PageInfo<DeptInf> pageInfo = service.findDeptByPage(page, limit);
        PageData<DeptInf> pageData = new PageData<>();
        pageData.setCount((int) pageInfo.getTotal());
        pageData.setData(pageInfo.getList());
        return pageData;
    }

    //删除
    @RequestMapping("/deleteDept")
    public void delete(Integer id){
        mapper.deleteByPrimaryKey(id);
    }


    @RequestMapping("/editDept")
    public String edit(Integer id, Model model){
        DeptInf deptInf = mapper.selectByPrimaryKey(id);
        model.addAttribute("dept",deptInf);
        return "/dept/edit";
    }

    //更新
    @RequestMapping("/update")
    public String update(DeptInf deptInf,Model model){
        mapper.updateByPrimaryKey(deptInf);
        model.addAttribute("message","编辑成功");
        return "/dept/edit";
    }

    @RequestMapping("/addpage")
    public String addpage(){
        return "/dept/add";
    }

    //添加
    @RequestMapping("/add")
    public String add(DeptInf deptInf,Model model){
        mapper.insert(deptInf);
        model.addAttribute("message","添加成功");
        return "/dept/add";
    }
}
