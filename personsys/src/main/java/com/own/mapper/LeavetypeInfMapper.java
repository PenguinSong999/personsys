package com.own.mapper;

import com.own.bean.LeavetypeInf;
import com.own.bean.LeavetypeInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeavetypeInfMapper {
    long countByExample(LeavetypeInfExample example);

    int deleteByExample(LeavetypeInfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LeavetypeInf record);

    int insertSelective(LeavetypeInf record);

    List<LeavetypeInf> selectByExample(LeavetypeInfExample example);

    LeavetypeInf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LeavetypeInf record, @Param("example") LeavetypeInfExample example);

    int updateByExample(@Param("record") LeavetypeInf record, @Param("example") LeavetypeInfExample example);

    int updateByPrimaryKeySelective(LeavetypeInf record);

    int updateByPrimaryKey(LeavetypeInf record);
}