package com.forloop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//        System.out.println("نتيجة الموظف إبراهيم السبيعي");
//        Student n1 = new Student();
//        n1.setName("إبراهيم السبيعي");
//        n1.setDrgh1(20);
//        n1.setDrgh2(16);
//        n1.setDrgh3(57);
//        System.out.println("المجموع الكلي:" + n1.mgmoa());
//        System.out.println("النتيجة:" + n1.natega());
//        System.out.println("التقدير:" + n1.tagdeer());
//        System.out.println("__________________________________________");
//
//        System.out.println("نتيجة الموظف فيصل المطيري");
//        Student n2 = new Student();
//        n2.setName("فيصل المطيري");
//        n2.setDrgh1(9);
//        n2.setDrgh2(11);
//        n2.setDrgh3(38);
//        System.out.println("المجموع الكلي:" + n2.mgmoa());
//        System.out.println("النتيجة:" + n2.natega());
//        System.out.println("التقدير:" + n2.tagdeer());
//        System.out.println("__________________________________________");
//
//        System.out.println("نتيجة الموظف وائل العجلان");
//        Student n3 = new Student();
//        n3.setName("وائل العجلان");
//        n3.setDrgh1(16);
//        n3.setDrgh2(16);
//        n3.setDrgh3(57);
//        System.out.println("المجموع الكلي:" + n3.mgmoa());
//        System.out.println("النتيجة:" + n3.natega());
//        System.out.println("التقدير:" + n3.tagdeer());
//        System.out.println("__________________________________________");
//
//        System.out.println("نتيجة الموظف ماجد السدلان");
//        Student n4 = new Student();
//        n4.setName("ماجد السدلان");
//        n4.setDrgh1(4);
//        n4.setDrgh2(10);
//        n4.setDrgh3(30);
//        System.out.println("المجموع الكلي:" + n4.mgmoa());
//        System.out.println("النتيجة:" + n4.natega());
//        System.out.println("التقدير:" + n4.tagdeer());
//        System.out.println("__________________________________________");
//
//        System.out.println("نتيجة الموظف سعود القحطاني");
//        Student n5 = new Student();
//        n5.setName("سعود القحطاني");
//        n5.setDrgh1(13);
//        n5.setDrgh2(19);
//        n5.setDrgh3(41);
//        System.out.println("المجموع الكلي:" + n5.mgmoa());
//        System.out.println("النتيجة:" + n5.natega());
//        System.out.println("التقدير:" + n5.tagdeer());
//        System.out.println("__________________________________________");
//
//        System.out.println("نتيجة الموظف عادل الشيخ");
//        Student n6 = new Student();
//        n6.setName("عادل الشيخ");
//        n6.setDrgh1(7);
//        n6.setDrgh2(7);
//        n6.setDrgh3(33);
//        System.out.println("المجموع الكلي:" + n6.mgmoa());
//        System.out.println("النتيجة:" + n6.natega());
//        System.out.println("التقدير:" + n6.tagdeer());
//        System.out.println("__________________________________________");
//
//        System.out.println("نتيجة الموظف حارث الفوزان");
//        Student n7 = new Student();
//        n7.setName("حارث الفوزان");
//        n7.setDrgh1(17);
//        n7.setDrgh2(16);
//        n7.setDrgh3(59);
//        System.out.println("المجموع الكلي:" + n7.mgmoa());
//        System.out.println("النتيجة:" + n7.natega());
//        System.out.println("التقدير:" + n7.tagdeer());
//        System.out.println("__________________________________________");
//
//        System.out.println("نتيجة الموظف عماد الدايل");
//        Student n8 = new Student();
//        n8.setName("عماد الدايل");
//        n8.setDrgh1(12);
//        n8.setDrgh2(14);
//        n8.setDrgh3(32);
//        System.out.println("المجموع الكلي:" + n8.mgmoa());
//        System.out.println("النتيجة:" + n8.natega());
//        System.out.println("التقدير:" + n8.tagdeer());
//        System.out.println("__________________________________________");
//
//        System.out.println("نتيجة الموظف عبدالله المالكي");
//        Student n9 = new Student();
//        n9.setName("عبدالله المالكي");
//        n9.setDrgh1(16);
//        n9.setDrgh2(18);
//        n9.setDrgh3(47);
//        System.out.println("المجموع الكلي:" + n9.mgmoa());
//        System.out.println("النتيجة:" + n9.natega());
//        System.out.println("التقدير:" + n9.tagdeer());
//        System.out.println("__________________________________________");


        Scanner abc111 = new Scanner(System.in);
        while (true) {
            System.out.println("فضلاادخل اسم الطالب");
            String name = abc111.nextLine();


            System.out.println("فضلاادخلأ الدرجةالأولى");
            double D1 = abc111.nextDouble();

            System.out.println("فضلاادخل الدرجةالثانية");
            double D2 = abc111.nextDouble();


            System.out.println("فضلاادخل الدرجةالنهائية");
            double D3 = abc111.nextDouble();


            Student student1 = new Student();
            student1.setName(name);
            student1.setD1(D1);
            student1.setD2(D2);
            student1.setD3(D3);


            System.out.println("المجموع" + student1.mgmoa());
            System.out.println("النتيجة" + student1.natega());
            System.out.println("التقدير" + student1.tagdeer());
            System.out.println("////////////////نهايةالعملية/////////////");
            abc111.nextLine();


        }


    }
}


