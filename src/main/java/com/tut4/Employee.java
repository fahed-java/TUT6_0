package com.tut4;

public class Employee {


    private Integer code;

    private Double salary;

    private Double overtime;

    private Double discount;

    private Double hafez;

    private Contact contact;

    public Employee() {
    }

    public Employee(String name, Double salary, Double overtime) {
        this.salary = salary;
        this.overtime = overtime;
        //انشاء كائن جديد أو سجل جديد من الكلاس Contact وتخزين قيمة name فيها ومن ثم ادخالها لكائن الموظف
        Contact contact = new Contact();
        contact.setName(name);
        this.contact = contact;

    }

    public Employee(Integer code, Double salary, Double overtime, Double discount, Double hafez, Contact contact) {
        this.code = code;
        this.salary = salary;
        this.overtime = overtime;
        this.discount = discount;
        this.hafez = hafez;
        this.contact = contact;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getOvertime() {
        return overtime;
    }

    public void setOvertime(Double overtime) {
        this.overtime = overtime;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getHafez() {
        return hafez;
    }

    public void setHafez(Double hafez) {
        this.hafez = hafez;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Double getHasem() {
        return (10 * this.salary) / 100;
    }

    public Double getMokafaa() {
        return ((3 * this.salary) / 100) + this.overtime;
    }

    public Double getTotal() {
        return (this.salary + this.overtime) - (this.getHasem() + this.getMokafaa());
    }

    public String getTakdeer() {
        if (this.overtime >= 300) {
            return "متميز";
        } else {
            return "غير متميز";
        }
    }
}