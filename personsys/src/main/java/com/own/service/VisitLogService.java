package com.own.service;

import com.github.pagehelper.PageInfo;
import com.own.bean.UservisitInf;

public interface VisitLogService {

    public PageInfo<UservisitInf> findUserVisitInfByPage(Integer page,Integer limit);
}
