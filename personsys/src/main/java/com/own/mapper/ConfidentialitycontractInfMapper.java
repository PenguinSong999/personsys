package com.own.mapper;

import com.own.bean.ConfidentialitycontractInf;
import com.own.bean.ConfidentialitycontractInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfidentialitycontractInfMapper {
    long countByExample(ConfidentialitycontractInfExample example);

    int deleteByExample(ConfidentialitycontractInfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConfidentialitycontractInf record);

    int insertSelective(ConfidentialitycontractInf record);

    List<ConfidentialitycontractInf> selectByExample(ConfidentialitycontractInfExample example);

    List<ConfidentialitycontractInf> selectAll();

    ConfidentialitycontractInf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConfidentialitycontractInf record, @Param("example") ConfidentialitycontractInfExample example);

    int updateByExample(@Param("record") ConfidentialitycontractInf record, @Param("example") ConfidentialitycontractInfExample example);

    int updateByPrimaryKeySelective(ConfidentialitycontractInf record);

    int updateByPrimaryKey(ConfidentialitycontractInf record);
}