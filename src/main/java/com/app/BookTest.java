package com.app;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.id = 1;
        book1.code = 1460;
        book1.name = "فقه";
        book1.writer = "فهد";
        book1.price = 100;



        Book book2 = new Book();
        book2.id = 2;
        book2.code = 1590;
        book2.name = "توحيد";
        book2.writer = "خالد";
        book2.price = 120;


        Book book3 = new Book();
        book3.id = 3;
        book3.code = 1475;
        book3.name = "حديث";
        book3.writer = "عمر";
        book3.price =90;


        Book book4 = new Book();
        book4.id = 4;
        book4.code = 1212;
        book4.name = "تفسير";
        book4.writer = "سامي";
        book4.price = 95;


        Book book5 = new Book();
        book5.id = 5;
        book5.code = 1010;
        book5.name = "لغة عربية";
        book5.writer ="سلمان";
        book5.price = 125;


        Book[] arar = new Book[5];
        arar[0] = book1;
        arar[1] = book2;
        arar[2] = book3;
        arar[3] = book4;
        arar[4] = book5;


        for (int i=0 ; i<5 ; i++){
arar[i].print();

        }


    }
}
