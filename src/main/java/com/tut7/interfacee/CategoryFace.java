package com.tut7.interfacee;

import com.tut7.entity.Category;

public interface CategoryFace {

    Category create(Category category);

    Category update(Category category);

    void delete(Category category);

    void read();

//    void read(int i);
}
