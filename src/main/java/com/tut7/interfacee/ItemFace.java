package com.tut7.interfacee;

import com.tut7.entity.Item;

public interface ItemFace {
    Item create(Item item);

    Item update(Item item);

    void delete(Item item);

    void read();

//    void read(int i);

}
