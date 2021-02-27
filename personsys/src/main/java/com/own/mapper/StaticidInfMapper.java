package com.own.mapper;

import com.own.bean.StaticidInf;
import com.own.bean.StaticidInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaticidInfMapper {
    long countByExample(StaticidInfExample example);

    int deleteByExample(StaticidInfExample example);

    int deleteByPrimaryKey(Integer staticid);

    int insert(StaticidInf record);

    int insertSelective(StaticidInf record);

    List<StaticidInf> selectByExample(StaticidInfExample example);

    int updateByExampleSelective(@Param("record") StaticidInf record, @Param("example") StaticidInfExample example);

    int updateByExample(@Param("record") StaticidInf record, @Param("example") StaticidInfExample example);
}