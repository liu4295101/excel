package com.example.excel.bean;

import java.io.Serializable;

public class Journal implements Serializable {

   private Integer jou_id;
    private Integer facility;
    private Integer operation;
    private Integer user_id;
    private String jou_time;
    private  Integer mec_id;

    public Integer getJou_id() {
        return jou_id;
    }

    public void setJou_id(Integer jou_id) {
        this.jou_id = jou_id;
    }

    public Integer getFacility() {
        return facility;
    }

    public void setFacility(Integer facility) {
        this.facility = facility;
    }

    public Integer getOperation() {
        return operation;
    }

    public void setOperation(Integer operation) {
        this.operation = operation;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getJou_time() {
        return jou_time;
    }

    public void setJou_time(String jou_time) {
        this.jou_time = jou_time;
    }

    public Integer getMec_id() {
        return mec_id;
    }

    public void setMec_id(Integer mec_id) {
        this.mec_id = mec_id;
    }
}
