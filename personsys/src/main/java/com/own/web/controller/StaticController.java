package com.own.web.controller;

import com.own.bean.BusinessInf;
import com.own.bean.Data;
import com.own.mapper.BusinessInfMapper;
import com.own.mapper.EmployeeInfMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
@RequestMapping("/static")
public class StaticController {
    @Autowired
    private EmployeeInfMapper employeeInfMapper;
    @Autowired
    private BusinessInfMapper businessInfMapper;

    @RequestMapping("/show")
    public String show(){
        return "statistics/statistics";
    }

    //员工男女比例统计
    @RequestMapping("/echartsData")
    @ResponseBody
    public List  echartsData(){

        long boynum = employeeInfMapper.findCountBySexId(1);
        long girlnum = employeeInfMapper.findCountBySexId(2);
        long other = employeeInfMapper.findCount() - boynum - girlnum;
        List<Map<String, Object>> list = new ArrayList<>();
        HashMap<String, Object> map = new HashMap<>();
        map.put("value",boynum);
        map.put("name","男");
        list.add(map);
        HashMap<String, Object> map1 = new HashMap<>();
        map1.put("value",girlnum);
        map1.put("name","女");
        list.add(map1);
        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("value",other);
        map2.put("name","其他");
        list.add(map2);
        return list;
    }

    //各职位员工人数
    @RequestMapping("/echartsData1")
    @ResponseBody
    public List echartsData1(){
        ArrayList<Data> list = new ArrayList<>();
        long zy = employeeInfMapper.findCountByJobId(1);  //职员
        Data data = new Data(zy,"职员");
        list.add(data);

        long java = employeeInfMapper.findCountByJobId(2);
        Data data1 = new Data(java, "Java开发工程师");
        list.add(data1);

        long javaz = employeeInfMapper.findCountByJobId(3);
        Data data2 = new Data(javaz, "Java中级开发工程师");
        list.add(data2);

        long jg = employeeInfMapper.findCountByJobId(6);
        Data data3 = new Data(jg, "架构师");
        list.add(data3);

        long zg = employeeInfMapper.findCountByJobId(7);
        Data data4 = new Data(zg, "主管");
        list.add(data4);

        long zj = employeeInfMapper.findCountByJobId(9);
        Data data5 = new Data(zj, "总经理");
        list.add(data5);

        return list;
    }


    //一周处理业务折线统计
    @RequestMapping("/echartsData2")
    @ResponseBody
    public List echartsData2(){
        List<BusinessInf> businessInfs = businessInfMapper.selectAll();
        return businessInfs;
    }

    //地方分布
    @RequestMapping("/echartsData3")
    @ResponseBody
    public List echartsData3(){
        ArrayList<Data> list = new ArrayList<>();
        long beijing = employeeInfMapper.findCountlikeAddress("北京%");
        Data data1 = new Data(beijing, "北京");
        list.add(data1);

        long henan = employeeInfMapper.findCountlikeAddress("河南%");
        Data data2 = new Data(henan, "河南");
        list.add(data2);

        long shanghai = employeeInfMapper.findCountlikeAddress("上海%");
        Data data3 = new Data(shanghai, "上海");
        list.add(data3);

        long zhejiang = employeeInfMapper.findCountlikeAddress("浙江%");
        Data data4 = new Data(zhejiang, "浙江");
        list.add(data4);

        long gansu = employeeInfMapper.findCountlikeAddress("甘肃%");
        Data data5 = new Data(gansu, "甘肃");
        list.add(data5);

        return list;
    }
}
