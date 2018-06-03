package com.tut7.interImpl;

import com.tut7.databease.Data;
import com.tut7.entity.Item;
import com.tut7.interfacee.ItemFace;

public class ItemImpl implements ItemFace {
    @Override
    public Item create(Item item) {
        Data.items.add(item);
        return item;
    }

    @Override
    public Item update(Item item) {
        for (int i = 0; i < Data.items.size(); i++){
            if(Data.items.get(i).getId().equals(item.getId())){
                Data.items.get(i).setName(item.getName());
                Data.items.get(i).setCode(item.getCode());
                Data.items.get(i).setPrice(item.getPrice());
                Data.items.get(i).setFatorh(item.getFatorh());
                Data.items.get(i).setSeller(item.getSeller());
                Data.items.get(i).setAmel(item.getAmel());

                return Data.items.get(i);
            }
        }
        return null;    }

    @Override
    public void delete(Item item) {

        for (int i = 0; i < Data.items.size(); i++){
            if(Data.items.get(i).getId().equals(item.getId())){
                Data.items.remove(i);
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
