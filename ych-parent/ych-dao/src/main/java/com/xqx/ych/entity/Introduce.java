package com.xqx.ych.entity;

import java.io.Serializable;
import java.util.Objects;

public class Introduce implements Serializable {
    private String detail;

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Introduce introduce = (Introduce) o;
        return Objects.equals(detail, introduce.detail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detail);
    }

    @Override
    public String toString() {
        return "Introduce{" +
                "detail='" + detail + '\'' +
                '}';
    }
}
