package com.own.service;

import com.github.pagehelper.PageInfo;
import com.own.bean.DeptInf;


public interface DeptService {
    PageInfo<DeptInf> findDeptByPage(int page, int limit);
}
