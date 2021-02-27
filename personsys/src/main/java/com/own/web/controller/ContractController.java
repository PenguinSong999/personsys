package com.own.web.controller;


import com.github.pagehelper.PageInfo;
import com.own.bean.*;
import com.own.mapper.*;
import com.own.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    private ContractService service;
    @Autowired
    private ContractInfMapper mapper;
    @Autowired
    private TraincontractInfMapper traincontractInfMapper;
    @Autowired
    private LaborcontractInfMapper laborcontractInfMapper;
    @Autowired
    private ConfidentialitycontractInfMapper confidentialitycontractInfMapper;
    @Autowired
    private StatusInfMapper statusInfMapper;
    @Autowired
    private EmployeeInfMapper employeeInfMapper;
    @Autowired
    private DeptInfMapper deptInfMapper;
    @Autowired
    private JobInfMapper jobInfMapper;

    @RequestMapping("/listpage")
    public String listPage(){
        return "contract/list";
    }


    @RequestMapping("listdata")
    @ResponseBody
    public PageData<ContractInf> list(Integer page,Integer limit){
        PageInfo<ContractInf> pageInfo = service.findContractByPage(page, limit);
        PageData<ContractInf> pageData = new PageData<>();
        pageData.setCount((int) pageInfo.getTotal());
        pageData.setData(pageInfo.getList());
        return pageData;
    }


    //编辑
    @RequestMapping("/editpage")
    public String editPage(Integer id, Model model){
        ContractInf contractInf = mapper.selectByPrimaryKey(id);
        model.addAttribute("contract",contractInf);
        findMsg(model);
        return "contract/edit";
    }

    @RequestMapping("/update")
    public String update(ContractInf contractInf,Model model){
        mapper.updateByPrimaryKey(contractInf);
        ContractInf contractInf1 = mapper.selectByPrimaryKey(contractInf.getId());
        model.addAttribute("contract",contractInf1);
        findMsg(model);
        model.addAttribute("message","编辑成功");
        return "contract/edit";
    }

    //删除
    @RequestMapping("/delete")
    public void delete(Integer id){
        mapper.deleteByPrimaryKey(id);
    }

    //添加
    @RequestMapping("/addpage")
    public  String addPage(Model model){
        findMsg(model);
        return "contract/add";
    }

    @RequestMapping("/add")
    public String add(ContractInf contractInf,Model model){
        mapper.insert(contractInf);
        model.addAttribute("message","添加成功");
        return "contract/add";
    }


    //查询公共信息
    public void findMsg(Model model){
        List<EmployeeInf> employeeInfs = employeeInfMapper.selectAll();
        model.addAttribute("employeeInf_list",employeeInfs);
        List<DeptInf> deptInfs = deptInfMapper.selectAll();
        model.addAttribute("deptInf_list",deptInfs);
        List<JobInf> jobInfs = jobInfMapper.selectAll();
        model.addAttribute("jobInf_list",jobInfs);
        List<TraincontractInf> traincontractInfs = traincontractInfMapper.selectAll();
        model.addAttribute("traincontractInf_list",traincontractInfs);
        List<LaborcontractInf> laborcontractInfs = laborcontractInfMapper.selectAll();
        model.addAttribute("laborcontractInf_list",laborcontractInfs);
        List<ConfidentialitycontractInf> confidentialitycontractInfs = confidentialitycontractInfMapper.selectAll();
        model.addAttribute("confidentialitycontractInf_list",confidentialitycontractInfs);
        List<StatusInf> statusInfs = statusInfMapper.selectAll();
        model.addAttribute("statusInf_list",statusInfs);

    }
}
