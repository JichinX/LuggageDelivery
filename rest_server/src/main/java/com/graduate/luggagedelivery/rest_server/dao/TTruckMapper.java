package com.graduate.luggagedelivery.rest_server.dao;

import com.graduate.luggagedelivery.rest_server.entity.TTruck;
import com.graduate.luggagedelivery.rest_server.entity.TTruckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTruckMapper {
    long countByExample(TTruckExample example);

    int deleteByExample(TTruckExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TTruck record);

    int insertSelective(TTruck record);

    List<TTruck> selectByExample(TTruckExample example);

    TTruck selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TTruck record, @Param("example") TTruckExample example);

    int updateByExample(@Param("record") TTruck record, @Param("example") TTruckExample example);

    int updateByPrimaryKeySelective(TTruck record);

    int updateByPrimaryKey(TTruck record);
}