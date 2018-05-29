package com.interface4;

public class C extends B implements A {  // A و ينفذ الإنترفيس B يرث من الكلاس C هنا الكلاس

    @Override                            // printA() للدالة Override مجبور أن يفعل C الكلاس
   public void printA() {
        System.out.println("C should Override the method printA()");
    }

}
