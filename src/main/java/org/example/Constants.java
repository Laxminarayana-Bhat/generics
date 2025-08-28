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
        Dog dog=new Dog();
        dog.sound();//dog
        dog.callParentSound();//parent
    }//main method in interface 😲

}
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
    void callParentSound() {
        super.sound(); // Calls the method from the parent (Animal) class
    }
}
