package com.own.service;

import com.github.pagehelper.PageInfo;
import com.own.bean.JobInf;


public interface JobService {
    PageInfo<JobInf> findJobByPage(int page, int limit);
}
