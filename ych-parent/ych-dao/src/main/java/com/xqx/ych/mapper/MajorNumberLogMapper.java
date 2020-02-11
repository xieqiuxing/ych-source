package com.xqx.ych.mapper;

import com.xqx.ych.entity.MajorNumberLog;
import com.xqx.ych.entity.MajorNumberLogExample;
import com.xqx.ych.entity.MajorNumberLogKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MajorNumberLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_major_number_log
     *
     * @mbggenerated
     */
    int countByExample(MajorNumberLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_major_number_log
     *
     * @mbggenerated
     */
    int deleteByExample(MajorNumberLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_major_number_log
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(MajorNumberLogKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_major_number_log
     *
     * @mbggenerated
     */
    int insert(MajorNumberLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_major_number_log
     *
     * @mbggenerated
     */
    int insertSelective(MajorNumberLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_major_number_log
     *
     * @mbggenerated
     */
    List<MajorNumberLog> selectByExample(MajorNumberLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_major_number_log
     *
     * @mbggenerated
     */
    MajorNumberLog selectByPrimaryKey(MajorNumberLogKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_major_number_log
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MajorNumberLog record, @Param("example") MajorNumberLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_major_number_log
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MajorNumberLog record, @Param("example") MajorNumberLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_major_number_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MajorNumberLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_major_number_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MajorNumberLog record);

    /**
     * 添加库存
     *
     * @param majorId
     * @param quot
     * @return
     */
    int addQuot(@Param("majorId") Integer majorId, @Param("quot") Integer quot);

    /**
     * 减库存
     *
     * @param majorId
     * @param quot
     * @return
     */
    int deleteQuot(@Param("majorId") Integer majorId, @Param("quot") Integer quot);
}