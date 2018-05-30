package com.k.app;

import com.k.app.database.Connection;
import com.k.app.entity.Customer;
import com.k.app.inter.CustomerInter;
import com.k.app.interImpl.CustomerInterfaceImpl;

public class Main {
    public static void main(String args[]) {

        //هنا الاوبجكت الابن ورث من اوبجكت الأب
        CustomerInter inter = new CustomerInterfaceImpl();

        Customer x1 = new Customer();
        x1.setId(1);
        x1.setNekat(150);
        x1.setName("خالد");
        inter.create(x1);

        Customer x2 = new Customer();
        x2.setId(2);
        x2.setNekat(100);
        x2.setName("محمد");
        inter.create(x2);


        Customer x3 = new Customer();
        x3.setId(3);
        x3.setNekat(200);
        x3.setName("علي");
        inter.create(x3);


        inter.read();
System.out.println("____________________________________________");
        //الآن نجرب الحذف
        inter.delete(x2);
        inter.read();
        System.out.println("____________________________________________");

        //الأن نجرب التحديث أو التعديل
        Customer y3 = new Customer();
        y3.setId(3);
        y3.setNekat(322);
        y3.setName("صالح");
        inter.update(y3);
        inter.read(3);
    }
}
