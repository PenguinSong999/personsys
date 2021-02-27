package com.own.mapper;

import com.own.bean.TraindataInf;
import com.own.bean.TraindataInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TraindataInfMapper {
    long countByExample(TraindataInfExample example);

    int deleteByExample(TraindataInfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TraindataInf record);

    int insertSelective(TraindataInf record);

    List<TraindataInf> selectByExample(TraindataInfExample example);

    List<TraindataInf> selectAll();

    TraindataInf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TraindataInf record, @Param("example") TraindataInfExample example);

    int updateByExample(@Param("record") TraindataInf record, @Param("example") TraindataInfExample example);

    int updateByPrimaryKeySelective(TraindataInf record);

    int updateByPrimaryKey(TraindataInf record);
}