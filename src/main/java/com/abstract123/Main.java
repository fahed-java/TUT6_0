package com.abstract123;

public class Main {
    public static Database data = new Database();

    public static void main(String[] args) {


        Customer a1 = new Customer(1 , "أحمد", "0503380000", "1009876667", "ذكر", 100);
        a1.create(0);
//        Customer a2 = new Customer(2,  "وليد", "0503381111", "1009876667", "ذكر", 200);
//        a2.create(1);
//        Customer a3 = new Customer(3,"يوسف", "0503382222", "1009876667", "ذكر", 150);
//        a3.create(2);
//        Customer a4 = new Customer(4,"حمده", "0503383333", "1009876667", "أنثى", 130);
//        a4.create(3);
//        Customer a5 = new Customer(5,"منى", "0503384444", "1009876667", "أنثى", 440);
//        a5.create(4);
//        Customer a6 = new Customer(6,"خلود", "0503385555", "1009876667", "أنثى", 600);
//        a6.create(5);
//        Customer a7 = new Customer(7,"علي", "0503386666", "1009876667", "ذكر", 380);
//        a7.create(6);
//        Customer a8 = new Customer(8,"سعاد", "0503387777", "1009876667", "أنثى", 460);
//        a8.create(7);
//        Customer a9 = new Customer(9,"يزن", "050338888", "1009876667", "ذكر", 350);
//        a9.create(8);
//        Customer a10 = new Customer(10,"عبدالحميد", "050338999", "1009876667", "ذكر", 190);
//        a10.create(9);
//        for (int i = 0; i < Main.data.getCustomers().length; i++) {
//            Main.data.getCustomers()[i].show();
//
//        }
//        a1.delete();
//        for (int i = 0; i < Main.data.getCustomers().length; i++) {
//          if (Main.data.getCustomers()[i]==null){
//              continue;
//
//          }
//            Main.data.getCustomers()[i].show();
//
//        }

        a1.show();
        Customer b1 = new Customer();
        b1.setName("مضحي");
   a1.update(b1);
   a1.show();

//        Employee b1 = new Employee("فهد", "0503380000", "1009876667", "ذكر", 12000.90);
//        b1.show();
//        Employee b2 = new Employee("خالد", "0503381111", "1009876667", "ذكر", 12000.90);
//        b2.show();
//        Employee b3 = new Employee("محمد", "0503382222", "1009876667", "ذكر", 12000.90);
//        b3.show();
//        Employee b4 = new Employee("جميلة", "0503383333", "1009876667", "أنثى", 12000.90);
//        b4.show();
//        Employee b5 = new Employee("منى", "0503384444", "1009876667", "أنثى", 12000.90);
//        b5.show();
//        Employee b6 = new Employee("سعد", "0503385555", "1009876667", "ذكر", 12000.90);
//        b6.show();
//        Employee b7 = new Employee("صالح", "0503386666", "1009876667", "ذكر", 12000.90);
//        b7.show();
//        Employee b8 = new Employee("أمل", "0503387777", "1009876667", "أنثى", 12000.90);
//        b8.show();
//        Employee b9 = new Employee("فيصل", "050338888", "1009876667", "ذكر", 12000.90);
//        b9.show();
//        Employee b10 = new Employee("عمر", "050338999", "1009876667", "ذكر", 12000.90);
//        b10.show();

    }
}

