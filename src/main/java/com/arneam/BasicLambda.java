package com.arneam;

interface I {
    String m();
}

public class BasicLambda {

    public String anonymousClass() {
        // old style
        I i = new I() {
            public String m() {
                return "I::m()";
            }
        };
        return i.m();
    }

    public String statementLambda() {
        // lambda
        I lambda = () -> {
            return "statementLambda";
        };
        return lambda.m();
    }

    public String expressionLambda() {
        I lambda = () -> "expressionLambda";
        return lambda.m();
    }
}
