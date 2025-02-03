package com.arneam.java8.methodreference;

import java.util.function.Predicate;

public class MethodReferenceBounded {
    String name = "Mr. Crowley";
    public boolean test(String s) {
        // method reference is bounded to the variable
        // it can also be written as lambda: "s -> name.startsWith(s)"
        // each method reference is converted to lambda by the compiler
        Predicate<String> predicatePronoun = name::startsWith;
        return predicatePronoun.test(s);
    }
}
