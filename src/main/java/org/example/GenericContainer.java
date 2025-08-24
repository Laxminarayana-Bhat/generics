package org.example;

public class GenericContainer<T extends Number> implements Container<T> {
    @Override
    public void addT(T t) {

    }

    @Override
    public T addAndReturnT(T t) {
        return null;
    }
//GenericContainer<T extends Number> - called as bound
}
