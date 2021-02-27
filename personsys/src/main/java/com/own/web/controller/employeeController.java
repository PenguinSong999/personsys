package com.own.web.controller;


import com.github.pagehelper.PageInfo;
import com.own.bean.*;
import com.own.mapper.*;
import com.own.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class employeeController {

    @Autowired
    private EmployeeService service;

    @Autowired
    private EmployeeInfMapper mapper;

    @Autowired
    private SexInfMapper sexInfMapper;

    @Autowired
    private DeptInfMapper deptInfMapper;
    @Autowired
    private JobInfMapper jobInfMapper;
    @Autowired
    private EducationInfMapper educationInfMapper;


    @RequestMapping("/listpage")
    public String listPage(){
        return "employee/list";
    }

    @RequestMapping("/listdata")
    @ResponseBody
    public PageData<EmployeeInf> list(Integer page,Integer limit){
        PageInfo<EmployeeInf> pageInfo = service.findEmployeeByPage(page, limit);
        PageData<EmployeeInf> pageData = new PageData<>();
        pageData.setCount((int) pageInfo.getTotal());
        pageData.setData(pageInfo.getList());
        return pageData;
    }

    @RequestMapping("/editEmployee")
    public String editPage(Integer id, Model model){
        EmployeeInf employeeInf = mapper.selectByPrimaryKey(id);
        model.addAttribute("employee",employeeInf);
        List<SexInf> sexInfs = sexInfMapper.selectAll();
        model.addAttribute("sex_list",sexInfs);
        List<DeptInf> deptInfs = deptInfMapper.selectAll();
        model.addAttribute("dept_list",deptInfs);
        List<JobInf> jobInfs = jobInfMapper.selectAll();
        model.addAttribute("job_list",jobInfs);
        List<EducationInf> educationInfs = educationInfMapper.selectAll();
        model.addAttribute("education_list",educationInfs);
        return "employee/edit";
    }

    //更新
    @RequestMapping("/update")
    public String update(EmployeeInf employeeInf,Model model){
        mapper.updateByPrimaryKey(employeeInf);
        EmployeeInf employee = mapper.selectByPrimaryKey(employeeInf.getId());
        model.addAttribute("employee",employee);
        List<SexInf> sexInfs = sexInfMapper.selectAll();
        model.addAttribute("sex_list",sexInfs);
        List<DeptInf> deptInfs = deptInfMapper.selectAll();
        model.addAttribute("dept_list",deptInfs);
        List<JobInf> jobInfs = jobInfMapper.selectAll();
        model.addAttribute("job_list",jobInfs);
        List<EducationInf> educationInfs = educationInfMapper.selectAll();
        model.addAttribute("education_list",educationInfs);
       model.addAttribute("message","编辑成功");
       return "employee/edit";
    }

    //删除
    @RequestMapping("/deleteEmployee")
    public void delete(Integer id){
        mapper.deleteByPrimaryKey(id);
    }

    @RequestMapping("/addpage")
    public String addPage(Model model){
        List<SexInf> sexInfs = sexInfMapper.selectAll();
        model.addAttribute("sex_list",sexInfs);
        List<DeptInf> deptInfs = deptInfMapper.selectAll();
        model.addAttribute("dept_list",deptInfs);
        List<JobInf> jobInfs = jobInfMapper.selectAll();
        model.addAttribute("job_list",jobInfs);
        List<EducationInf> educationInfs = educationInfMapper.selectAll();
        model.addAttribute("education_list",educationInfs);
        return "employee/add";
    }


    //添加
    @RequestMapping("/add")
    public String add(EmployeeInf employeeInf,Model model){
        mapper.insert(employeeInf);
        model.addAttribute("message","添加成功");
        return "employee/add";
    }
}
