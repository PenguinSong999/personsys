package com.own.mapper;

import com.own.bean.JobInf;
import com.own.bean.JobInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface JobInfMapper {
    long countByExample(JobInfExample example);

    int deleteByExample(JobInfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JobInf record);

    int insertSelective(JobInf record);

    List<JobInf> selectByExample(JobInfExample example);

    List<JobInf> selectAll();

    JobInf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JobInf record, @Param("example") JobInfExample example);

    int updateByExample(@Param("record") JobInf record, @Param("example") JobInfExample example);

    int updateByPrimaryKeySelective(JobInf record);

    int updateByPrimaryKey(JobInf record);
}