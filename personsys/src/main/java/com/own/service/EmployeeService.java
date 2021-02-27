package com.own.service;

import com.github.pagehelper.PageInfo;
import com.own.bean.EmployeeInf;


public interface EmployeeService {
    PageInfo<EmployeeInf> findEmployeeByPage(int page, int limit);
}
