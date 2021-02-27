package com.own.mapper;

import com.own.bean.TrainInf;
import com.own.bean.TrainInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainInfMapper {
    long countByExample(TrainInfExample example);

    int deleteByExample(TrainInfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TrainInf record);

    int insertSelective(TrainInf record);

    List<TrainInf> selectByExample(TrainInfExample example);

    List<TrainInf> selectAll();

    TrainInf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TrainInf record, @Param("example") TrainInfExample example);

    int updateByExample(@Param("record") TrainInf record, @Param("example") TrainInfExample example);

    int updateByPrimaryKeySelective(TrainInf record);

    int updateByPrimaryKey(TrainInf record);
}