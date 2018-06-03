package com.tut7;

import com.tut7.entity.Category;
import com.tut7.entity.Item;
import com.tut7.entity.Seller;
import com.tut7.interImpl.CategoryImpl;
import com.tut7.interImpl.SellerImpl;
import com.tut7.interfacee.CategoryFace;
import com.tut7.interfacee.ItemFace;
import com.tut7.interImpl.ItemImpl;
import com.tut7.interfacee.SellerFace;


public class Main {

    public static void main(String[] args) {

        //هنا الاوبجكت الابن ورث من اوبجكت الأب
        ItemFace a1 = new ItemImpl();
        Item x1 = new Item();
        x1.setId(1);
        x1.setName("بطاطس السعودية");
        x1.setPrice(8.0);
        a1.create(x1);

        //////test//////
//        x1.toString();
        ////////////////

        Item x2 = new Item();
        x2.setId(2);
        x2.setName("حلاوة طحينية");
        x2.setPrice(22.0);
        a1.create(x2);

        Item x3 = new Item();
        x3.setId(3);
        x3.setName("مربى حلواني");
        x3.setPrice(7.0);
        a1.create(x3);

        Item x4 = new Item();
        x4.setId(4);
        x4.setName("جبنة شيدر");
        x4.setPrice(5.0);
        a1.create(x4);

        Item x5 = new Item();
        x5.setId(5);
        x5.setName("شطة حمراء");
        x5.setPrice(13.5);
        a1.create(x5);


/////////////////////////////////////
        CategoryFace b1 = new CategoryImpl();
        Category y1 = new Category();
        y1.setName("سناكس");
        b1.create(y1);

        Category y2 = new Category();
        y2.setName("حلويات");
        b1.create(y2);

        Category y3 = new Category();
        y3.setName("حلويات");
        b1.create(y3);

        Category y4 = new Category();
        y4.setName("أجبان");
        b1.create(y4);

        Category y5 = new Category();
        y5.setName("أعشاب");
        b1.create(y5);

        /////////////////////////////////////

        SellerFace c1 = new SellerImpl();
        Seller z1 = new Seller();
        z1.setName("مؤسسة المدار");
        c1.create(z1);

        Seller z2 = new Seller();
        z2.setName("الشركة السعودية للاغذية");
        c1.create(z2);

        Seller z3 = new Seller();
        z3.setName("مؤسسة المدار");
        c1.create(z3);

        Seller z4 = new Seller();
        z4.setName("مؤسسة المدار");
        c1.create(z4);

        Seller z5 = new Seller();
        z5.setName("الشركة السعودية للاغذية");
        c1.create(z5);

        /////////////////////////////////////

        a1.read();
        b1.read();
        c1.read();


        double Sum;
        Sum = x1.getPrice() + x2.getPrice() + x3.getPrice() + x4.getPrice() + x5.getPrice();

        System.out.println(" إجمالي فاتورة الشراء:" + (Sum));

        System.out.println(" قيمة الضريبة المضافة:" + (Sum * 0.05));


        System.out.print(" إجمالي فاتورة الشراء مع ال(VOT):" + (Sum + (Sum * 0.05)));

        System.out.println("____________________________________________");
        //الآن نجرب الحذف
        a1.delete(x3);
        a1.read();
        System.out.println("____________________________________________");

        //الأن نجرب التحديث أو التعديل
        Item w3 = new Item();
        w3.setId(2);
        w3.setName("سنكرس");
        w3.setPrice(35.0);

        a1.update(w3);
        a1.read();

    }
}
