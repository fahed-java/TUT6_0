package com.interface2;

public class C implements A,B { // لجميع الدوال التي ورثها Override إذاً يجب أن يفعل B و الإنترفيس A ينفذ الإنترفيس C هنا الكلاس
    @Override                 // printA() للدالة Override مجبور أن يفعل C الكلاس
   public void printA() {
        System.out.println("C should Override the method printA()");
    }

    @Override                 // printB() للدالة Override مجبور أن يفعل C الكلاس
   public void printB() {
        System.out.println("C should Override the method printB()");
    }
}
