package com.tut7.entity;

public class Item extends Category {
    private Integer id;
    private Integer code;
    private String name;
    private Double price;
    private Seller seller;
    private Fatorh fatorh;
    private Amel amel;

    public Item() {
    }

    public Item(Integer id, Integer code, String name, Double price, Seller seller, Fatorh fatorh, Amel amel) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.price = price;
        this.seller = seller;
        this.fatorh = fatorh;
        this.amel = amel;
    }



    public Item(Integer id, Integer code, String name, Integer id1, Integer code1, String name1, Double price, Seller seller, Fatorh fatorh, Amel amel) {
        super(id, code, name);
        this.id = id1;
        this.code = code1;
        this.name = name1;
        this.price = price;
        this.seller = seller;
        this.fatorh = fatorh;
        this.amel = amel;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Fatorh getFatorh() {
        return fatorh;
    }

    public void setFatorh(Fatorh fatorh) {
        this.fatorh = fatorh;
    }

    public Amel getAmel() {
        return amel;
    }

    public void setAmel(Amel amel) {
        this.amel = amel;
    }

    @Override
    public String toString() {
        return "رقم الصنف" + this.code + "اسم الصنف" + this.name + "السعر" + this.price + "التاجر" + this.seller + "الفاتورة" + this.fatorh + " العميل" + this.amel + "اسم الصنف" + super.getName() + "رقم التصنيف" + super.getCode(); }



}

