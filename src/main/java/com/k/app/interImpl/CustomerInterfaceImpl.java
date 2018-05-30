package com.k.app.interImpl;


import com.k.app.database.Connection;
import com.k.app.entity.Customer;
import com.k.app.inter.CustomerInter;

public class CustomerInterfaceImpl implements CustomerInter {

    @Override
    public Customer create(Customer customer) {
        Connection.customers.add(customer);
        //اضافة الي قواعد البيانات
        return customer;
    }

    @Override
    public Customer update(Customer customer) {
        for (int i = 0; i < Connection.customers.size(); i++){
            if(Connection.customers.get(i).getId().equals(customer.getId())){
                Connection.customers.get(i).setNekat(customer.getNekat());
                Connection.customers.get(i).setName(customer.getName());
                return Connection.customers.get(i);
            }
        }
        return null;
    }

    @Override
    public void delete(Customer customer) {
        for (int i = 0; i < Connection.customers.size(); i++){
            if(Connection.customers.get(i).getId().equals(customer.getId())){
                Connection.customers.remove(i);
                break;
            }
        }
    }

    @Override
    public void read() {
        for (int i = 0; i < Connection.customers.size(); i++){
            System.out.println(Connection.customers.get(i).toString());
        }
    }

    //عرض بيانات معينة
    @Override
    public void read(int k) {
        for (int i = 0; i < Connection.customers.size(); i++){
            if(Connection.customers.get(i).getId().equals(k)){
                System.out.println(Connection.customers.get(i).toString());
                break;
            }
        }


    }
}
