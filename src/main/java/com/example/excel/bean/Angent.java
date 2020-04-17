package com.example.excel.bean;

import java.io.Serializable;

public class Angent implements Serializable {


    private  Integer a_id;
    private String a_name;
    private Integer rid;
    private String a_loginid;
    private String a_pwd;
    private String a_record;
    private  String a_phone;
    private  String a_idcard;
    private  String a_bankid;
    private  Integer a_from;
    private  String a_inttime;
    private  Integer pf_id;
    private  Integer a_type;

    public Integer getA_id() {
        return a_id;
    }

    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }

    public String getA_name() {
        return a_name;
    }

    public void setA_name(String a_name) {
        this.a_name = a_name;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getA_loginid() {
        return a_loginid;
    }

    public void setA_loginid(String a_loginid) {
        this.a_loginid = a_loginid;
    }

    public String getA_pwd() {
        return a_pwd;
    }

    public void setA_pwd(String a_pwd) {
        this.a_pwd = a_pwd;
    }

    public String getA_record() {
        return a_record;
    }

    public void setA_record(String a_record) {
        this.a_record = a_record;
    }

    public String getA_phone() {
        return a_phone;
    }

    public void setA_phone(String a_phone) {
        this.a_phone = a_phone;
    }

    public String getA_idcard() {
        return a_idcard;
    }

    public void setA_idcard(String a_idcard) {
        this.a_idcard = a_idcard;
    }

    public String getA_bankid() {
        return a_bankid;
    }

    public void setA_bankid(String a_bankid) {
        this.a_bankid = a_bankid;
    }

    public Integer getA_from() {
        return a_from;
    }

    public void setA_from(Integer a_from) {
        this.a_from = a_from;
    }

    public String getA_inttime() {
        return a_inttime;
    }

    public void setA_inttime(String a_inttime) {
        this.a_inttime = a_inttime;
    }

    public Integer getPf_id() {
        return pf_id;
    }

    public void setPf_id(Integer pf_id) {
        this.pf_id = pf_id;
    }

    public Integer getA_type() {
        return a_type;
    }

    public void setA_type(Integer a_type) {
        this.a_type = a_type;
    }
}
