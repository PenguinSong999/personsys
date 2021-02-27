package com.own.service;

import com.github.pagehelper.PageInfo;
import com.own.bean.CheckworkInf;
import com.own.bean.LeaveInf;

public interface CheckWorkService {

    PageInfo<CheckworkInf> findCheckWordByPage(Integer page,Integer limit);

    PageInfo<LeaveInf> findLeaveByPage(Integer page, Integer limit);
}
