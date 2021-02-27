package com.own.mapper;

import com.own.bean.LaborcontractInf;
import com.own.bean.LaborcontractInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LaborcontractInfMapper {
    long countByExample(LaborcontractInfExample example);

    int deleteByExample(LaborcontractInfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LaborcontractInf record);

    int insertSelective(LaborcontractInf record);

    List<LaborcontractInf> selectByExample(LaborcontractInfExample example);
    List<LaborcontractInf> selectAll();

    LaborcontractInf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LaborcontractInf record, @Param("example") LaborcontractInfExample example);

    int updateByExample(@Param("record") LaborcontractInf record, @Param("example") LaborcontractInfExample example);

    int updateByPrimaryKeySelective(LaborcontractInf record);

    int updateByPrimaryKey(LaborcontractInf record);
}