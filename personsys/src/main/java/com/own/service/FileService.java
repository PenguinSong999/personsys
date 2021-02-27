package com.own.service;

import com.github.pagehelper.PageInfo;
import com.own.bean.DocumentInf;

public interface FileService {

    PageInfo<DocumentInf> finddocumentByPage(Integer page, Integer limit);
}
