package com.graduate.luggagedelivery.rest_server.dao;

import com.graduate.luggagedelivery.rest_server.entity.TTransportOrder;
import com.graduate.luggagedelivery.rest_server.entity.TTransportOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTransportOrderMapper {
    long countByExample(TTransportOrderExample example);

    int deleteByExample(TTransportOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TTransportOrder record);

    int insertSelective(TTransportOrder record);

    List<TTransportOrder> selectByExample(TTransportOrderExample example);

    TTransportOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TTransportOrder record, @Param("example") TTransportOrderExample example);

    int updateByExample(@Param("record") TTransportOrder record, @Param("example") TTransportOrderExample example);

    int updateByPrimaryKeySelective(TTransportOrder record);

    int updateByPrimaryKey(TTransportOrder record);
}