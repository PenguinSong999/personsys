package com.own.web.controller;


import com.github.pagehelper.PageInfo;
import com.own.bean.CheckworkInf;
import com.own.bean.LeaveInf;
import com.own.bean.LeavestatusInf;
import com.own.bean.PageData;
import com.own.mapper.CheckworkInfMapper;
import com.own.mapper.LeaveInfMapper;
import com.own.mapper.LeavestatusInfMapper;
import com.own.service.CheckWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/checkwork")
public class CheckWorkController {
    @Autowired
    private CheckWorkService service;

    @Autowired
    private LeaveInfMapper leaveInfMapper;

    @Autowired
    private CheckworkInfMapper mapper;
    @Autowired
    private LeavestatusInfMapper leavestatusInfMapper;

    @RequestMapping("/listpage")
    public String listPage(){
        return "checkwork/list";
    }


    //考勤信息
    @RequestMapping("/listdata")
    @ResponseBody
    public PageData<CheckworkInf> list(Integer page,Integer limit){
        PageInfo<CheckworkInf> pageInfo = service.findCheckWordByPage(page, limit);
        PageData<CheckworkInf> pageData = new PageData<>();
        pageData.setCount((int) pageInfo.getTotal());
        pageData.setData(pageInfo.getList());
        return pageData;
    }

    @RequestMapping("/delete")
    public void delete(Integer id){
        mapper.deleteByPrimaryKey(id);
    }

    //请假信息
    @RequestMapping("/leavelistpage")
    public String leaveListPage(){
        return "checkwork/leavelist";
    }


    @RequestMapping("/leavelistdata")
    @ResponseBody
    public PageData<LeaveInf> leaveListData(Integer page,Integer limit){
        PageInfo<LeaveInf> pageInfo = service.findLeaveByPage(page, limit);
        PageData<LeaveInf> pageData = new PageData<>();
        pageData.setCount((int) pageInfo.getTotal());
        pageData.setData(pageInfo.getList());
        return pageData;
    }

    @RequestMapping("/editleave")
    public String leaveEditPage(Integer id, Model model){
        LeaveInf leaveInf = leaveInfMapper.selectByPrimaryKey(id);
        model.addAttribute("leave",leaveInf);
        List<LeavestatusInf> leavestatusInfs = leavestatusInfMapper.selectAll();
        model.addAttribute("leavestatusInf_list",leavestatusInfs);
        return "checkwork/edit";
    }

    @RequestMapping("/update")
    public String upadte(LeaveInf leaveInf){
        leaveInfMapper.updateByPrimaryKey(leaveInf);
        return "forward:/checkwork/leavelistpage";
    }


}
