package com.websky.pojo;

public class KucunbianhuaKey {
    private String itmCd;

    private Long date;

    public String getItmCd() {
        return itmCd;
    }

    public void setItmCd(String itmCd) {
        this.itmCd = itmCd == null ? null : itmCd.trim();
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }
}