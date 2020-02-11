package com.xqx.ych.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Pay implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_pay.pay_id
     *
     * @mbggenerated
     */
    private String payId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_pay.enroll_id
     *
     * @mbggenerated
     */
    private String enrollId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_pay.prepay_amount
     *
     * @mbggenerated
     */
    private BigDecimal prepayAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_pay.pay_amount
     *
     * @mbggenerated
     */
    private BigDecimal payAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_pay.is_paid
     *
     * @mbggenerated
     */
    private String isPaid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ych_pay
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_pay.pay_id
     *
     * @return the value of ych_pay.pay_id
     * @mbggenerated
     */
    public String getPayId() {
        return payId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_pay.pay_id
     *
     * @param payId the value for ych_pay.pay_id
     * @mbggenerated
     */
    public void setPayId(String payId) {
        this.payId = payId == null ? null : payId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_pay.enroll_id
     *
     * @return the value of ych_pay.enroll_id
     * @mbggenerated
     */
    public String getEnrollId() {
        return enrollId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_pay.enroll_id
     *
     * @param enrollId the value for ych_pay.enroll_id
     * @mbggenerated
     */
    public void setEnrollId(String enrollId) {
        this.enrollId = enrollId == null ? null : enrollId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_pay.prepay_amount
     *
     * @return the value of ych_pay.prepay_amount
     * @mbggenerated
     */
    public BigDecimal getPrepayAmount() {
        return prepayAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_pay.prepay_amount
     *
     * @param prepayAmount the value for ych_pay.prepay_amount
     * @mbggenerated
     */
    public void setPrepayAmount(BigDecimal prepayAmount) {
        this.prepayAmount = prepayAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_pay.pay_amount
     *
     * @return the value of ych_pay.pay_amount
     * @mbggenerated
     */
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_pay.pay_amount
     *
     * @param payAmount the value for ych_pay.pay_amount
     * @mbggenerated
     */
    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_pay.is_paid
     *
     * @return the value of ych_pay.is_paid
     * @mbggenerated
     */
    public String getIsPaid() {
        return isPaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_pay.is_paid
     *
     * @param isPaid the value for ych_pay.is_paid
     * @mbggenerated
     */
    public void setIsPaid(String isPaid) {
        this.isPaid = isPaid == null ? null : isPaid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_pay
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", payId=").append(payId);
        sb.append(", enrollId=").append(enrollId);
        sb.append(", prepayAmount=").append(prepayAmount);
        sb.append(", payAmount=").append(payAmount);
        sb.append(", isPaid=").append(isPaid);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_pay
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
        Pay other = (Pay) that;
        return (this.getPayId() == null ? other.getPayId() == null : this.getPayId().equals(other.getPayId()))
                && (this.getEnrollId() == null ? other.getEnrollId() == null : this.getEnrollId().equals(other.getEnrollId()))
                && (this.getPrepayAmount() == null ? other.getPrepayAmount() == null : this.getPrepayAmount().equals(other.getPrepayAmount()))
                && (this.getPayAmount() == null ? other.getPayAmount() == null : this.getPayAmount().equals(other.getPayAmount()))
                && (this.getIsPaid() == null ? other.getIsPaid() == null : this.getIsPaid().equals(other.getIsPaid()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_pay
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPayId() == null) ? 0 : getPayId().hashCode());
        result = prime * result + ((getEnrollId() == null) ? 0 : getEnrollId().hashCode());
        result = prime * result + ((getPrepayAmount() == null) ? 0 : getPrepayAmount().hashCode());
        result = prime * result + ((getPayAmount() == null) ? 0 : getPayAmount().hashCode());
        result = prime * result + ((getIsPaid() == null) ? 0 : getIsPaid().hashCode());
        return result;
    }
}