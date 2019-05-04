package com.graduate.luggagedelivery.rest_server.dao;

import com.graduate.luggagedelivery.rest_server.entity.TFlowLog;
import com.graduate.luggagedelivery.rest_server.entity.TFlowLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TFlowLogMapper {
    long countByExample(TFlowLogExample example);

    int deleteByExample(TFlowLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TFlowLog record);

    int insertSelective(TFlowLog record);

    List<TFlowLog> selectByExample(TFlowLogExample example);

    TFlowLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TFlowLog record, @Param("example") TFlowLogExample example);

    int updateByExample(@Param("record") TFlowLog record, @Param("example") TFlowLogExample example);

    int updateByPrimaryKeySelective(TFlowLog record);

    int updateByPrimaryKey(TFlowLog record);
}