package com.own.mapper;

import com.own.bean.UserInf;
import com.own.bean.UserInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfMapper {
    long countByExample(UserInfExample example);

    int deleteByExample(UserInfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserInf record);

    int insertSelective(UserInf record);

    List<UserInf> selectAll();

    List<UserInf> selectByCondition(@Param("type") String type,@Param("content") String content);

    UserInf selectByEmail(String email);

    List<UserInf> selectByExample(UserInfExample example);

    UserInf selectByPrimaryKey(Integer id);

    UserInf selectByloginname(String loginname);

    int updateByExampleSelective(@Param("record") UserInf record, @Param("example") UserInfExample example);

    int updateByExample(@Param("record") UserInf record, @Param("example") UserInfExample example);

    int updateByPrimaryKeySelective(UserInf record);

    int updateByPrimaryKey(UserInf record);

    int updateByLoginname(@Param("loginname") String loginname,@Param("password") String password);

    UserInf findUserByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}