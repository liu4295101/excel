package com.example.excel.bean;

import java.io.Serializable;

public class Machinery implements Serializable {

    private Integer mach_id;
    private String mach_number;
    private String mach_sin;
    private String mach_date;
    private Integer a_id;
    private  String mach_attrdate;
    private Integer mach_actstate;
    private String mach_acttime;
    private Integer mach_standstste;
    private Integer mach_source;
    private Integer pf_id;
    private String mach_import;
    private Double mach_rate;

    public Integer getMach_id() {
        return mach_id;
    }

    public void setMach_id(Integer mach_id) {
        this.mach_id = mach_id;
    }

    public String getMach_number() {
        return mach_number;
    }

    public void setMach_number(String mach_number) {
        this.mach_number = mach_number;
    }

    public String getMach_sin() {
        return mach_sin;
    }

    public void setMach_sin(String mach_sin) {
        this.mach_sin = mach_sin;
    }

    public String getMach_date() {
        return mach_date;
    }

    public void setMach_date(String mach_date) {
        this.mach_date = mach_date;
    }

    public Integer getA_id() {
        return a_id;
    }

    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }

    public String getMach_attrdate() {
        return mach_attrdate;
    }

    public void setMach_attrdate(String mach_attrdate) {
        this.mach_attrdate = mach_attrdate;
    }

    public Integer getMach_actstate() {
        return mach_actstate;
    }

    public void setMach_actstate(Integer mach_actstate) {
        this.mach_actstate = mach_actstate;
    }

    public String getMach_acttime() {
        return mach_acttime;
    }

    public void setMach_acttime(String mach_acttime) {
        this.mach_acttime = mach_acttime;
    }

    public Integer getMach_standstste() {
        return mach_standstste;
    }

    public void setMach_standstste(Integer mach_standstste) {
        this.mach_standstste = mach_standstste;
    }

    public Integer getMach_source() {
        return mach_source;
    }

    public void setMach_source(Integer mach_source) {
        this.mach_source = mach_source;
    }

    public Integer getPf_id() {
        return pf_id;
    }

    public void setPf_id(Integer pf_id) {
        this.pf_id = pf_id;
    }

    public String getMach_import() {
        return mach_import;
    }

    public void setMach_import(String mach_import) {
        this.mach_import = mach_import;
    }

    public Double getMach_rate() {
        return mach_rate;
    }

    public void setMach_rate(Double mach_rate) {
        this.mach_rate = mach_rate;
    }
}
