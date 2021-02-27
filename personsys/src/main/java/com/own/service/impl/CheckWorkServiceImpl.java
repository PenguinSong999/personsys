package com.own.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.own.bean.CheckworkInf;
import com.own.bean.LeaveInf;
import com.own.mapper.CheckworkInfMapper;
import com.own.mapper.LeaveInfMapper;
import com.own.service.CheckWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckWorkServiceImpl implements CheckWorkService {
    @Autowired
    private CheckworkInfMapper mapper;

    @Autowired
    private LeaveInfMapper leaveInfMapper;
    @Override
    public PageInfo<CheckworkInf> findCheckWordByPage(Integer page, Integer limit) {

        PageHelper.startPage(page,limit);
        List<CheckworkInf> checkworkInfs = mapper.selectAll();
        PageInfo<CheckworkInf> pageInfo = new PageInfo<>(checkworkInfs);
        return pageInfo;
    }

    @Override
    public PageInfo<LeaveInf> findLeaveByPage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<LeaveInf> leaveInfs = leaveInfMapper.selectAll();
        PageInfo<LeaveInf> pageInfo = new PageInfo<>(leaveInfs);
        return pageInfo;
    }
}
