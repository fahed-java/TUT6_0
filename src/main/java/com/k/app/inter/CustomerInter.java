package com.besafx.app.app.inter;

import com.besafx.app.app.entity.Customer;

public interface CustomerInter {

    Customer create(Customer customer);

    Customer update(Customer customer);

    void delete(Customer customer);


}
