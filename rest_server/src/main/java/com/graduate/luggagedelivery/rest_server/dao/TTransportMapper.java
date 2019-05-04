package com.graduate.luggagedelivery.rest_server.dao;

import com.graduate.luggagedelivery.rest_server.entity.TTransport;
import com.graduate.luggagedelivery.rest_server.entity.TTransportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTransportMapper {
    long countByExample(TTransportExample example);

    int deleteByExample(TTransportExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TTransport record);

    int insertSelective(TTransport record);

    List<TTransport> selectByExample(TTransportExample example);

    TTransport selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TTransport record, @Param("example") TTransportExample example);

    int updateByExample(@Param("record") TTransport record, @Param("example") TTransportExample example);

    int updateByPrimaryKeySelective(TTransport record);

    int updateByPrimaryKey(TTransport record);
}