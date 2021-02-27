package com.own.service;

import com.github.pagehelper.PageInfo;
import com.own.bean.NoticeInf;


public interface NoticeService {
    PageInfo<NoticeInf> findNoticeByPage(int page, int limit);
}
