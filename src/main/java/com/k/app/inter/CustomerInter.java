package com.k.app.inter;

import com.k.app.entity.Customer;

public interface CustomerInter {

    Customer create(Customer customer);

    Customer update(Customer customer);

    void delete(Customer customer);

    void read();

    void read(int i);


}
