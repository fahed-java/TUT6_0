package com.tut7.entity;

public class Seller {
    private  Integer id;
    private Integer code;
    private String name;
    private String mobile;

    public Seller() {
    }

    public Seller(Integer id, Integer code, String name, String mobile) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.mobile = mobile;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}

