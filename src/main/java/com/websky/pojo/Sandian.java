package com.websky.pojo;

public class Sandian {
    private String itmCd;

    private Integer kcNum;

    private Integer kctzDay;

    private Long total;

    private String mass;

    private Long price;

    public String getItmCd() {
        return itmCd;
    }

    public void setItmCd(String itmCd) {
        this.itmCd = itmCd == null ? null : itmCd.trim();
    }

    public Integer getKcNum() {
        return kcNum;
    }

    public void setKcNum(Integer kcNum) {
        this.kcNum = kcNum;
    }

    public Integer getKctzDay() {
        return kctzDay;
    }

    public void setKctzDay(Integer kctzDay) {
        this.kctzDay = kctzDay;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass == null ? null : mass.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}