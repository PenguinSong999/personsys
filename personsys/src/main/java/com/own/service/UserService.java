package com.own.service;

import com.github.pagehelper.PageInfo;
import com.own.bean.UserInf;


public interface UserService {
    UserInf findUserByUsernameAndPassword(String username,String password);

    PageInfo<UserInf> findUserByPage(int page, int limit);

    PageInfo<UserInf> findUserByCondition(int page,int limit,String type,String content);
}
