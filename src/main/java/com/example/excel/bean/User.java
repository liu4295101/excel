package com.example.excel.bean;

import java.io.Serializable;

public class User implements Serializable {

    private Integer uid;
    private  String user_name;
    private  String user_phone;
    private  String user_level;
    private  String user_register;
    private  Integer mec_id;
    private String user_pwd;
    private  Integer user_state;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_level() {
        return user_level;
    }

    public void setUser_level(String user_level) {
        this.user_level = user_level;
    }

    public String getUser_register() {
        return user_register;
    }

    public void setUser_register(String user_register) {
        this.user_register = user_register;
    }

    public Integer getMec_id() {
        return mec_id;
    }

    public void setMec_id(Integer mec_id) {
        this.mec_id = mec_id;
    }

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    public Integer getUser_state() {
        return user_state;
    }

    public void setUser_state(Integer user_state) {
        this.user_state = user_state;
    }
}
