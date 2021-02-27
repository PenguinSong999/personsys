package com.own.mapper;

import com.own.bean.CheckworkInf;
import com.own.bean.CheckworkInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckworkInfMapper {
    long countByExample(CheckworkInfExample example);

    int deleteByExample(CheckworkInfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CheckworkInf record);

    int insertSelective(CheckworkInf record);

    List<CheckworkInf> selectByExample(CheckworkInfExample example);

    List<CheckworkInf> selectAll();

    CheckworkInf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CheckworkInf record, @Param("example") CheckworkInfExample example);

    int updateByExample(@Param("record") CheckworkInf record, @Param("example") CheckworkInfExample example);

    int updateByPrimaryKeySelective(CheckworkInf record);

    int updateByPrimaryKey(CheckworkInf record);
}