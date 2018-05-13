package com.firstApp;

public class Main {
    public static void main(String[] args) {
System.out.println("نتيجة الطالب محمد");
        Student n1 = new Student();
        n1.setName("محمد");
        n1.setDrgh1(25);
        n1.setDrgh2(15);
        System.out.println("مجموع الدرجات:" + n1.sumdrgh());
        System.out.println("نسبة العملي:" + n1.nesbh());
        System.out.println("الدرجة النهائية:" + n1.finaldrgat());

        System.out.println("نتيجة الطالب عمر");
        Student n2 = new Student();
        n2.setName("عمر");
        n2.setDrgh1(5);
        n2.setDrgh2(20);
        System.out.println("مجموع الدرجات:" + n2.sumdrgh());
        System.out.println("نسبة العملي:" + n2.nesbh());
        System.out.println("الدرجة النهائية:" + n2.finaldrgat());

        System.out.println("نتيجة الطالب علي");
        Student n3 = new Student();
        n3.setName("علي");
        n3.setDrgh1(20);
        n3.setDrgh2(20);
        System.out.println("مجموع الدرجات:" + n3.sumdrgh());
        System.out.println("نسبة العملي:" + n3.nesbh());
        System.out.println("الدرجة النهائية:" + n3.finaldrgat());

        System.out.println("نتيجة الطالب عثمان");
        Student N4 = new Student();
        N4.setName("عثمان");
        N4.setDrgh1(16);
        N4.setDrgh2(10);
        System.out.println("مجموع الدرجات:" + N4.sumdrgh());
        System.out.println("نسبة العملي:" + N4.nesbh());
        System.out.println("الدرجة النهائية:" + N4.finaldrgat());

    }

}
