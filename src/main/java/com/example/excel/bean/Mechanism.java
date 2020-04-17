package com.example.excel.bean;

import java.io.Serializable;

public class Mechanism implements Serializable {

  private   Integer mec_id;
    private  Integer mec_father;
    private  String  mec_name;

    public Integer getMec_id() {
        return mec_id;
    }

    public void setMec_id(Integer mec_id) {
        this.mec_id = mec_id;
    }

    public Integer getMec_father() {
        return mec_father;
    }

    public void setMec_father(Integer mec_father) {
        this.mec_father = mec_father;
    }

    public String getMec_name() {
        return mec_name;
    }

    public void setMec_name(String mec_name) {
        this.mec_name = mec_name;
    }

    public String getMec_phone() {
        return mec_phone;
    }

    public void setMec_phone(String mec_phone) {
        this.mec_phone = mec_phone;
    }

    public Integer getMec_state() {
        return mec_state;
    }

    public void setMec_state(Integer mec_state) {
        this.mec_state = mec_state;
    }

    private  String mec_phone;
    private  Integer mec_state;
}
