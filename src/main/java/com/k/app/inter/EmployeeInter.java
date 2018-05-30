package com.k.app.inter;

import com.k.app.entity.Employee;

public interface EmployeeInter {

    Employee create(Employee employee);

    Employee update(Employee employee);

    void delete(Employee employee);
}
