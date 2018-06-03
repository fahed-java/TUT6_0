package com.tut7.interfacee;


import com.tut7.entity.Amel;

public interface AmelFace {

    Amel create(Amel customer);

    Amel update(Amel customer);

    void delete(Amel customer);

    void read();

//    void read(int i);
}
