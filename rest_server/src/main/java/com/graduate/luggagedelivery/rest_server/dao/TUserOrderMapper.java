package com.graduate.luggagedelivery.rest_server.dao;

import com.graduate.luggagedelivery.rest_server.entity.TUserOrder;
import com.graduate.luggagedelivery.rest_server.entity.TUserOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserOrderMapper {
    long countByExample(TUserOrderExample example);

    int deleteByExample(TUserOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TUserOrder record);

    int insertSelective(TUserOrder record);

    List<TUserOrder> selectByExample(TUserOrderExample example);

    TUserOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TUserOrder record, @Param("example") TUserOrderExample example);

    int updateByExample(@Param("record") TUserOrder record, @Param("example") TUserOrderExample example);

    int updateByPrimaryKeySelective(TUserOrder record);

    int updateByPrimaryKey(TUserOrder record);
}