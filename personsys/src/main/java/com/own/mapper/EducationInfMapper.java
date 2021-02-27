package com.own.mapper;

import com.own.bean.EducationInf;
import com.own.bean.EducationInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationInfMapper {
    long countByExample(EducationInfExample example);

    int deleteByExample(EducationInfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EducationInf record);

    int insertSelective(EducationInf record);

    List<EducationInf> selectByExample(EducationInfExample example);

    List<EducationInf> selectAll();

    EducationInf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EducationInf record, @Param("example") EducationInfExample example);

    int updateByExample(@Param("record") EducationInf record, @Param("example") EducationInfExample example);

    int updateByPrimaryKeySelective(EducationInf record);

    int updateByPrimaryKey(EducationInf record);
}