package com.xqx.ych.entity;

import java.io.Serializable;

public class OrgAddress implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_org_address.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_org_address.longitude
     *
     * @mbggenerated
     */
    private String longitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_org_address.province
     *
     * @mbggenerated
     */
    private String province;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_org_address.city
     *
     * @mbggenerated
     */
    private String city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_org_address.county
     *
     * @mbggenerated
     */
    private String county;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_org_address.addrDetail
     *
     * @mbggenerated
     */
    private String addrdetail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_org_address.org_id
     *
     * @mbggenerated
     */
    private Integer orgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_org_address.latitude
     *
     * @mbggenerated
     */
    private String latitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ych_org_address
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_org_address.id
     *
     * @return the value of ych_org_address.id
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_org_address.id
     *
     * @param id the value for ych_org_address.id
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_org_address.longitude
     *
     * @return the value of ych_org_address.longitude
     * @mbggenerated
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_org_address.longitude
     *
     * @param longitude the value for ych_org_address.longitude
     * @mbggenerated
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_org_address.province
     *
     * @return the value of ych_org_address.province
     * @mbggenerated
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_org_address.province
     *
     * @param province the value for ych_org_address.province
     * @mbggenerated
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_org_address.city
     *
     * @return the value of ych_org_address.city
     * @mbggenerated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_org_address.city
     *
     * @param city the value for ych_org_address.city
     * @mbggenerated
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_org_address.county
     *
     * @return the value of ych_org_address.county
     * @mbggenerated
     */
    public String getCounty() {
        return county;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_org_address.county
     *
     * @param county the value for ych_org_address.county
     * @mbggenerated
     */
    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_org_address.addrDetail
     *
     * @return the value of ych_org_address.addrDetail
     * @mbggenerated
     */
    public String getAddrdetail() {
        return addrdetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_org_address.addrDetail
     *
     * @param addrdetail the value for ych_org_address.addrDetail
     * @mbggenerated
     */
    public void setAddrdetail(String addrdetail) {
        this.addrdetail = addrdetail == null ? null : addrdetail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_org_address.org_id
     *
     * @return the value of ych_org_address.org_id
     * @mbggenerated
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_org_address.org_id
     *
     * @param orgId the value for ych_org_address.org_id
     * @mbggenerated
     */
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_org_address.latitude
     *
     * @return the value of ych_org_address.latitude
     * @mbggenerated
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_org_address.latitude
     *
     * @param latitude the value for ych_org_address.latitude
     * @mbggenerated
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_org_address
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
        sb.append(", longitude=").append(longitude);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", county=").append(county);
        sb.append(", addrdetail=").append(addrdetail);
        sb.append(", orgId=").append(orgId);
        sb.append(", latitude=").append(latitude);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_org_address
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
        OrgAddress other = (OrgAddress) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getLongitude() == null ? other.getLongitude() == null : this.getLongitude().equals(other.getLongitude()))
                && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
                && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
                && (this.getCounty() == null ? other.getCounty() == null : this.getCounty().equals(other.getCounty()))
                && (this.getAddrdetail() == null ? other.getAddrdetail() == null : this.getAddrdetail().equals(other.getAddrdetail()))
                && (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()))
                && (this.getLatitude() == null ? other.getLatitude() == null : this.getLatitude().equals(other.getLatitude()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_org_address
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getCounty() == null) ? 0 : getCounty().hashCode());
        result = prime * result + ((getAddrdetail() == null) ? 0 : getAddrdetail().hashCode());
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        result = prime * result + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        return result;
    }
}