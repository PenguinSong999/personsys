package com.own.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.own.bean.NoticeInf;
import com.own.mapper.NoticeInfMapper;
import com.own.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    private NoticeInfMapper mapper;

    @Override
    public PageInfo<NoticeInf> findNoticeByPage(int page, int limit) {

        PageHelper.startPage(page,limit);
        List<NoticeInf> noticeInfs = mapper.selectAll();
        PageInfo<NoticeInf> pageInfo = new PageInfo<>(noticeInfs);
        return pageInfo;
    }
}
