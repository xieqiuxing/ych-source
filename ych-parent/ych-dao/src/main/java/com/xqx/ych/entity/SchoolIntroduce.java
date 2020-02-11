package com.xqx.ych.entity;

import java.io.Serializable;
import java.util.Objects;

public class SchoolIntroduce implements Serializable {
    private Integer id;
    private String schoolName;
    private String coverImg;
    private Double tuition;
    private Introduce introduce;

    public Integer getId() {
        return id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public Double getTuition() {
        return tuition;
    }

    public Introduce getIntroduce() {
        return introduce;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public void setTuition(Double tuition) {
        this.tuition = tuition;
    }

    public void setIntroduce(Introduce introduce) {
        this.introduce = introduce;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SchoolIntroduce that = (SchoolIntroduce) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(schoolName, that.schoolName) &&
                Objects.equals(coverImg, that.coverImg) &&
                Objects.equals(tuition, that.tuition) &&
                Objects.equals(introduce, that.introduce);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, schoolName, coverImg, tuition, introduce);
    }

    @Override
    public String toString() {
        return "SchoolIntroduce{" +
                "id=" + id +
                ", schoolName='" + schoolName + '\'' +
                ", coverImg='" + coverImg + '\'' +
                ", tuition=" + tuition +
                ", introduce=" + introduce +
                '}';
    }
}
