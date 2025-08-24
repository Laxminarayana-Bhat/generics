package org.example;

public class TypeErasureTest<T> {
    public void get(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        TypeErasureTest<String> typeErasureTest = new TypeErasureTest<>();
        typeErasureTest.get("hello");
        //typeErasureTest.get((Object) "hello"); // cast inserted automatically
    }
}
