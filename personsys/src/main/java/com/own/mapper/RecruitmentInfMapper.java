package com.own.mapper;

import com.own.bean.RecruitmentInf;
import com.own.bean.RecruitmentInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecruitmentInfMapper {
    long countByExample(RecruitmentInfExample example);

    int deleteByExample(RecruitmentInfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RecruitmentInf record);

    int insertSelective(RecruitmentInf record);

    List<RecruitmentInf> selectByExample(RecruitmentInfExample example);

    RecruitmentInf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RecruitmentInf record, @Param("example") RecruitmentInfExample example);

    int updateByExample(@Param("record") RecruitmentInf record, @Param("example") RecruitmentInfExample example);

    int updateByPrimaryKeySelective(RecruitmentInf record);

    int updateByPrimaryKey(RecruitmentInf record);
}