package org.example;

public class Box<T> {

    private T t;
    public void setValue(T t){
        this.t=t;
    }

    public T getValue(){
        return t;
    }

    public static void main(String[] args) {
        Box<String> stringBox=new Box<>();
        stringBox.setValue("123");
        System.out.println(stringBox.getValue());
    }
}
