package com.own.mapper;

import com.own.bean.ResumeInf;
import com.own.bean.ResumeInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResumeInfMapper {
    long countByExample(ResumeInfExample example);

    int deleteByExample(ResumeInfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ResumeInf record);

    int insertSelective(ResumeInf record);

    List<ResumeInf> selectByExample(ResumeInfExample example);

    ResumeInf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ResumeInf record, @Param("example") ResumeInfExample example);

    int updateByExample(@Param("record") ResumeInf record, @Param("example") ResumeInfExample example);

    int updateByPrimaryKeySelective(ResumeInf record);

    int updateByPrimaryKey(ResumeInf record);
}