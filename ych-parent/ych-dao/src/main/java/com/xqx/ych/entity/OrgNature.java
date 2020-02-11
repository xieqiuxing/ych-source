package com.xqx.ych.entity;

import java.io.Serializable;
import java.util.Objects;

public class OrgNature implements Serializable {
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
        return "OrgNature{" +
                "natureId=" + natureId +
                ", natureName='" + natureName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrgNature orgNature = (OrgNature) o;
        return Objects.equals(natureId, orgNature.natureId) &&
                Objects.equals(natureName, orgNature.natureName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(natureId, natureName);
    }
}
