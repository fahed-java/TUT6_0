package com.tut7.interImpl;

import com.tut7.databease.Data;
import com.tut7.entity.Category;
import com.tut7.interfacee.CategoryFace;

public class CategoryImpl implements CategoryFace {

    @Override
    public Category create(Category category) {
        Data.categorys.add(category);
        return category;
    }

    @Override
    public Category update(Category category) {
        for (int i = 0; i < Data.categorys.size(); i++){
            if(Data.categorys.get(i).getId().equals(category.getId())){
                Data.categorys.get(i).setName(category.getName());
                Data.categorys.get(i).setCode(category.getCode());
                return Data.categorys.get(i);
            }
        }
        return null;    }

    @Override
    public void delete(Category category) {
        for (int i = 0; i < Data.categorys.size(); i++){
            if(Data.categorys.get(i).getId().equals(category.getId())){
                Data.categorys.remove(i);
                break;
            }


            }
    }

    @Override
    public void read() {

        for (int i = 0; i < Data.items.size(); i++){
            System.out.println(Data.items.get(i).toString());
            }
        }


    }

