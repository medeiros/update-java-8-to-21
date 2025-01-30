package com.arneam.java8.lambda;

import java.util.function.Function;

public class FunctionLambda {

    public int stringSize(String name) {
        Function<String, Integer> function = String::length;
        return function.apply(name);

    }

}
