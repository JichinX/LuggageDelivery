package com.graduate.luggagedelivery.rest_server.dao;

import com.graduate.luggagedelivery.rest_server.entity.TSysuser;
import com.graduate.luggagedelivery.rest_server.entity.TSysuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSysuserMapper {
    long countByExample(TSysuserExample example);

    int deleteByExample(TSysuserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TSysuser record);

    int insertSelective(TSysuser record);

    List<TSysuser> selectByExample(TSysuserExample example);

    TSysuser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TSysuser record, @Param("example") TSysuserExample example);

    int updateByExample(@Param("record") TSysuser record, @Param("example") TSysuserExample example);

    int updateByPrimaryKeySelective(TSysuser record);

    int updateByPrimaryKey(TSysuser record);
}