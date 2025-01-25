package com.arneam.java8.lambda;

import java.util.function.Predicate;

public class NegativeNumberPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        return integer < 0;
    }
}
