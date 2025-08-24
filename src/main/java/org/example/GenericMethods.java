package org.example;

import java.util.function.BiFunction;
import java.util.function.Function;

public class GenericMethods {

    public <T> void general(T t) {

    }

    public static <T> void printArray(T[] arr) {
        for (T ele : arr) {
            System.out.println(ele);
        }
    }

    public static void main(String[] args) {
        GenericMethods.printArray(new Integer[]{1, 2, 3});
        GenericMethods.printArray(new String[]{"a", "b", "c"});
        System.out.println(doOperation(1, 2, Integer::sum));
        System.out.println(doOperation(1, 2, (a, b) -> a - b));
        Function<Integer,Float> function=(a)-> (float) (1.11+a);
        function.apply(1);
    }

    public static <T> T doOperation(T param1, T param2, BiFunction<T, T, T> function) {
        //usually function takes 1 param and 1 result, here use bi as it takes 2 params and gives 1 result
        return function.apply(param1, param2);
    }

    //Why does Java use Type Erasure?
    //
    //Because generics were added in Java 5, and Java needed backward compatibility with pre-existing code and the JVM, which was not designed to support generics natively.
    //
    //So Java generics are a compile-time only feature — they do not exist at runtime.
}
