package com.xqx.ych.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Coupon implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_coupon.coupon_id
     *
     * @mbggenerated
     */
    private String couponId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_coupon.coupon_price
     *
     * @mbggenerated
     */
    private BigDecimal couponPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_coupon.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_coupon.enroll_id
     *
     * @mbggenerated
     */
    private String enrollId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_coupon.is_used
     *
     * @mbggenerated
     */
    private String isUsed;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_coupon.used_time
     *
     * @mbggenerated
     */
    private Date usedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ych_coupon
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_coupon.coupon_id
     *
     * @return the value of ych_coupon.coupon_id
     * @mbggenerated
     */
    public String getCouponId() {
        return couponId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_coupon.coupon_id
     *
     * @param couponId the value for ych_coupon.coupon_id
     * @mbggenerated
     */
    public void setCouponId(String couponId) {
        this.couponId = couponId == null ? null : couponId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_coupon.coupon_price
     *
     * @return the value of ych_coupon.coupon_price
     * @mbggenerated
     */
    public BigDecimal getCouponPrice() {
        return couponPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_coupon.coupon_price
     *
     * @param couponPrice the value for ych_coupon.coupon_price
     * @mbggenerated
     */
    public void setCouponPrice(BigDecimal couponPrice) {
        this.couponPrice = couponPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_coupon.user_id
     *
     * @return the value of ych_coupon.user_id
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_coupon.user_id
     *
     * @param userId the value for ych_coupon.user_id
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_coupon.enroll_id
     *
     * @return the value of ych_coupon.enroll_id
     * @mbggenerated
     */
    public String getEnrollId() {
        return enrollId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_coupon.enroll_id
     *
     * @param enrollId the value for ych_coupon.enroll_id
     * @mbggenerated
     */
    public void setEnrollId(String enrollId) {
        this.enrollId = enrollId == null ? null : enrollId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_coupon.is_used
     *
     * @return the value of ych_coupon.is_used
     * @mbggenerated
     */
    public String getIsUsed() {
        return isUsed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_coupon.is_used
     *
     * @param isUsed the value for ych_coupon.is_used
     * @mbggenerated
     */
    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed == null ? null : isUsed.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_coupon.used_time
     *
     * @return the value of ych_coupon.used_time
     * @mbggenerated
     */
    public Date getUsedTime() {
        return usedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_coupon.used_time
     *
     * @param usedTime the value for ych_coupon.used_time
     * @mbggenerated
     */
    public void setUsedTime(Date usedTime) {
        this.usedTime = usedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_coupon
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", couponId=").append(couponId);
        sb.append(", couponPrice=").append(couponPrice);
        sb.append(", userId=").append(userId);
        sb.append(", enrollId=").append(enrollId);
        sb.append(", isUsed=").append(isUsed);
        sb.append(", usedTime=").append(usedTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_coupon
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
        Coupon other = (Coupon) that;
        return (this.getCouponId() == null ? other.getCouponId() == null : this.getCouponId().equals(other.getCouponId()))
                && (this.getCouponPrice() == null ? other.getCouponPrice() == null : this.getCouponPrice().equals(other.getCouponPrice()))
                && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
                && (this.getEnrollId() == null ? other.getEnrollId() == null : this.getEnrollId().equals(other.getEnrollId()))
                && (this.getIsUsed() == null ? other.getIsUsed() == null : this.getIsUsed().equals(other.getIsUsed()))
                && (this.getUsedTime() == null ? other.getUsedTime() == null : this.getUsedTime().equals(other.getUsedTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_coupon
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCouponId() == null) ? 0 : getCouponId().hashCode());
        result = prime * result + ((getCouponPrice() == null) ? 0 : getCouponPrice().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getEnrollId() == null) ? 0 : getEnrollId().hashCode());
        result = prime * result + ((getIsUsed() == null) ? 0 : getIsUsed().hashCode());
        result = prime * result + ((getUsedTime() == null) ? 0 : getUsedTime().hashCode());
        return result;
    }
}