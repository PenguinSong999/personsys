package com.own.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.own.bean.UservisitInf;
import com.own.mapper.UservisitInfMapper;
import com.own.service.VisitLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitLogServiceImpl implements VisitLogService {

    @Autowired
    private UservisitInfMapper mapper;

    @Override
    public PageInfo<UservisitInf> findUserVisitInfByPage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<UservisitInf> uservisitInfs = mapper.selectAll();
        PageInfo<UservisitInf> pageInfo = new PageInfo<>(uservisitInfs);
        return pageInfo;
    }
}
