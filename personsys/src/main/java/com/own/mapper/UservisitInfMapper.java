package com.own.mapper;

import com.own.bean.UservisitInf;
import com.own.bean.UservisitInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UservisitInfMapper {
    long countByExample(UservisitInfExample example);

    int deleteByExample(UservisitInfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UservisitInf record);

    int insertSelective(UservisitInf record);

    List<UservisitInf> selectByExample(UservisitInfExample example);

    List<UservisitInf> selectAll();

    UservisitInf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UservisitInf record, @Param("example") UservisitInfExample example);

    int updateByExample(@Param("record") UservisitInf record, @Param("example") UservisitInfExample example);

    int updateByPrimaryKeySelective(UservisitInf record);

    int updateByPrimaryKey(UservisitInf record);
}