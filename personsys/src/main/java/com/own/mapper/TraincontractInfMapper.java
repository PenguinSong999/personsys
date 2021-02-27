package com.own.mapper;

import com.own.bean.TraincontractInf;
import com.own.bean.TraincontractInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TraincontractInfMapper {
    long countByExample(TraincontractInfExample example);

    int deleteByExample(TraincontractInfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TraincontractInf record);

    int insertSelective(TraincontractInf record);

    List<TraincontractInf> selectByExample(TraincontractInfExample example);
    List<TraincontractInf> selectAll();

    TraincontractInf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TraincontractInf record, @Param("example") TraincontractInfExample example);

    int updateByExample(@Param("record") TraincontractInf record, @Param("example") TraincontractInfExample example);

    int updateByPrimaryKeySelective(TraincontractInf record);

    int updateByPrimaryKey(TraincontractInf record);
}