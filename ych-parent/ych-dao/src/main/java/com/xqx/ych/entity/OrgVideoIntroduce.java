package com.xqx.ych.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrgVideoIntroduce implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_org_video_introduce.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_org_video_introduce.url
     *
     * @mbggenerated
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_org_video_introduce.duration
     *
     * @mbggenerated
     */
    private BigDecimal duration;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_org_video_introduce.thumb
     *
     * @mbggenerated
     */
    private String thumb;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ych_org_video_introduce.intro_id
     *
     * @mbggenerated
     */
    private Integer introId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ych_org_video_introduce
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_org_video_introduce.id
     *
     * @return the value of ych_org_video_introduce.id
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_org_video_introduce.id
     *
     * @param id the value for ych_org_video_introduce.id
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_org_video_introduce.url
     *
     * @return the value of ych_org_video_introduce.url
     * @mbggenerated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_org_video_introduce.url
     *
     * @param url the value for ych_org_video_introduce.url
     * @mbggenerated
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_org_video_introduce.duration
     *
     * @return the value of ych_org_video_introduce.duration
     * @mbggenerated
     */
    public BigDecimal getDuration() {
        return duration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_org_video_introduce.duration
     *
     * @param duration the value for ych_org_video_introduce.duration
     * @mbggenerated
     */
    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_org_video_introduce.thumb
     *
     * @return the value of ych_org_video_introduce.thumb
     * @mbggenerated
     */
    public String getThumb() {
        return thumb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_org_video_introduce.thumb
     *
     * @param thumb the value for ych_org_video_introduce.thumb
     * @mbggenerated
     */
    public void setThumb(String thumb) {
        this.thumb = thumb == null ? null : thumb.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ych_org_video_introduce.intro_id
     *
     * @return the value of ych_org_video_introduce.intro_id
     * @mbggenerated
     */
    public Integer getIntroId() {
        return introId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ych_org_video_introduce.intro_id
     *
     * @param introId the value for ych_org_video_introduce.intro_id
     * @mbggenerated
     */
    public void setIntroId(Integer introId) {
        this.introId = introId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_org_video_introduce
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
        sb.append(", url=").append(url);
        sb.append(", duration=").append(duration);
        sb.append(", thumb=").append(thumb);
        sb.append(", introId=").append(introId);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_org_video_introduce
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
        OrgVideoIntroduce other = (OrgVideoIntroduce) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
                && (this.getDuration() == null ? other.getDuration() == null : this.getDuration().equals(other.getDuration()))
                && (this.getThumb() == null ? other.getThumb() == null : this.getThumb().equals(other.getThumb()))
                && (this.getIntroId() == null ? other.getIntroId() == null : this.getIntroId().equals(other.getIntroId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_org_video_introduce
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getDuration() == null) ? 0 : getDuration().hashCode());
        result = prime * result + ((getThumb() == null) ? 0 : getThumb().hashCode());
        result = prime * result + ((getIntroId() == null) ? 0 : getIntroId().hashCode());
        return result;
    }
}