package com.own.mapper;

import com.own.bean.BusinessInf;
import com.own.bean.BusinessInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessInfMapper {
    long countByExample(BusinessInfExample example);

    int deleteByExample(BusinessInfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusinessInf record);

    int insertSelective(BusinessInf record);

    List<BusinessInf> selectByExample(BusinessInfExample example);

    List<BusinessInf> selectAll();

    BusinessInf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusinessInf record, @Param("example") BusinessInfExample example);

    int updateByExample(@Param("record") BusinessInf record, @Param("example") BusinessInfExample example);

    int updateByPrimaryKeySelective(BusinessInf record);

    int updateByPrimaryKey(BusinessInf record);
}