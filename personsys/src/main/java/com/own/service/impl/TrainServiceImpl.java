package com.own.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.own.bean.TrainInf;
import com.own.bean.TraindataInf;
import com.own.mapper.TrainInfMapper;
import com.own.mapper.TraindataInfMapper;
import com.own.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainServiceImpl implements TrainService {

    @Autowired
    private TrainInfMapper mapper;
    @Autowired
    private TraindataInfMapper traindataInfMapper;
    @Override
    public PageInfo<TrainInf> findTrainByPage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<TrainInf> trainInfs = mapper.selectAll();
        PageInfo<TrainInf> pageInfo = new PageInfo<>(trainInfs);
        return pageInfo;
    }

    @Override
    public PageInfo<TraindataInf> findTrainDataByPage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<TraindataInf> traindataInfs = traindataInfMapper.selectAll();
        PageInfo<TraindataInf> pageInfo = new PageInfo<>(traindataInfs);
        return pageInfo;
    }
}
