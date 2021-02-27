package com.own.mapper;

import com.own.bean.LeavestatusInf;
import com.own.bean.LeavestatusInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LeavestatusInfMapper {
    long countByExample(LeavestatusInfExample example);

    int deleteByExample(LeavestatusInfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LeavestatusInf record);

    int insertSelective(LeavestatusInf record);

    List<LeavestatusInf> selectByExample(LeavestatusInfExample example);

    List<LeavestatusInf> selectAll();

    LeavestatusInf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LeavestatusInf record, @Param("example") LeavestatusInfExample example);

    int updateByExample(@Param("record") LeavestatusInf record, @Param("example") LeavestatusInfExample example);

    int updateByPrimaryKeySelective(LeavestatusInf record);

    int updateByPrimaryKey(LeavestatusInf record);
}