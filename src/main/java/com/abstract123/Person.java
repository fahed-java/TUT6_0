package com.abstract123;

public abstract class Person {
    private String name;
    private String mobile;
    private String id;
    private String gns;

    public Person() {
    }

    public Person(String name, String mobile, String id, String gns) {
        this.name = name;
        this.mobile = mobile;
        this.id = id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGns() {
        return gns;
    }

    public void setGns(String gns) {
        this.gns = gns;
    }

    public abstract void create();

    public abstract void delete();

    public abstract void read();

    public abstract void show();

}
