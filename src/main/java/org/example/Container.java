package org.example;

public interface Container<T> {

    int a = 10;

    int b = 120;

    void addT(T t);

    T addAndReturnT(T t);

    default void addDefault(T t) {//can have default "methods" impl
        System.out.println("default method " + t);
    }

    static void add() {//static "methods" impl
        System.out.println("static method");
    }

    private T returnT(T t) {//java9+ private "methods" impl
        return t;
    }
}
//class A {
//    void show() {
//        System.out.println("A");
//    }
//}
//
//class B extends A {
//    void show() {
//        System.out.println("B");
//    }
//}
//
//class C extends A {
//    void show() {
//        System.out.println("C");
//    }
//}
//
//// ❌ Java does NOT allow this:
//class D extends B, C { // Compilation error!
//    // Ambiguity: should it inherit show() from B or C?
//}   -> Diamond problem

