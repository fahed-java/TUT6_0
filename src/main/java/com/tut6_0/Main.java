package com.tut6_0;

public class Main {
    public static void main(String[] args) {
        Category c1 = new Category();
        c1.setName("سناكس");
        Seller x1 = new Seller();
        x1.setName("مؤسسة المدار");

        Item m1 = new Item();
        m1.setCode(1);
        m1.setName("بطاطس السعودية");
        m1.setPrice(8);
        m1.setCategory(c1);
        m1.setSeller(x1);
        System.out.println("رقم الصنف:" + m1.getCode());
        System.out.println("اسم الصنف:" + m1.getName());
        System.out.println("سعر الصنف:" + m1.getPrice());
        System.out.println("التصنيف:" + c1.getName());
        System.out.println("التاجر:" + x1.getName());
        System.out.println("____________________________");

        Category c2 = new Category();
        c2.setName("حلويات");
        Seller x2 = new Seller();
        x2.setName("الشركة السعودية للأغذية");
        Item m2 = new Item();
        m2.setCode(2);
        m2.setName("حلاوة طحينية");
        m2.setPrice(22);
        m2.setCategory(c2);
        m2.setSeller(x2);
        System.out.println("رقم الصنف:" + m2.getCode());
        System.out.println("اسم الصنف:" + m2.getName());
        System.out.println("سعر الصنف:" + m2.getPrice());
        System.out.println("التصنيف:" + c2.getName());
        System.out.println("التاجر:" + x2.getName());
        System.out.println("____________________________");


        Category c3 = new Category();
        c3.setName("حلويات");
        Seller x3 = new Seller();
        x3.setName("مؤسسة المدار");
        Item m3 = new Item();
        m3.setCode(3);
        m3.setName("مربى حلواني");
        m3.setPrice(7);
        m3.setCategory(c3);
        m3.setSeller(x3);
        System.out.println("رقم الصنف:" + m3.getCode());
        System.out.println("اسم الصنف:" + m3.getName());
        System.out.println("سعر الصنف:" + m3.getPrice());
        System.out.println("التصنيف:" + c3.getName());
        System.out.println("التاجر:" + x3.getName());
        System.out.println("____________________________");


        Category c4 = new Category();
        c4.setName("أجبان");
        Seller x4 = new Seller();
        x4.setName("مؤسسة المدار");
        Item m4 = new Item();
        m4.setCode(4);
        m4.setName("جبنة شيدر");
        m4.setPrice(5);
        m4.setCategory(c4);
        m4.setSeller(x4);
        System.out.println("رقم الصنف:" + m4.getCode());
        System.out.println("اسم الصنف:" + m4.getName());
        System.out.println("سعر الصنف:" + m4.getPrice());
        System.out.println("التصنيف:" + c4.getName());
        System.out.println("التاجر:" + x4.getName());
        System.out.println("____________________________");


        Category c5 = new Category();
        c5.setName("أعشاب");
        Seller x5 = new Seller();
        x5.setName("الشركة السعودية للأغذية");
        Item m5 = new Item();
        m5.setCode(5);
        m5.setName("شطة حمراء");
        m5.setPrice(13);
        m5.setCategory(c5);
        m5.setSeller(x5);
        System.out.println("رقم الصنف:" + m5.getCode());
        System.out.println("اسم الصنف:" + m5.getName());
        System.out.println("سعر الصنف:" + m5.getPrice());
        System.out.println("التصنيف:" + c5.getName());
        System.out.println("التاجر:" + x5.getName());
        System.out.println("____________________________");

        Customer z1 = new Customer();
        z1.setName("محمد");
        System.out.println("فاتورة العميل:" + z1.getName());

        Fatorh a1 = new Fatorh();
        a1.setCode(1259);
        System.out.println("رقم الفاتورة:" + a1.getCode());

        System.out.println("الصنف:" + m1.getName() + "       السعر:" + m1.getPrice());
        System.out.println("الصنف:" + m2.getName() + "       السعر:" + m2.getPrice());
        System.out.println("الصنف:" + m3.getName() + "       السعر:" + m3.getPrice());
        System.out.println("الصنف:" + m4.getName() + "       السعر:" + m4.getPrice());
        System.out.println("الصنف:" + m5.getName() + "       السعر:" + m5.getPrice());

       double Sum = m1.getPrice()+m2.getPrice()+m3.getPrice()+m4.getPrice()+m5.getPrice();

        System.out.println( "إجمالي فاتورة الشراء:" +(Sum));

        System.out.println( "قيمة الضريبة المضافة:" +(Sum*0.05));


        System.out.print( "Total:"  + (Sum+(Sum*0.05)));

    }

}
