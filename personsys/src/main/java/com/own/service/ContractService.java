package com.own.service;

import com.github.pagehelper.PageInfo;
import com.own.bean.ContractInf;

public interface ContractService {

    PageInfo<ContractInf> findContractByPage(Integer page,Integer limit);
}
