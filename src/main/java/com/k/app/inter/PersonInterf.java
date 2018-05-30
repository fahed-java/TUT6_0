package com.k.app.inter;
import com.k.app.entity.Person;

public interface PersonInterf {

    Person create(Person person);

    Person update(Person person);

    void delete(Person person);
}
