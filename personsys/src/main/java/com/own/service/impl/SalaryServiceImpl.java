package com.own.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.own.bean.SalaryInf;
import com.own.mapper.SalaryInfMapper;
import com.own.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryServiceImpl implements SalaryService {

    @Autowired
    public SalaryInfMapper mapper;

    @Override
    public PageInfo<SalaryInf> findSalaryByPage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<SalaryInf> salaryInfs = mapper.selectAll();
        PageInfo<SalaryInf> pageInfo = new PageInfo<>(salaryInfs);
        return pageInfo;
    }
}
