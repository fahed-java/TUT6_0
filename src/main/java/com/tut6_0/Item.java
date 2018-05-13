package com.tut6_0;

public class Item {
    private Integer code;
    private String name;
    private Integer price;
    private Category category;
    private Seller seller;
    private Customer customer;
    private Fatorh fatorh;

    public Item() {
    }

    public Item(Integer code, String name, Integer price, Category category, Seller seller, Customer customer, Fatorh fatorh) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.category = category;
        this.seller = seller;
        this.customer = customer;
        this.fatorh = fatorh;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Fatorh getFatorh() {
        return fatorh;
    }

    public void setFatorh(Fatorh fatorh) {
        this.fatorh = fatorh;
    }


}