package com.xqx.ych.entity;

import java.io.Serializable;
import java.util.Objects;

public class OrgType implements Serializable {
    private Integer typeId;
    private String TypeName;

    public Integer getTypeId() {
        return typeId;
    }

    public String getTypeName() {
        return TypeName;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public void setTypeName(String typeName) {
        TypeName = typeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrgType orgType = (OrgType) o;
        return Objects.equals(typeId, orgType.typeId) &&
                Objects.equals(TypeName, orgType.TypeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeId, TypeName);
    }

    @Override
    public String toString() {
        return "OrgType{" +
                "typeId=" + typeId +
                ", TypeName='" + TypeName + '\'' +
                '}';
    }
}
