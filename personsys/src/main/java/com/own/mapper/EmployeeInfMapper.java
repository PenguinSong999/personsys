package com.own.mapper;

import com.own.bean.EmployeeInf;
import com.own.bean.EmployeeInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeInfMapper {
    long countByExample(EmployeeInfExample example);

    long findCountBySexId(int sexId);

    long findCountByJobId(int jobId);

    long findCountlikeAddress(String address);

    long findCount();

    int deleteByExample(EmployeeInfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeInf record);

    int insertSelective(EmployeeInf record);

    List<EmployeeInf> selectByExample(EmployeeInfExample example);

    List<EmployeeInf> selectAll();


    EmployeeInf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmployeeInf record, @Param("example") EmployeeInfExample example);

    int updateByExample(@Param("record") EmployeeInf record, @Param("example") EmployeeInfExample example);

    int updateByPrimaryKeySelective(EmployeeInf record);

    int updateByPrimaryKey(EmployeeInf record);
}