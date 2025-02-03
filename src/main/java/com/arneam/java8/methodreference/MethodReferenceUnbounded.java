package com.arneam.java8.methodreference;

import java.util.function.Function;

public class MethodReferenceUnbounded {

    public String apply(String name) {
        // method reference is unbounded, because there is no variable
        // or attribute to reference
        // it can also be written as lambda: "s -> s.toUpperCase()"
        // each method reference is converted to lambda by the compiler
        Function<String, String> f = String::toUpperCase;
        return f.apply(name);
    }
}