package com.xqx.ych.entity;

import java.io.Serializable;
import java.util.Objects;

public class OrgLevel implements Serializable {
    private Integer natureId;
    private String natureName;

    public Integer getNatureId() {
        return natureId;
    }

    public String getNatureName() {
        return natureName;
    }

    public void setNatureId(Integer natureId) {
        this.natureId = natureId;
    }

    public void setNatureName(String natureName) {
        this.natureName = natureName;
    }

    @Override
    public String toString() {
        return "OrgLevel{" +
                "natureId=" + natureId +
                ", natureName='" + natureName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrgLevel orgLevel = (OrgLevel) o;
        return Objects.equals(natureId, orgLevel.natureId) &&
                Objects.equals(natureName, orgLevel.natureName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(natureId, natureName);
    }
}
