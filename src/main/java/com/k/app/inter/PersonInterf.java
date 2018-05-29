package com.besafx.app.app.inter;

import com.besafx.app.app.entity.Person;

public interface PersonInterf {

    Person create(Person person);

    Person update(Person person);

    void delete(Person person);
}
