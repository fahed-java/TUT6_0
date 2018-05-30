package com.k.app.entity;

public class Employee extends Person{

    private Integer id;

    private Double salary;

    public Employee() {
        super(null);
    }

    public Employee(Integer id, String name, Double salary) {
        super(name);
        this.id = id;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
