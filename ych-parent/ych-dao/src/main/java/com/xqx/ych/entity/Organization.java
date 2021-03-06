package com.xqx.ych.entity;

import java.io.Serializable;
import java.util.Date;

public class Organization implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_organization.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_organization.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_organization.cover_img
     *
     * @mbggenerated
     */
    private String coverImg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_organization.org_type
     *
     * @mbggenerated
     */
    private Integer orgType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_organization.licence_code
     *
     * @mbggenerated
     */
    private String licenceCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_organization.org_nature
     *
     * @mbggenerated
     */
    private String orgNature;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_organization.org_licence_img
     *
     * @mbggenerated
     */
    private String orgLicenceImg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_organization.legal_person
     *
     * @mbggenerated
     */
    private String legalPerson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_organization.legal_person_idcard
     *
     * @mbggenerated
     */
    private String legalPersonIdcard;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_organization.legal_person_phone
     *
     * @mbggenerated
     */
    private String legalPersonPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_organization.contact_name
     *
     * @mbggenerated
     */
    private String contactName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_organization.contact_mobile
     *
     * @mbggenerated
     */
    private String contactMobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_organization.org_level
     *
     * @mbggenerated
     */
    private Integer orgLevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_organization.org_audit_status
     *
     * @mbggenerated
     */
    private Integer orgAuditStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_organization.createtime
     *
     * @mbggenerated
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_organization.updatetime
     *
     * @mbggenerated
     */
    private Date updatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_organization.adress
     *
     * @mbggenerated
     */
    private String adress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_organization.address_id
     *
     * @mbggenerated
     */
    private Integer addressId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_organization.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_organization.admission_counseling
     *
     * @mbggenerated
     */
    private Integer admissionCounseling;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_organization.is_hot
     *
     * @mbggenerated
     */
    private Integer isHot;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ych_organization
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_organization.id
     *
     * @return the value of ych_organization.id
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_organization.id
     *
     * @param id the value for ych_organization.id
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_organization.name
     *
     * @return the value of ych_organization.name
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_organization.name
     *
     * @param name the value for ych_organization.name
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_organization.cover_img
     *
     * @return the value of ych_organization.cover_img
     * @mbggenerated
     */
    public String getCoverImg() {
        return coverImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_organization.cover_img
     *
     * @param coverImg the value for ych_organization.cover_img
     * @mbggenerated
     */
    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg == null ? null : coverImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_organization.org_type
     *
     * @return the value of ych_organization.org_type
     * @mbggenerated
     */
    public Integer getOrgType() {
        return orgType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_organization.org_type
     *
     * @param orgType the value for ych_organization.org_type
     * @mbggenerated
     */
    public void setOrgType(Integer orgType) {
        this.orgType = orgType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_organization.licence_code
     *
     * @return the value of ych_organization.licence_code
     * @mbggenerated
     */
    public String getLicenceCode() {
        return licenceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_organization.licence_code
     *
     * @param licenceCode the value for ych_organization.licence_code
     * @mbggenerated
     */
    public void setLicenceCode(String licenceCode) {
        this.licenceCode = licenceCode == null ? null : licenceCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_organization.org_nature
     *
     * @return the value of ych_organization.org_nature
     * @mbggenerated
     */
    public String getOrgNature() {
        return orgNature;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_organization.org_nature
     *
     * @param orgNature the value for ych_organization.org_nature
     * @mbggenerated
     */
    public void setOrgNature(String orgNature) {
        this.orgNature = orgNature == null ? null : orgNature.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_organization.org_licence_img
     *
     * @return the value of ych_organization.org_licence_img
     * @mbggenerated
     */
    public String getOrgLicenceImg() {
        return orgLicenceImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_organization.org_licence_img
     *
     * @param orgLicenceImg the value for ych_organization.org_licence_img
     * @mbggenerated
     */
    public void setOrgLicenceImg(String orgLicenceImg) {
        this.orgLicenceImg = orgLicenceImg == null ? null : orgLicenceImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_organization.legal_person
     *
     * @return the value of ych_organization.legal_person
     * @mbggenerated
     */
    public String getLegalPerson() {
        return legalPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_organization.legal_person
     *
     * @param legalPerson the value for ych_organization.legal_person
     * @mbggenerated
     */
    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson == null ? null : legalPerson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_organization.legal_person_idcard
     *
     * @return the value of ych_organization.legal_person_idcard
     * @mbggenerated
     */
    public String getLegalPersonIdcard() {
        return legalPersonIdcard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_organization.legal_person_idcard
     *
     * @param legalPersonIdcard the value for ych_organization.legal_person_idcard
     * @mbggenerated
     */
    public void setLegalPersonIdcard(String legalPersonIdcard) {
        this.legalPersonIdcard = legalPersonIdcard == null ? null : legalPersonIdcard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_organization.legal_person_phone
     *
     * @return the value of ych_organization.legal_person_phone
     * @mbggenerated
     */
    public String getLegalPersonPhone() {
        return legalPersonPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_organization.legal_person_phone
     *
     * @param legalPersonPhone the value for ych_organization.legal_person_phone
     * @mbggenerated
     */
    public void setLegalPersonPhone(String legalPersonPhone) {
        this.legalPersonPhone = legalPersonPhone == null ? null : legalPersonPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_organization.contact_name
     *
     * @return the value of ych_organization.contact_name
     * @mbggenerated
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_organization.contact_name
     *
     * @param contactName the value for ych_organization.contact_name
     * @mbggenerated
     */
    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_organization.contact_mobile
     *
     * @return the value of ych_organization.contact_mobile
     * @mbggenerated
     */
    public String getContactMobile() {
        return contactMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_organization.contact_mobile
     *
     * @param contactMobile the value for ych_organization.contact_mobile
     * @mbggenerated
     */
    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile == null ? null : contactMobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_organization.org_level
     *
     * @return the value of ych_organization.org_level
     * @mbggenerated
     */
    public Integer getOrgLevel() {
        return orgLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_organization.org_level
     *
     * @param orgLevel the value for ych_organization.org_level
     * @mbggenerated
     */
    public void setOrgLevel(Integer orgLevel) {
        this.orgLevel = orgLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_organization.org_audit_status
     *
     * @return the value of ych_organization.org_audit_status
     * @mbggenerated
     */
    public Integer getOrgAuditStatus() {
        return orgAuditStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_organization.org_audit_status
     *
     * @param orgAuditStatus the value for ych_organization.org_audit_status
     * @mbggenerated
     */
    public void setOrgAuditStatus(Integer orgAuditStatus) {
        this.orgAuditStatus = orgAuditStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_organization.createtime
     *
     * @return the value of ych_organization.createtime
     * @mbggenerated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_organization.createtime
     *
     * @param createtime the value for ych_organization.createtime
     * @mbggenerated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_organization.updatetime
     *
     * @return the value of ych_organization.updatetime
     * @mbggenerated
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_organization.updatetime
     *
     * @param updatetime the value for ych_organization.updatetime
     * @mbggenerated
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_organization.adress
     *
     * @return the value of ych_organization.adress
     * @mbggenerated
     */
    public String getAdress() {
        return adress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_organization.adress
     *
     * @param adress the value for ych_organization.adress
     * @mbggenerated
     */
    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_organization.address_id
     *
     * @return the value of ych_organization.address_id
     * @mbggenerated
     */
    public Integer getAddressId() {
        return addressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_organization.address_id
     *
     * @param addressId the value for ych_organization.address_id
     * @mbggenerated
     */
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_organization.user_id
     *
     * @return the value of ych_organization.user_id
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_organization.user_id
     *
     * @param userId the value for ych_organization.user_id
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_organization.admission_counseling
     *
     * @return the value of ych_organization.admission_counseling
     * @mbggenerated
     */
    public Integer getAdmissionCounseling() {
        return admissionCounseling;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_organization.admission_counseling
     *
     * @param admissionCounseling the value for ych_organization.admission_counseling
     * @mbggenerated
     */
    public void setAdmissionCounseling(Integer admissionCounseling) {
        this.admissionCounseling = admissionCounseling;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_organization.is_hot
     *
     * @return the value of ych_organization.is_hot
     * @mbggenerated
     */
    public Integer getIsHot() {
        return isHot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_organization.is_hot
     *
     * @param isHot the value for ych_organization.is_hot
     * @mbggenerated
     */
    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_organization
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
        sb.append(", name=").append(name);
        sb.append(", coverImg=").append(coverImg);
        sb.append(", orgType=").append(orgType);
        sb.append(", licenceCode=").append(licenceCode);
        sb.append(", orgNature=").append(orgNature);
        sb.append(", orgLicenceImg=").append(orgLicenceImg);
        sb.append(", legalPerson=").append(legalPerson);
        sb.append(", legalPersonIdcard=").append(legalPersonIdcard);
        sb.append(", legalPersonPhone=").append(legalPersonPhone);
        sb.append(", contactName=").append(contactName);
        sb.append(", contactMobile=").append(contactMobile);
        sb.append(", orgLevel=").append(orgLevel);
        sb.append(", orgAuditStatus=").append(orgAuditStatus);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", adress=").append(adress);
        sb.append(", addressId=").append(addressId);
        sb.append(", userId=").append(userId);
        sb.append(", admissionCounseling=").append(admissionCounseling);
        sb.append(", isHot=").append(isHot);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_organization
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
        Organization other = (Organization) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
                && (this.getCoverImg() == null ? other.getCoverImg() == null : this.getCoverImg().equals(other.getCoverImg()))
                && (this.getOrgType() == null ? other.getOrgType() == null : this.getOrgType().equals(other.getOrgType()))
                && (this.getLicenceCode() == null ? other.getLicenceCode() == null : this.getLicenceCode().equals(other.getLicenceCode()))
                && (this.getOrgNature() == null ? other.getOrgNature() == null : this.getOrgNature().equals(other.getOrgNature()))
                && (this.getOrgLicenceImg() == null ? other.getOrgLicenceImg() == null : this.getOrgLicenceImg().equals(other.getOrgLicenceImg()))
                && (this.getLegalPerson() == null ? other.getLegalPerson() == null : this.getLegalPerson().equals(other.getLegalPerson()))
                && (this.getLegalPersonIdcard() == null ? other.getLegalPersonIdcard() == null : this.getLegalPersonIdcard().equals(other.getLegalPersonIdcard()))
                && (this.getLegalPersonPhone() == null ? other.getLegalPersonPhone() == null : this.getLegalPersonPhone().equals(other.getLegalPersonPhone()))
                && (this.getContactName() == null ? other.getContactName() == null : this.getContactName().equals(other.getContactName()))
                && (this.getContactMobile() == null ? other.getContactMobile() == null : this.getContactMobile().equals(other.getContactMobile()))
                && (this.getOrgLevel() == null ? other.getOrgLevel() == null : this.getOrgLevel().equals(other.getOrgLevel()))
                && (this.getOrgAuditStatus() == null ? other.getOrgAuditStatus() == null : this.getOrgAuditStatus().equals(other.getOrgAuditStatus()))
                && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
                && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
                && (this.getAdress() == null ? other.getAdress() == null : this.getAdress().equals(other.getAdress()))
                && (this.getAddressId() == null ? other.getAddressId() == null : this.getAddressId().equals(other.getAddressId()))
                && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
                && (this.getAdmissionCounseling() == null ? other.getAdmissionCounseling() == null : this.getAdmissionCounseling().equals(other.getAdmissionCounseling()))
                && (this.getIsHot() == null ? other.getIsHot() == null : this.getIsHot().equals(other.getIsHot()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_organization
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCoverImg() == null) ? 0 : getCoverImg().hashCode());
        result = prime * result + ((getOrgType() == null) ? 0 : getOrgType().hashCode());
        result = prime * result + ((getLicenceCode() == null) ? 0 : getLicenceCode().hashCode());
        result = prime * result + ((getOrgNature() == null) ? 0 : getOrgNature().hashCode());
        result = prime * result + ((getOrgLicenceImg() == null) ? 0 : getOrgLicenceImg().hashCode());
        result = prime * result + ((getLegalPerson() == null) ? 0 : getLegalPerson().hashCode());
        result = prime * result + ((getLegalPersonIdcard() == null) ? 0 : getLegalPersonIdcard().hashCode());
        result = prime * result + ((getLegalPersonPhone() == null) ? 0 : getLegalPersonPhone().hashCode());
        result = prime * result + ((getContactName() == null) ? 0 : getContactName().hashCode());
        result = prime * result + ((getContactMobile() == null) ? 0 : getContactMobile().hashCode());
        result = prime * result + ((getOrgLevel() == null) ? 0 : getOrgLevel().hashCode());
        result = prime * result + ((getOrgAuditStatus() == null) ? 0 : getOrgAuditStatus().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getAdress() == null) ? 0 : getAdress().hashCode());
        result = prime * result + ((getAddressId() == null) ? 0 : getAddressId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getAdmissionCounseling() == null) ? 0 : getAdmissionCounseling().hashCode());
        result = prime * result + ((getIsHot() == null) ? 0 : getIsHot().hashCode());
        return result;
    }
}