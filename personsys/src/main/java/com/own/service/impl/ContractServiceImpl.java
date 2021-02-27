package com.own.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.own.bean.ContractInf;
import com.own.mapper.ContractInfMapper;
import com.own.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceImpl implements ContractService {

    @Autowired
    private ContractInfMapper mapper;
    @Override
    public PageInfo<ContractInf> findContractByPage(Integer page, Integer limit) {

        PageHelper.startPage(page,limit);
        List<ContractInf> contractInfs = mapper.selectAll();
        PageInfo<ContractInf> pageInfo = new PageInfo<>(contractInfs);
        return pageInfo;
    }
}
