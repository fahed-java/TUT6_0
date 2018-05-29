package com.besafx.app.app.inter;

import com.besafx.app.app.entity.Employee;

public interface EmployeeInter {

    Employee create(Employee employee);

    Employee update(Employee employee);

    void delete(Employee employee);
}
