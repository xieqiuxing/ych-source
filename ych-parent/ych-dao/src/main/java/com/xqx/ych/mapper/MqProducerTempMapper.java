package com.xqx.ych.mapper;

import com.xqx.ych.entity.MqProducerTemp;
import com.xqx.ych.entity.MqProducerTempExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MqProducerTempMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_mq_producer_temp
     *
     * @mbggenerated
     */
    int countByExample(MqProducerTempExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_mq_producer_temp
     *
     * @mbggenerated
     */
    int deleteByExample(MqProducerTempExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_mq_producer_temp
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_mq_producer_temp
     *
     * @mbggenerated
     */
    int insert(MqProducerTemp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_mq_producer_temp
     *
     * @mbggenerated
     */
    int insertSelective(MqProducerTemp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_mq_producer_temp
     *
     * @mbggenerated
     */
    List<MqProducerTemp> selectByExample(MqProducerTempExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_mq_producer_temp
     *
     * @mbggenerated
     */
    MqProducerTemp selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_mq_producer_temp
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MqProducerTemp record, @Param("example") MqProducerTempExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_mq_producer_temp
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MqProducerTemp record, @Param("example") MqProducerTempExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_mq_producer_temp
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MqProducerTemp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_mq_producer_temp
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MqProducerTemp record);
}