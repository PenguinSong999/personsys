package com.own.mapper;

import com.own.bean.SalaryInf;
import com.own.bean.SalaryInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryInfMapper {
    long countByExample(SalaryInfExample example);

    int deleteByExample(SalaryInfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SalaryInf record);

    int insertSelective(SalaryInf record);

    List<SalaryInf> selectByExample(SalaryInfExample example);

    List<SalaryInf> selectAll();

    SalaryInf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SalaryInf record, @Param("example") SalaryInfExample example);

    int updateByExample(@Param("record") SalaryInf record, @Param("example") SalaryInfExample example);

    int updateByPrimaryKeySelective(SalaryInf record);

    int updateByPrimaryKey(SalaryInf record);
}