package com.own.mapper;

import com.own.bean.CodeInf;
import com.own.bean.CodeInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CodeInfMapper {
    long countByExample(CodeInfExample example);

    int deleteByExample(CodeInfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CodeInf record);

    int insertSelective(CodeInf record);

    List<CodeInf> selectByExample(CodeInfExample example);

    CodeInf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CodeInf record, @Param("example") CodeInfExample example);

    int updateByExample(@Param("record") CodeInf record, @Param("example") CodeInfExample example);

    int updateByPrimaryKeySelective(CodeInf record);

    int updateByPrimaryKey(CodeInf record);
}