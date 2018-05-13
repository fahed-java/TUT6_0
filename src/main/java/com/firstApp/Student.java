package com.firstApp;

public class Student {
    private int id;
    private String name;
    private int drgh1;
    private int drgh2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDrgh1() {
        return drgh1;
    }

    public void setDrgh1(int drgh1) {
        this.drgh1 = drgh1;
    }

    public int getDrgh2() {
        return drgh2;
    }

    public void setDrgh2(int drgh2) {
        this.drgh2 = drgh2;
    }

    public int sumdrgh() {
        int mgmoa = this.drgh1 + this.drgh2;
        return mgmoa;
    }

    public double nesbh() {
        double nesbhamle = (10 * this.sumdrgh()) / 100;
        return nesbhamle;

    }

    public double finaldrgat() {
        double nhaaeh = this.sumdrgh() + this.nesbh();
        return nhaaeh;

    }

}
