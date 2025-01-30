package com.arneam.java8.lambda;

import java.util.StringJoiner;
import java.util.function.BiFunction;

public class BiFunctionLambda {

    public String concatValues(String value1, String value2) {
        BiFunction<String, String, String> biFunction = (s1, s2) ->
                new StringJoiner(" e ").add(s1).add(s2).toString();
        return biFunction.apply(value1, value2);
    }

}
