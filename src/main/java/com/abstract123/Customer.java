package com.abstract123;

public class Customer extends Person {
    private Integer neqat;

    public Customer(Integer neqat) {
        this.neqat = neqat;
    }

    public Customer(String name, String mobile, String id, String gns, Integer neqat) {
        super(name, mobile, id, gns);
        this.neqat = neqat;
    }

    public Integer getNeqat() {
        return neqat;
    }

    public void setNeqat(Integer neqat) {
        this.neqat = neqat;
    }

    @Override
    public void create() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void read() {

    }

    @Override
    public void show() {
        System.out.println("اسم العميل: " + getName());
        System.out.println("الجوال: " + getMobile());
        System.out.println("رقم البطاقة: " + getId());
        System.out.println("الجنس: " + getGns());
        System.out.println("مجموع النقاط: " + getNeqat());
        System.out.println("________________________________________");

    }
}
