package com.own.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.own.bean.DeptInf;
import com.own.bean.UserInf;
import com.own.mapper.DeptInfMapper;
import com.own.mapper.UserInfMapper;
import com.own.service.DeptService;
import com.own.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptInfMapper mapper;


    @Override
    public PageInfo<DeptInf> findDeptByPage(int page, int limit) {
        PageHelper.startPage(page,limit);
        List<DeptInf> deptInfs = mapper.selectAll();
        PageInfo<DeptInf> pageInfo = new PageInfo<>(deptInfs);
        return pageInfo;
    }
}
