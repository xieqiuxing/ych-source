package com.xqx.ych.mapper;

import com.xqx.ych.entity.MqConsumerLog;
import com.xqx.ych.entity.MqConsumerLogExample;
import com.xqx.ych.entity.MqConsumerLogKey;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MqConsumerLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_mq_consumer_log
     *
     * @mbggenerated
     */
    int countByExample(MqConsumerLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_mq_consumer_log
     *
     * @mbggenerated
     */
    int deleteByExample(MqConsumerLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_mq_consumer_log
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(MqConsumerLogKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_mq_consumer_log
     *
     * @mbggenerated
     */
    int insert(MqConsumerLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_mq_consumer_log
     *
     * @mbggenerated
     */
    int insertSelective(MqConsumerLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_mq_consumer_log
     *
     * @mbggenerated
     */
    List<MqConsumerLog> selectByExample(MqConsumerLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_mq_consumer_log
     *
     * @mbggenerated
     */
    MqConsumerLog selectByPrimaryKey(MqConsumerLogKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_mq_consumer_log
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MqConsumerLog record, @Param("example") MqConsumerLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_mq_consumer_log
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MqConsumerLog record, @Param("example") MqConsumerLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_mq_consumer_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MqConsumerLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_mq_consumer_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MqConsumerLog record);
}