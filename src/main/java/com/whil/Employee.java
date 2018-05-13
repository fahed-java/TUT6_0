package com.whil;

public class Employee {
   private int id;
   private String name;
   private int salary;

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double skn() {
        double bdlskn = (10 * this.salary) / 100;
        return bdlskn;
    }

    public double nql() {
        double bdlnql = (7 * this.salary) / 100;
        return bdlnql;
    }

    public double tamen() {
        double taameen = (3 * this.salary) / 100;
        return taameen;
    }

    public double safe() {
        double saferatb = this.salary + this.skn() + this.nql();
        return saferatb;

    }


}



