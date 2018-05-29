package com.abstract123;

public class Employee extends Person {

    private Double salary;

    private int id;

    public Employee() {
    }

    public Employee(Double salary) {
        this.salary = salary;
    }

    public Employee(String name, String mobile, String num, String gns, Double salary,int id) {
        super(name, mobile, num, gns);
        this.salary = salary;
        this.id = id;

    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void create(int i) {
        Main.data.getEmployees()[i] = this;

    }

    @Override
    public void delete() {
        for (int i = 0; i < Main.data.getEmployees().length; i++) {
            if (this.id == Main.data.getEmployees()[i].getId()) {
                Main.data.getEmployees()[i] = null;
                break;

            }
        }
    }

    @Override
    public void read() {

    }

    @Override
    public <T> void update(T ma) {
        if (ma instanceof Employee){
            Employee s1 = (Employee) ma;
            //البحث عن العنصر القديم
            for (int i = 0; i < Main.data.getEmployees().length; i++) {

                if (this.id == Main.data.getEmployees()[i].getId()) {

                    Employee s2 = Main.data.getEmployees()[i];
                    s2.setId(s1.getId());
                    s2.setSalary(s1.getSalary());
                    s2.setGns(s1.getGns());
                    s2.setMobile(s1.getMobile());
                    s2.setName(s1.getName());
                    s2.setNum(s1.getNum());
                    break;

                }
            }
        }

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
