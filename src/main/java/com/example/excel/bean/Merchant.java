package com.example.excel.bean;

import java.io.Serializable;

public class Merchant implements Serializable {

  private   Integer mer_id;
    private String mer_number;
    private String mer_shorthand;
    private String mer_sign;
    private String mer_name;
    private String mer_phone;
    private  String mer_identity;
    private String mer_bank;
    private  Integer a_id;
    private Integer mer_source;
    private String mer_input;
    private Integer pf_id;

    public Integer getMer_id() {

        return mer_id;
    }

    public void setMer_id(Integer mer_id) {
        this.mer_id = mer_id;
    }

    public String getMer_number() {
        return mer_number;
    }

    public void setMer_number(String mer_number) {
        this.mer_number = mer_number;
    }

    public String getMer_shorthand() {
        return mer_shorthand;
    }

    public void setMer_shorthand(String mer_shorthand) {
        this.mer_shorthand = mer_shorthand;
    }

    public String getMer_sign() {
        return mer_sign;
    }

    public void setMer_sign(String mer_sign) {
        this.mer_sign = mer_sign;
    }

    public String getMer_name() {
        return mer_name;
    }

    public void setMer_name(String mer_name) {
        this.mer_name = mer_name;
    }

    public String getMer_phone() {
        return mer_phone;
    }

    public void setMer_phone(String mer_phone) {
        this.mer_phone = mer_phone;
    }

    public String getMer_identity() {
        return mer_identity;
    }

    public void setMer_identity(String mer_identity) {
        this.mer_identity = mer_identity;
    }

    public String getMer_bank() {
        return mer_bank;
    }

    public void setMer_bank(String mer_bank) {
        this.mer_bank = mer_bank;
    }

    public Integer getA_id() {
        return a_id;
    }

    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }

    public Integer getMer_source() {
        return mer_source;
    }

    public void setMer_source(Integer mer_source) {
        this.mer_source = mer_source;
    }

    public String getMer_input() {
        return mer_input;
    }

    public void setMer_input(String mer_input) {
        this.mer_input = mer_input;
    }

    public Integer getPf_id() {
        return pf_id;
    }

    public void setPf_id(Integer pf_id) {
        this.pf_id = pf_id;
    }
}
