package com.arneam.java8.lambda;

import java.util.function.UnaryOperator;

public class UnanyOperatorLambda {
    public String peopleLocation(String name) {
        UnaryOperator<String> unaryOperator = String::toUpperCase;
        return unaryOperator.apply(name);
    }

    public String userIdentity(String name) {
        return UnaryOperator.identity().apply(name).toString();
    }
}
