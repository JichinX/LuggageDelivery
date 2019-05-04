package com.graduate.luggagedelivery.rest_server.dao;

import com.graduate.luggagedelivery.rest_server.entity.TLine;
import com.graduate.luggagedelivery.rest_server.entity.TLineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TLineMapper {
    long countByExample(TLineExample example);

    int deleteByExample(TLineExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TLine record);

    int insertSelective(TLine record);

    List<TLine> selectByExample(TLineExample example);

    TLine selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TLine record, @Param("example") TLineExample example);

    int updateByExample(@Param("record") TLine record, @Param("example") TLineExample example);

    int updateByPrimaryKeySelective(TLine record);

    int updateByPrimaryKey(TLine record);
}