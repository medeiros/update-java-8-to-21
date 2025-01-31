package com.arneam.java8.lambda;

import java.util.function.BinaryOperator;

public class BinaryOperatorLambda {
    public String concatString(String value1, String value2) {
        BinaryOperator<String> operator = String::concat;
        return operator.apply(value1, value2);
    }
}
