package com.tut7.interfacee;

import com.tut7.entity.Seller;

public interface SellerFace {
    Seller create(Seller seller);

    Seller update(Seller seller);

    void delete(Seller seller);

    void read();

//    void read(int i);
}
