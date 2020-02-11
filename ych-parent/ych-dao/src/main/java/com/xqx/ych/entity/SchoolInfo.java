package com.xqx.ych.entity;

import java.io.Serializable;
import java.util.Objects;


public class SchoolInfo implements Serializable {
    private Integer id;
    private String majorName;
    private String schoolName;
    private String coverImg;
    private String adress;
    private Double tuition;

    public Integer getId() {
        return id;
    }

    public String getMajorName() {
        return majorName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public String getAdress() {
        return adress;
    }

    public Double getTuition() {
        return tuition;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setTuition(Double tuition) {
        this.tuition = tuition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SchoolInfo that = (SchoolInfo) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(majorName, that.majorName) &&
                Objects.equals(schoolName, that.schoolName) &&
                Objects.equals(coverImg, that.coverImg) &&
                Objects.equals(adress, that.adress) &&
                Objects.equals(tuition, that.tuition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, majorName, schoolName, coverImg, adress, tuition);
    }

    @Override
    public String toString() {
        return "SchoolInfo{" +
                "id=" + id +
                ", majorName='" + majorName + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", cover_img='" + coverImg + '\'' +
                ", adress='" + adress + '\'' +
                ", tuition=" + tuition +
                '}';
    }
}
