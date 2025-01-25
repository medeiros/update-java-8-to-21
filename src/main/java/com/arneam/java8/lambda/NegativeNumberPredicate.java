package com.arneam.java8.lambda;

import java.util.function.Predicate;

// Predicate<Integer> is a functional interface (one abstract method)
//      boolean test(T t)
public class NegativeNumberPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        return integer < 0;
    }
}
