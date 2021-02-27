package com.own.mapper;

import com.own.bean.StatusInf;
import com.own.bean.StatusInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusInfMapper {
    long countByExample(StatusInfExample example);

    int deleteByExample(StatusInfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StatusInf record);

    int insertSelective(StatusInf record);

    List<StatusInf> selectByExample(StatusInfExample example);

    StatusInf selectByPrimaryKey(Integer id);

    List<StatusInf> selectAll();

    int updateByExampleSelective(@Param("record") StatusInf record, @Param("example") StatusInfExample example);

    int updateByExample(@Param("record") StatusInf record, @Param("example") StatusInfExample example);

    int updateByPrimaryKeySelective(StatusInf record);

    int updateByPrimaryKey(StatusInf record);
}