package com.k.app.entity;

public class Customer extends Person {

    private Integer id;

    private Integer nekat;

    public Customer() {
        super(null);
    }

    public Customer(int id, String name, Integer nekat) {
        super(name);
        this.id = id;
        this.nekat = nekat;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNekat() {
        return nekat;
    }

    public void setNekat(Integer nekat) {
        this.nekat = nekat;
    }

    @Override
    public String toString() {
       return " اسم العميل " + super.getName()  +  " النقاط " + this.nekat;
    }
}

