package com.tut7.entity;

public class Fatorh {
    private Integer id;
    private Integer code;
    private Item item;
    private Double price;

    public Fatorh() {
    }

    public Fatorh(Integer id, Integer code, Item item, Double price) {
        this.id = id;
        this.code = code;
        this.item = item;
        this.price = price;
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

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
