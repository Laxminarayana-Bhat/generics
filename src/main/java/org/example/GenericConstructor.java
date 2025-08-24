package org.example;

public class GenericConstructor {
    Object obj;
    public <T> GenericConstructor(T t) {//generic constructor
        this.obj=t;
    }
    void get(){
        System.out.println("getting");
    }

    public static void main(String[] args) {
        new GenericConstructor("obj").get();

    }
}
