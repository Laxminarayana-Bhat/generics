package org.example;

public abstract class ContainerImpl implements Container<Integer>{
    @Override
    public void addT(Integer integer) {
        System.out.println(integer);
    }


}
