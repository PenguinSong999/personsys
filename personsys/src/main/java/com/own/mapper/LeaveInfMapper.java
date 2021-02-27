package com.own.mapper;

import com.own.bean.LeaveInf;
import com.own.bean.LeaveInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveInfMapper {
    long countByExample(LeaveInfExample example);

    int deleteByExample(LeaveInfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LeaveInf record);

    int insertSelective(LeaveInf record);

    List<LeaveInf> selectByExample(LeaveInfExample example);

    List<LeaveInf> selectAll();

    LeaveInf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LeaveInf record, @Param("example") LeaveInfExample example);

    int updateByExample(@Param("record") LeaveInf record, @Param("example") LeaveInfExample example);

    int updateByPrimaryKeySelective(LeaveInf record);

    int updateByPrimaryKey(LeaveInf record);
}