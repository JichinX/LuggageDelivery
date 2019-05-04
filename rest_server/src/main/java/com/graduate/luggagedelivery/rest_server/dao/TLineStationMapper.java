package com.graduate.luggagedelivery.rest_server.dao;

import com.graduate.luggagedelivery.rest_server.entity.TLineStation;
import com.graduate.luggagedelivery.rest_server.entity.TLineStationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TLineStationMapper {
    long countByExample(TLineStationExample example);

    int deleteByExample(TLineStationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TLineStation record);

    int insertSelective(TLineStation record);

    List<TLineStation> selectByExample(TLineStationExample example);

    TLineStation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TLineStation record, @Param("example") TLineStationExample example);

    int updateByExample(@Param("record") TLineStation record, @Param("example") TLineStationExample example);

    int updateByPrimaryKeySelective(TLineStation record);

    int updateByPrimaryKey(TLineStation record);
}