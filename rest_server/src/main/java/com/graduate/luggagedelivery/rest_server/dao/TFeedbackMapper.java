package com.graduate.luggagedelivery.rest_server.dao;

import com.graduate.luggagedelivery.rest_server.entity.TFeedback;
import com.graduate.luggagedelivery.rest_server.entity.TFeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TFeedbackMapper {
    long countByExample(TFeedbackExample example);

    int deleteByExample(TFeedbackExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TFeedback record);

    int insertSelective(TFeedback record);

    List<TFeedback> selectByExampleWithBLOBs(TFeedbackExample example);

    List<TFeedback> selectByExample(TFeedbackExample example);

    TFeedback selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TFeedback record, @Param("example") TFeedbackExample example);

    int updateByExampleWithBLOBs(@Param("record") TFeedback record, @Param("example") TFeedbackExample example);

    int updateByExample(@Param("record") TFeedback record, @Param("example") TFeedbackExample example);

    int updateByPrimaryKeySelective(TFeedback record);

    int updateByPrimaryKeyWithBLOBs(TFeedback record);

    int updateByPrimaryKey(TFeedback record);
}