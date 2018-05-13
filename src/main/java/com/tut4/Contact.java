package com.tut4;

public class Contact {
    private String name;

    private String mobile;

    private String phone;

    private String identityNumber;

    private String address;

    public Contact() {
    }

    public Contact(String name, String mobile, String phone, String identityNumber, String address) {
        this.name = name;
        this.mobile = mobile;
        this.phone = phone;
        this.identityNumber = identityNumber;
        this.address = address;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
