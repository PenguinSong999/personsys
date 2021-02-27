package com.own.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.own.bean.EmployeeInf;
import com.own.mapper.EmployeeInfMapper;
import com.own.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeInfMapper mapper;

    @Override
    public PageInfo<EmployeeInf> findEmployeeByPage(int page, int limit) {
        PageHelper.startPage(page,limit);
        List<EmployeeInf> employeeInfs = mapper.selectAll();
        PageInfo<EmployeeInf> pageInfo = new PageInfo<>(employeeInfs);
        return pageInfo;
    }
}
