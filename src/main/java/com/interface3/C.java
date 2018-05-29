package com.interface3;

public class C implements B{// printB() و printA() للدالتين Override إذاً يجب أن يفعل .B و الذي بدوره يرث من الإنترفيس B يطبق من الإنترفيس C هنا الكلاس


        @Override                 // printA() للدالة Override مجبور أن يفعل C الكلاس
      public   void printA() {
            System.out.println("C should Override the method printA()");
        }

        @Override                 // printB() للدالة Override مجبور أن يفعل C الكلاس
       public void printB() {
            System.out.println("C should Override the method printB()");
        }

    }

