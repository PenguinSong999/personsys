package com.own.mapper;

import com.own.bean.JobtypeInf;
import com.own.bean.JobtypeInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobtypeInfMapper {
    long countByExample(JobtypeInfExample example);

    int deleteByExample(JobtypeInfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JobtypeInf record);

    int insertSelective(JobtypeInf record);

    List<JobtypeInf> selectByExample(JobtypeInfExample example);

    JobtypeInf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JobtypeInf record, @Param("example") JobtypeInfExample example);

    int updateByExample(@Param("record") JobtypeInf record, @Param("example") JobtypeInfExample example);

    int updateByPrimaryKeySelective(JobtypeInf record);

    int updateByPrimaryKey(JobtypeInf record);
}