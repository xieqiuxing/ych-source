package com.xqx.ych.entity;

import java.io.Serializable;
import java.util.Date;

public class MqProducerTemp implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_mq_producer_temp.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_mq_producer_temp.group_name
     *
     * @mbggenerated
     */
    private String groupName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_mq_producer_temp.msg_tag
     *
     * @mbggenerated
     */
    private String msgTag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_mq_producer_temp.msg_keys
     *
     * @mbggenerated
     */
    private String msgKeys;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_mq_producer_temp.msg_body
     *
     * @mbggenerated
     */
    private String msgBody;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_mq_producer_temp.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_mq_producer_temp.msg_topic
     *
     * @mbggenerated
     */
    private String msgTopic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ych_mq_producer_temp
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_mq_producer_temp.id
     *
     * @return the value of ych_mq_producer_temp.id
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_mq_producer_temp.id
     *
     * @param id the value for ych_mq_producer_temp.id
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_mq_producer_temp.group_name
     *
     * @return the value of ych_mq_producer_temp.group_name
     * @mbggenerated
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_mq_producer_temp.group_name
     *
     * @param groupName the value for ych_mq_producer_temp.group_name
     * @mbggenerated
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_mq_producer_temp.msg_tag
     *
     * @return the value of ych_mq_producer_temp.msg_tag
     * @mbggenerated
     */
    public String getMsgTag() {
        return msgTag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_mq_producer_temp.msg_tag
     *
     * @param msgTag the value for ych_mq_producer_temp.msg_tag
     * @mbggenerated
     */
    public void setMsgTag(String msgTag) {
        this.msgTag = msgTag == null ? null : msgTag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_mq_producer_temp.msg_keys
     *
     * @return the value of ych_mq_producer_temp.msg_keys
     * @mbggenerated
     */
    public String getMsgKeys() {
        return msgKeys;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_mq_producer_temp.msg_keys
     *
     * @param msgKeys the value for ych_mq_producer_temp.msg_keys
     * @mbggenerated
     */
    public void setMsgKeys(String msgKeys) {
        this.msgKeys = msgKeys == null ? null : msgKeys.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_mq_producer_temp.msg_body
     *
     * @return the value of ych_mq_producer_temp.msg_body
     * @mbggenerated
     */
    public String getMsgBody() {
        return msgBody;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_mq_producer_temp.msg_body
     *
     * @param msgBody the value for ych_mq_producer_temp.msg_body
     * @mbggenerated
     */
    public void setMsgBody(String msgBody) {
        this.msgBody = msgBody == null ? null : msgBody.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_mq_producer_temp.create_time
     *
     * @return the value of ych_mq_producer_temp.create_time
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_mq_producer_temp.create_time
     *
     * @param createTime the value for ych_mq_producer_temp.create_time
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_mq_producer_temp.msg_topic
     *
     * @return the value of ych_mq_producer_temp.msg_topic
     * @mbggenerated
     */
    public String getMsgTopic() {
        return msgTopic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_mq_producer_temp.msg_topic
     *
     * @param msgTopic the value for ych_mq_producer_temp.msg_topic
     * @mbggenerated
     */
    public void setMsgTopic(String msgTopic) {
        this.msgTopic = msgTopic == null ? null : msgTopic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_mq_producer_temp
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", groupName=").append(groupName);
        sb.append(", msgTag=").append(msgTag);
        sb.append(", msgKeys=").append(msgKeys);
        sb.append(", msgBody=").append(msgBody);
        sb.append(", createTime=").append(createTime);
        sb.append(", msgTopic=").append(msgTopic);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_mq_producer_temp
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MqProducerTemp other = (MqProducerTemp) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getGroupName() == null ? other.getGroupName() == null : this.getGroupName().equals(other.getGroupName()))
                && (this.getMsgTag() == null ? other.getMsgTag() == null : this.getMsgTag().equals(other.getMsgTag()))
                && (this.getMsgKeys() == null ? other.getMsgKeys() == null : this.getMsgKeys().equals(other.getMsgKeys()))
                && (this.getMsgBody() == null ? other.getMsgBody() == null : this.getMsgBody().equals(other.getMsgBody()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
                && (this.getMsgTopic() == null ? other.getMsgTopic() == null : this.getMsgTopic().equals(other.getMsgTopic()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_mq_producer_temp
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        result = prime * result + ((getMsgTag() == null) ? 0 : getMsgTag().hashCode());
        result = prime * result + ((getMsgKeys() == null) ? 0 : getMsgKeys().hashCode());
        result = prime * result + ((getMsgBody() == null) ? 0 : getMsgBody().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getMsgTopic() == null) ? 0 : getMsgTopic().hashCode());
        return result;
    }
}