package org.example;

public interface Constants {
    //by default - public static final variables and public abstract methods
    //can have multiple static and default methods and default methods can be accessed only by objects
    //can achieve multiple inheritance using inheritance
    int a = 10;
    long b = 10L;

    int returnInt(int x);

    public static void main(String[] args) {
        System.out.println("main method in interface");
    }//main method in interface 😲

}
