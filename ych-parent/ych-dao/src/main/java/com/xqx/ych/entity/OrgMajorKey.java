package com.xqx.ych.entity;

import java.io.Serializable;

public class OrgMajorKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_org_major.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_org_major.org_id
     *
     * @mbggenerated
     */
    private Integer orgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_org_major.major_id
     *
     * @mbggenerated
     */
    private Integer majorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ych_org_major
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_org_major.id
     *
     * @return the value of ych_org_major.id
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_org_major.id
     *
     * @param id the value for ych_org_major.id
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_org_major.org_id
     *
     * @return the value of ych_org_major.org_id
     * @mbggenerated
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_org_major.org_id
     *
     * @param orgId the value for ych_org_major.org_id
     * @mbggenerated
     */
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_org_major.major_id
     *
     * @return the value of ych_org_major.major_id
     * @mbggenerated
     */
    public Integer getMajorId() {
        return majorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_org_major.major_id
     *
     * @param majorId the value for ych_org_major.major_id
     * @mbggenerated
     */
    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_org_major
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
        sb.append(", orgId=").append(orgId);
        sb.append(", majorId=").append(majorId);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_org_major
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
        OrgMajorKey other = (OrgMajorKey) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()))
                && (this.getMajorId() == null ? other.getMajorId() == null : this.getMajorId().equals(other.getMajorId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_org_major
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        result = prime * result + ((getMajorId() == null) ? 0 : getMajorId().hashCode());
        return result;
    }
}