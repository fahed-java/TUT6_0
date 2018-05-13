package com.app;

public class Book {
    int id;
    long code;
    String name;
    String writer;
    double price;
public void print(){
    System.out.println(this.name);
    System.out.println(this.writer);
    System.out.println(this.code);
    System.out.println(this.id);
    System.out.println(this.price);

    //هذه الأسطر الهدف منها مسافة , لأنها تطبع أسطر فاضية
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();

}
}
