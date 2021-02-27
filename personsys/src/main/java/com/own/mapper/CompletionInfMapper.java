package com.own.mapper;

import com.own.bean.CompletionInf;
import com.own.bean.CompletionInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompletionInfMapper {
    long countByExample(CompletionInfExample example);

    int deleteByExample(CompletionInfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CompletionInf record);

    int insertSelective(CompletionInf record);

    List<CompletionInf> selectByExample(CompletionInfExample example);

    CompletionInf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CompletionInf record, @Param("example") CompletionInfExample example);

    int updateByExample(@Param("record") CompletionInf record, @Param("example") CompletionInfExample example);

    int updateByPrimaryKeySelective(CompletionInf record);

    int updateByPrimaryKey(CompletionInf record);
}