package com.abstract123;

public class Employee extends Person {

    private Double salary;



    private int id;

    public Employee(Double salary) {
        this.salary = salary;
    }

    public Employee(String name, String mobile, String num, String gns, Double salary) {
        super(name, mobile, num, gns);
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public void create(int i) {
        Main.data.getEmployees()[i] = this;

    }

    @Override
    public void delete() {

    }

    @Override
    public void read() {

    }

    @Override
    public <T> void update(T ma) {

    }

    @Override
    public void show() {
        System.out.println("اسم الموظف: " + getName());
        System.out.println("الجوال: " + getMobile());
        System.out.println("رقم البطاقة: " + getNum());
        System.out.println("الجنس: " + getGns());
        System.out.println("الراتب: " + getSalary());
        System.out.println("________________________________________");

    }
}
