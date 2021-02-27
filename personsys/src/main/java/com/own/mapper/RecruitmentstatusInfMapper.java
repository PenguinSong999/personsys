package com.own.mapper;

import com.own.bean.RecruitmentstatusInf;
import com.own.bean.RecruitmentstatusInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecruitmentstatusInfMapper {
    long countByExample(RecruitmentstatusInfExample example);

    int deleteByExample(RecruitmentstatusInfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RecruitmentstatusInf record);

    int insertSelective(RecruitmentstatusInf record);

    List<RecruitmentstatusInf> selectByExample(RecruitmentstatusInfExample example);

    RecruitmentstatusInf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RecruitmentstatusInf record, @Param("example") RecruitmentstatusInfExample example);

    int updateByExample(@Param("record") RecruitmentstatusInf record, @Param("example") RecruitmentstatusInfExample example);

    int updateByPrimaryKeySelective(RecruitmentstatusInf record);

    int updateByPrimaryKey(RecruitmentstatusInf record);
}