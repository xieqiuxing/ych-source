package com.xqx.ych.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Enroll implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_enroll.enroll_id
     *
     * @mbggenerated
     */
    private String enrollId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_enroll.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_enroll.enroll_status
     *
     * @mbggenerated
     */
    private String enrollStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_enroll.pay_status
     *
     * @mbggenerated
     */
    private String payStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_enroll.shipping_status
     *
     * @mbggenerated
     */
    private String shippingStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_enroll.address
     *
     * @mbggenerated
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_enroll.consignee
     *
     * @mbggenerated
     */
    private String consignee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_enroll.org_major_id
     *
     * @mbggenerated
     */
    private Integer orgMajorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_enroll.org_major_number
     *
     * @mbggenerated
     */
    private Integer orgMajorNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_enroll.org_major_tuition
     *
     * @mbggenerated
     */
    private BigDecimal orgMajorTuition;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_enroll.grant_account
     *
     * @mbggenerated
     */
    private BigDecimal grantAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_enroll.coupon_id
     *
     * @mbggenerated
     */
    private String couponId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_enroll.coupon_paid
     *
     * @mbggenerated
     */
    private BigDecimal couponPaid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_enroll.enroll_account
     *
     * @mbggenerated
     */
    private BigDecimal enrollAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_enroll.prepaid_amount
     *
     * @mbggenerated
     */
    private BigDecimal prepaidAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_enroll.pay_amount
     *
     * @mbggenerated
     */
    private BigDecimal payAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_enroll.pay_time
     *
     * @mbggenerated
     */
    private Date payTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_enroll.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ych_enroll
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_enroll.enroll_id
     *
     * @return the value of ych_enroll.enroll_id
     * @mbggenerated
     */
    public String getEnrollId() {
        return enrollId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_enroll.enroll_id
     *
     * @param enrollId the value for ych_enroll.enroll_id
     * @mbggenerated
     */
    public void setEnrollId(String enrollId) {
        this.enrollId = enrollId == null ? null : enrollId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_enroll.user_id
     *
     * @return the value of ych_enroll.user_id
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_enroll.user_id
     *
     * @param userId the value for ych_enroll.user_id
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_enroll.enroll_status
     *
     * @return the value of ych_enroll.enroll_status
     * @mbggenerated
     */
    public String getEnrollStatus() {
        return enrollStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_enroll.enroll_status
     *
     * @param enrollStatus the value for ych_enroll.enroll_status
     * @mbggenerated
     */
    public void setEnrollStatus(String enrollStatus) {
        this.enrollStatus = enrollStatus == null ? null : enrollStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_enroll.pay_status
     *
     * @return the value of ych_enroll.pay_status
     * @mbggenerated
     */
    public String getPayStatus() {
        return payStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_enroll.pay_status
     *
     * @param payStatus the value for ych_enroll.pay_status
     * @mbggenerated
     */
    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_enroll.shipping_status
     *
     * @return the value of ych_enroll.shipping_status
     * @mbggenerated
     */
    public String getShippingStatus() {
        return shippingStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_enroll.shipping_status
     *
     * @param shippingStatus the value for ych_enroll.shipping_status
     * @mbggenerated
     */
    public void setShippingStatus(String shippingStatus) {
        this.shippingStatus = shippingStatus == null ? null : shippingStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_enroll.address
     *
     * @return the value of ych_enroll.address
     * @mbggenerated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_enroll.address
     *
     * @param address the value for ych_enroll.address
     * @mbggenerated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_enroll.consignee
     *
     * @return the value of ych_enroll.consignee
     * @mbggenerated
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_enroll.consignee
     *
     * @param consignee the value for ych_enroll.consignee
     * @mbggenerated
     */
    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_enroll.org_major_id
     *
     * @return the value of ych_enroll.org_major_id
     * @mbggenerated
     */
    public Integer getOrgMajorId() {
        return orgMajorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_enroll.org_major_id
     *
     * @param orgMajorId the value for ych_enroll.org_major_id
     * @mbggenerated
     */
    public void setOrgMajorId(Integer orgMajorId) {
        this.orgMajorId = orgMajorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_enroll.org_major_number
     *
     * @return the value of ych_enroll.org_major_number
     * @mbggenerated
     */
    public Integer getOrgMajorNumber() {
        return orgMajorNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_enroll.org_major_number
     *
     * @param orgMajorNumber the value for ych_enroll.org_major_number
     * @mbggenerated
     */
    public void setOrgMajorNumber(Integer orgMajorNumber) {
        this.orgMajorNumber = orgMajorNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_enroll.org_major_tuition
     *
     * @return the value of ych_enroll.org_major_tuition
     * @mbggenerated
     */
    public BigDecimal getOrgMajorTuition() {
        return orgMajorTuition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_enroll.org_major_tuition
     *
     * @param orgMajorTuition the value for ych_enroll.org_major_tuition
     * @mbggenerated
     */
    public void setOrgMajorTuition(BigDecimal orgMajorTuition) {
        this.orgMajorTuition = orgMajorTuition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_enroll.grant_account
     *
     * @return the value of ych_enroll.grant_account
     * @mbggenerated
     */
    public BigDecimal getGrantAccount() {
        return grantAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_enroll.grant_account
     *
     * @param grantAccount the value for ych_enroll.grant_account
     * @mbggenerated
     */
    public void setGrantAccount(BigDecimal grantAccount) {
        this.grantAccount = grantAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_enroll.coupon_id
     *
     * @return the value of ych_enroll.coupon_id
     * @mbggenerated
     */
    public String getCouponId() {
        return couponId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_enroll.coupon_id
     *
     * @param couponId the value for ych_enroll.coupon_id
     * @mbggenerated
     */
    public void setCouponId(String couponId) {
        this.couponId = couponId == null ? null : couponId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_enroll.coupon_paid
     *
     * @return the value of ych_enroll.coupon_paid
     * @mbggenerated
     */
    public BigDecimal getCouponPaid() {
        return couponPaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_enroll.coupon_paid
     *
     * @param couponPaid the value for ych_enroll.coupon_paid
     * @mbggenerated
     */
    public void setCouponPaid(BigDecimal couponPaid) {
        this.couponPaid = couponPaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_enroll.enroll_account
     *
     * @return the value of ych_enroll.enroll_account
     * @mbggenerated
     */
    public BigDecimal getEnrollAccount() {
        return enrollAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_enroll.enroll_account
     *
     * @param enrollAccount the value for ych_enroll.enroll_account
     * @mbggenerated
     */
    public void setEnrollAccount(BigDecimal enrollAccount) {
        this.enrollAccount = enrollAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_enroll.prepaid_amount
     *
     * @return the value of ych_enroll.prepaid_amount
     * @mbggenerated
     */
    public BigDecimal getPrepaidAmount() {
        return prepaidAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_enroll.prepaid_amount
     *
     * @param prepaidAmount the value for ych_enroll.prepaid_amount
     * @mbggenerated
     */
    public void setPrepaidAmount(BigDecimal prepaidAmount) {
        this.prepaidAmount = prepaidAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_enroll.pay_amount
     *
     * @return the value of ych_enroll.pay_amount
     * @mbggenerated
     */
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_enroll.pay_amount
     *
     * @param payAmount the value for ych_enroll.pay_amount
     * @mbggenerated
     */
    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_enroll.pay_time
     *
     * @return the value of ych_enroll.pay_time
     * @mbggenerated
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_enroll.pay_time
     *
     * @param payTime the value for ych_enroll.pay_time
     * @mbggenerated
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_enroll.create_time
     *
     * @return the value of ych_enroll.create_time
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_enroll.create_time
     *
     * @param createTime the value for ych_enroll.create_time
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_enroll
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", enrollId=").append(enrollId);
        sb.append(", userId=").append(userId);
        sb.append(", enrollStatus=").append(enrollStatus);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", shippingStatus=").append(shippingStatus);
        sb.append(", address=").append(address);
        sb.append(", consignee=").append(consignee);
        sb.append(", orgMajorId=").append(orgMajorId);
        sb.append(", orgMajorNumber=").append(orgMajorNumber);
        sb.append(", orgMajorTuition=").append(orgMajorTuition);
        sb.append(", grantAccount=").append(grantAccount);
        sb.append(", couponId=").append(couponId);
        sb.append(", couponPaid=").append(couponPaid);
        sb.append(", enrollAccount=").append(enrollAccount);
        sb.append(", prepaidAmount=").append(prepaidAmount);
        sb.append(", payAmount=").append(payAmount);
        sb.append(", payTime=").append(payTime);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_enroll
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
        Enroll other = (Enroll) that;
        return (this.getEnrollId() == null ? other.getEnrollId() == null : this.getEnrollId().equals(other.getEnrollId()))
                && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
                && (this.getEnrollStatus() == null ? other.getEnrollStatus() == null : this.getEnrollStatus().equals(other.getEnrollStatus()))
                && (this.getPayStatus() == null ? other.getPayStatus() == null : this.getPayStatus().equals(other.getPayStatus()))
                && (this.getShippingStatus() == null ? other.getShippingStatus() == null : this.getShippingStatus().equals(other.getShippingStatus()))
                && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
                && (this.getConsignee() == null ? other.getConsignee() == null : this.getConsignee().equals(other.getConsignee()))
                && (this.getOrgMajorId() == null ? other.getOrgMajorId() == null : this.getOrgMajorId().equals(other.getOrgMajorId()))
                && (this.getOrgMajorNumber() == null ? other.getOrgMajorNumber() == null : this.getOrgMajorNumber().equals(other.getOrgMajorNumber()))
                && (this.getOrgMajorTuition() == null ? other.getOrgMajorTuition() == null : this.getOrgMajorTuition().equals(other.getOrgMajorTuition()))
                && (this.getGrantAccount() == null ? other.getGrantAccount() == null : this.getGrantAccount().equals(other.getGrantAccount()))
                && (this.getCouponId() == null ? other.getCouponId() == null : this.getCouponId().equals(other.getCouponId()))
                && (this.getCouponPaid() == null ? other.getCouponPaid() == null : this.getCouponPaid().equals(other.getCouponPaid()))
                && (this.getEnrollAccount() == null ? other.getEnrollAccount() == null : this.getEnrollAccount().equals(other.getEnrollAccount()))
                && (this.getPrepaidAmount() == null ? other.getPrepaidAmount() == null : this.getPrepaidAmount().equals(other.getPrepaidAmount()))
                && (this.getPayAmount() == null ? other.getPayAmount() == null : this.getPayAmount().equals(other.getPayAmount()))
                && (this.getPayTime() == null ? other.getPayTime() == null : this.getPayTime().equals(other.getPayTime()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_enroll
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEnrollId() == null) ? 0 : getEnrollId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getEnrollStatus() == null) ? 0 : getEnrollStatus().hashCode());
        result = prime * result + ((getPayStatus() == null) ? 0 : getPayStatus().hashCode());
        result = prime * result + ((getShippingStatus() == null) ? 0 : getShippingStatus().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getConsignee() == null) ? 0 : getConsignee().hashCode());
        result = prime * result + ((getOrgMajorId() == null) ? 0 : getOrgMajorId().hashCode());
        result = prime * result + ((getOrgMajorNumber() == null) ? 0 : getOrgMajorNumber().hashCode());
        result = prime * result + ((getOrgMajorTuition() == null) ? 0 : getOrgMajorTuition().hashCode());
        result = prime * result + ((getGrantAccount() == null) ? 0 : getGrantAccount().hashCode());
        result = prime * result + ((getCouponId() == null) ? 0 : getCouponId().hashCode());
        result = prime * result + ((getCouponPaid() == null) ? 0 : getCouponPaid().hashCode());
        result = prime * result + ((getEnrollAccount() == null) ? 0 : getEnrollAccount().hashCode());
        result = prime * result + ((getPrepaidAmount() == null) ? 0 : getPrepaidAmount().hashCode());
        result = prime * result + ((getPayAmount() == null) ? 0 : getPayAmount().hashCode());
        result = prime * result + ((getPayTime() == null) ? 0 : getPayTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}