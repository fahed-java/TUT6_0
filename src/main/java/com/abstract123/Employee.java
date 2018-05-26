package com.abstract123;

public class Employee extends Person {

    private Double salary;

    public Employee(Double salary) {
        this.salary = salary;
    }

    public Employee(String name, String mobile, String id, String gns, Double salary) {
        super(name, mobile, id, gns);
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
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
        System.out.println("اسم الموظف: " + getName());
        System.out.println("الجوال: " + getMobile());
        System.out.println("رقم البطاقة: " + getId());
        System.out.println("الجنس: " + getGns());
        System.out.println("الراتب: " + getSalary());
        System.out.println("________________________________________");

    }
}
