package com.arneam.java8.lambda;

import java.util.function.Predicate;

public class SomeValidator<T> {
    public static <T> boolean check(T i, Predicate<T> p) {
        return p.test(i);
    }
}
