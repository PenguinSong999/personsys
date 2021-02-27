package com.own.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.own.bean.UserInf;
import com.own.mapper.UserInfMapper;
import com.own.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfMapper mapper;

    @Override
    public UserInf findUserByUsernameAndPassword(String username, String password) {
        return mapper.findUserByUsernameAndPassword(username,password);
    }

    @Override
    public PageInfo<UserInf> findUserByPage(int page, int limit) {
        PageHelper.startPage(page,limit);
        List<UserInf> userInfs = mapper.selectAll();
        PageInfo<UserInf> pageInfo = new PageInfo<>(userInfs);
        return pageInfo;
    }

    @Override
    public PageInfo<UserInf> findUserByCondition(int page, int limit, String type, String content) {
        PageHelper.startPage(page,limit);
        List<UserInf> userInfs = mapper.selectByCondition(type,content);
        PageInfo<UserInf> pageInfo= new PageInfo<>(userInfs);
        return pageInfo;
    }
}
