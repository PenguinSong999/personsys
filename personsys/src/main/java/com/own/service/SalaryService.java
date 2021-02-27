package com.own.service;

import com.github.pagehelper.PageInfo;
import com.own.bean.SalaryInf;

public interface SalaryService {

    PageInfo<SalaryInf> findSalaryByPage(Integer page,Integer limit);
}
