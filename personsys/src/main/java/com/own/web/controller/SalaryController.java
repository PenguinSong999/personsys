package com.own.web.controller;

import com.github.pagehelper.PageInfo;
import com.own.bean.*;
import com.own.mapper.DeptInfMapper;
import com.own.mapper.EmployeeInfMapper;
import com.own.mapper.JobInfMapper;
import com.own.mapper.SalaryInfMapper;
import com.own.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/salary")
public class SalaryController {

    @Autowired
    private SalaryService service;

    @Autowired
    private SalaryInfMapper mapper;

    @Autowired
    private DeptInfMapper deptInfMapper;

    @Autowired
    private EmployeeInfMapper employeeInfMapper;
    @Autowired
    private JobInfMapper jobInfMapper;

    @RequestMapping("/listpage")
    public String listPage(){
        return "salary/list";
    }

    @RequestMapping("/listdata")
    @ResponseBody
    public PageData<SalaryInf> list(Integer page,Integer limit){
        PageInfo<SalaryInf> pageInfo = service.findSalaryByPage(page, limit);
        PageData<SalaryInf> salaryInfPageData = new PageData<>();
        salaryInfPageData.setCount((int) pageInfo.getTotal());
        salaryInfPageData.setData(pageInfo.getList());
        return salaryInfPageData;
    }

    @RequestMapping("/editpage")
    public String editPage(Integer id, Model model){
        SalaryInf salaryInf = mapper.selectByPrimaryKey(id);
        model.addAttribute("salary",salaryInf);
        findMsg(model);
        return "salary/edit";
    }
    //更新
    @RequestMapping("/update")
    public String update(SalaryInf salaryInf,Model model){
        mapper.updateByPrimaryKey(salaryInf);
        SalaryInf salary = mapper.selectByPrimaryKey(salaryInf.getId());
        model.addAttribute("salary",salary);
        findMsg(model);
        model.addAttribute("message","编辑成功");
        return "salary/edit";
    }

    //删除
    @RequestMapping("/delete")
    public void delete(Integer id){
        mapper.deleteByPrimaryKey(id);
    }

    //添加
    @RequestMapping("/addpage")
    public String addPage(Model model){
        findMsg(model);
        return "salary/add";
    }

    @RequestMapping("/add")
    public String add(SalaryInf salaryInf,Model model){
        mapper.insert(salaryInf);
        findMsg(model);
        model.addAttribute("message","添加成功");
        return "salary/add";
    }

    //查询公共信息
    public void  findMsg(Model model){
        List<DeptInf> deptInfs = deptInfMapper.selectAll();
        model.addAttribute("deptInf_list",deptInfs);
        List<EmployeeInf> employeeInfs = employeeInfMapper.selectAll();
        model.addAttribute("employeeInf_list",employeeInfs);
        List<JobInf> jobInfs = jobInfMapper.selectAll();
        model.addAttribute("jobInf_list",jobInfs);
    }

}
