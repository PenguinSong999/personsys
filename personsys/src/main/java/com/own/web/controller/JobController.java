package com.own.web.controller;


import com.github.pagehelper.PageInfo;
import com.own.bean.JobInf;
import com.own.bean.PageData;
import com.own.mapper.JobInfMapper;
import com.own.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/job")
public class JobController {
    @Autowired
    private JobService service;
    @Autowired
    private JobInfMapper mapper;

    @RequestMapping("/listpage")
    public String listpage(){
        return "job/list";
    }

    @RequestMapping("/listdata")
    @ResponseBody
    public PageData<JobInf> lsitData(Integer page, Integer limit){
        PageInfo<JobInf> pageInfo = service.findJobByPage(page, limit);
        PageData<JobInf> pageData = new PageData<>();
        pageData.setCount((int) pageInfo.getTotal());
        pageData.setData(pageInfo.getList());
        return pageData;
    }

    //删除
    @RequestMapping("/deletejob")
    public void delete(Integer id){
        mapper.deleteByPrimaryKey(id);
    }


    @RequestMapping("/editjob")
    public String edit(Integer id, Model model){
        JobInf jobInf = mapper.selectByPrimaryKey(id);
        model.addAttribute("job",jobInf);
        return "job/edit";
    }

    //更新
    @RequestMapping("/update")
    public String update(JobInf jobInf,Model model){
        mapper.updateByPrimaryKey(jobInf);
        model.addAttribute("message","编辑成功");
        return "job/edit";
    }

    @RequestMapping("/addpage")
    public String addpage(){
        return "job/add";
    }

    //添加
    @RequestMapping("/add")
    public String add(JobInf jobInf,Model model){
        mapper.insert(jobInf);
        model.addAttribute("message","添加成功");
        return "job/add";
    }
}
