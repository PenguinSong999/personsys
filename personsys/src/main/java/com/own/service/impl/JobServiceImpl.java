package com.own.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.own.bean.JobInf;
import com.own.mapper.JobInfMapper;
import com.own.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {
    @Autowired
    private JobInfMapper mapper;

    @Override
    public PageInfo<JobInf> findJobByPage(int page, int limit) {
        PageHelper.startPage(page,limit);
        List<JobInf> jobInfs = mapper.selectAll();
        PageInfo<JobInf> pageInfo = new PageInfo<>(jobInfs);
        return pageInfo;
    }
}
