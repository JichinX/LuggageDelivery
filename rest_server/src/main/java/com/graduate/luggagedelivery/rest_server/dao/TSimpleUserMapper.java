package com.graduate.luggagedelivery.rest_server.dao;

import com.graduate.luggagedelivery.rest_server.entity.TSimpleUser;
import com.graduate.luggagedelivery.rest_server.entity.TSimpleUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSimpleUserMapper {
    long countByExample(TSimpleUserExample example);

    int deleteByExample(TSimpleUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TSimpleUser record);

    int insertSelective(TSimpleUser record);

    List<TSimpleUser> selectByExample(TSimpleUserExample example);

    TSimpleUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TSimpleUser record, @Param("example") TSimpleUserExample example);

    int updateByExample(@Param("record") TSimpleUser record, @Param("example") TSimpleUserExample example);

    int updateByPrimaryKeySelective(TSimpleUser record);

    int updateByPrimaryKey(TSimpleUser record);
}