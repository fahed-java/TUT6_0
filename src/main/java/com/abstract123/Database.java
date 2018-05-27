package com.abstract123;

public class Database {
    private Customer[]customers=new Customer[10];
    private Employee[]employees=new Employee[10];

    public Customer[] getCustomers() {
        return customers;
    }

    public Employee[] getEmployees() {
        return employees;
    }
}
