package com.example.excel.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class Deal implements Serializable {


  private   Integer d_id;
    private Integer a_id;
    private Integer mer_id;
    private String d_date;
    private BigDecimal d_money;
    private BigDecimal d_totle;
    private String d_card;
    private Integer pf_id;
    private Integer mach_id;
    private String d_input;

    public Integer getD_id() {
        return d_id;
    }

    public void setD_id(Integer d_id) {
        this.d_id = d_id;
    }

    public Integer getA_id() {
        return a_id;
    }

    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }

    public Integer getMer_id() {
        return mer_id;
    }

    public void setMer_id(Integer mer_id) {
        this.mer_id = mer_id;
    }

    public String getD_date() {
        return d_date;
    }

    public void setD_date(String d_date) {
        this.d_date = d_date;
    }

    public BigDecimal getD_money() {
        return d_money;
    }

    public void setD_money(BigDecimal d_money) {
        this.d_money = d_money;
    }

    public BigDecimal getD_totle() {
        return d_totle;
    }

    public void setD_totle(BigDecimal d_totle) {
        this.d_totle = d_totle;
    }

    public String getD_card() {
        return d_card;
    }

    public void setD_card(String d_card) {
        this.d_card = d_card;
    }

    public Integer getPf_id() {
        return pf_id;
    }

    public void setPf_id(Integer pf_id) {
        this.pf_id = pf_id;
    }

    public Integer getMach_id() {
        return mach_id;
    }

    public void setMach_id(Integer mach_id) {
        this.mach_id = mach_id;
    }

    public String getD_input() {
        return d_input;
    }

    public void setD_input(String d_input) {
        this.d_input = d_input;
    }
}
