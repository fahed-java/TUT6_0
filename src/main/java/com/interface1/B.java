package com.interface1;

public class B implements A {    // A ينفذ الإنترفيس B هنا قلنا أن الكلاس
    @Override               // public لا تنسى إضافة كلمة .print() للدالة Override مجبور أن يفعل B الكلاس
    public void print() {
        System.out.println("B should Override this method");
    }
}
