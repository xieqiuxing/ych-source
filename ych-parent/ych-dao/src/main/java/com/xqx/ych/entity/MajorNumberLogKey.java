package com.xqx.ych.entity;

import java.io.Serializable;

public class MajorNumberLogKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_major_number_log.major_id
     *
     * @mbggenerated
     */
    private Integer majorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_major_number_log.org_id
     *
     * @mbggenerated
     */
    private Integer orgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_major_number_log.enroll_id
     *
     * @mbggenerated
     */
    private String enrollId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ych_major_number_log
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_major_number_log.major_id
     *
     * @return the value of ych_major_number_log.major_id
     * @mbggenerated
     */
    public Integer getMajorId() {
        return majorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_major_number_log.major_id
     *
     * @param majorId the value for ych_major_number_log.major_id
     * @mbggenerated
     */
    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_major_number_log.org_id
     *
     * @return the value of ych_major_number_log.org_id
     * @mbggenerated
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_major_number_log.org_id
     *
     * @param orgId the value for ych_major_number_log.org_id
     * @mbggenerated
     */
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_major_number_log.enroll_id
     *
     * @return the value of ych_major_number_log.enroll_id
     * @mbggenerated
     */
    public String getEnrollId() {
        return enrollId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_major_number_log.enroll_id
     *
     * @param enrollId the value for ych_major_number_log.enroll_id
     * @mbggenerated
     */
    public void setEnrollId(String enrollId) {
        this.enrollId = enrollId == null ? null : enrollId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_major_number_log
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", majorId=").append(majorId);
        sb.append(", orgId=").append(orgId);
        sb.append(", enrollId=").append(enrollId);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_major_number_log
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
        MajorNumberLogKey other = (MajorNumberLogKey) that;
        return (this.getMajorId() == null ? other.getMajorId() == null : this.getMajorId().equals(other.getMajorId()))
                && (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()))
                && (this.getEnrollId() == null ? other.getEnrollId() == null : this.getEnrollId().equals(other.getEnrollId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_major_number_log
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMajorId() == null) ? 0 : getMajorId().hashCode());
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        result = prime * result + ((getEnrollId() == null) ? 0 : getEnrollId().hashCode());
        return result;
    }
}