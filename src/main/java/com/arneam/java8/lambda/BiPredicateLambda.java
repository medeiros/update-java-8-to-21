package com.arneam.java8.lambda;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateLambda {
    public boolean hasCityInName(String value) {
        Predicate<String> p = x -> x.contains("City");
        return p.test(value);
    }

    public boolean hasCityInName(Integer length, String value) {
        BiPredicate<Integer, String> bi = (a, b) ->
            { return this.hasCityInName(value) && b.length() == a;};
        return bi.test(length, value);
    }
}
