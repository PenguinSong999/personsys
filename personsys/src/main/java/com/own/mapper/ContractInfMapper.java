package com.own.mapper;

import com.own.bean.ContractInf;
import com.own.bean.ContractInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractInfMapper {
    long countByExample(ContractInfExample example);

    int deleteByExample(ContractInfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ContractInf record);

    int insertSelective(ContractInf record);

    List<ContractInf> selectByExample(ContractInfExample example);

    List<ContractInf> selectAll();

    ContractInf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ContractInf record, @Param("example") ContractInfExample example);

    int updateByExample(@Param("record") ContractInf record, @Param("example") ContractInfExample example);

    int updateByPrimaryKeySelective(ContractInf record);

    int updateByPrimaryKey(ContractInf record);
}