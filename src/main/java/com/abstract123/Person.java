package com.abstract123;

public abstract class Person {
    private String name;
    private String mobile;
    private String num;
    private String gns;

    public Person() {
    }

    public Person(String name, String mobile, String num, String gns) {
        this.name = name;
        this.mobile = mobile;
        this.num = num;
        this.gns = gns;
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

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getGns() {
        return gns;
    }

    public void setGns(String gns) {
        this.gns = gns;
    }

    public abstract void create(int i);

    public abstract void delete();

    public abstract void read();

    public abstract void show();

    public abstract <T> void update(T ma );
}
