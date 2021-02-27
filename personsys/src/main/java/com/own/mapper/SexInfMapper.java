package com.own.mapper;

import com.own.bean.SexInf;
import com.own.bean.SexInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SexInfMapper {
    long countByExample(SexInfExample example);

    int deleteByExample(SexInfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SexInf record);

    int insertSelective(SexInf record);

    List<SexInf> selectByExample(SexInfExample example);

    List<SexInf> selectAll();

    SexInf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SexInf record, @Param("example") SexInfExample example);

    int updateByExample(@Param("record") SexInf record, @Param("example") SexInfExample example);

    int updateByPrimaryKeySelective(SexInf record);

    int updateByPrimaryKey(SexInf record);
}