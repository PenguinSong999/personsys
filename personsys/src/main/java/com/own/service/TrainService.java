package com.own.service;

import com.github.pagehelper.PageInfo;
import com.own.bean.TrainInf;
import com.own.bean.TraindataInf;

public interface TrainService {

    PageInfo<TrainInf> findTrainByPage(Integer page,Integer limit);

    PageInfo<TraindataInf> findTrainDataByPage(Integer page,Integer limit);
}
