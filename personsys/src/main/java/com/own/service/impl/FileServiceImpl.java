package com.own.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.own.bean.DocumentInf;
import com.own.mapper.DocumentInfMapper;
import com.own.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements FileService {

    @Autowired
    private DocumentInfMapper mapper;

    @Override
    public PageInfo<DocumentInf> finddocumentByPage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<DocumentInf> documentInfs = mapper.selectAll();
        PageInfo<DocumentInf> pageInfo = new PageInfo<>(documentInfs);
        return pageInfo;
    }
}
