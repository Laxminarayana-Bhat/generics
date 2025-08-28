package org.example;

public class Box<T> implements Constants,Container<T>{//multiple inheritance

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

    @Override
    public int returnInt(int x) {
        return 0;
    }

    @Override
    public void addT(Object o) {

    }

    @Override
    public T addAndReturnT(T t) {
        return null;
    }
    //<T> = "I’m declaring a generic type called T."
    //
    //T = "Now I’m using that type I declared."
}
