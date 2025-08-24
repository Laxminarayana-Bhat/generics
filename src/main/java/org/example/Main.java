package org.example;

public class Main {
    public static void main(String[] args) {
        Object obj = new Object();
        obj = 1;
        try {
            String s = obj.toString();//convert object to string, whatever the type maybe
            s = (String) obj;//Assumes object is already a string
            System.out.println(s);
        } catch (ClassCastException e) {

        } finally {
            System.out.println("move on lil bro");
        }
        Integer i = (Integer) obj;
        System.out.println(i);

        C c = new C();
        c.show();
    }

}

interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B {
    default void show() {
        System.out.println("B");
    }
}

// ❌ Ambiguity must be resolved
class C implements A, B {
    public void show() {
        A.show(); // or B.super.show();
    }

}