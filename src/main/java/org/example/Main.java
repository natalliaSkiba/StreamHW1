package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int res = Arrays.stream(arr)
                .map(el -> {
                    if (el % 2 == 0) {
                        el = el * 3;
                    } else {
                        el = el * 5;
                    }
                    return el;
                })
                .peek(System.out::println)
                .filter(el -> el > 25)
                .reduce((n1, n2) -> n1 + n2)
                .get();
        System.out.println(" Result = " + res);
    }
}