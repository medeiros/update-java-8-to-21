package com.arneam;

interface I {
    String m();
}

public class BasicLambda {

    public void run() {


        // lambda
        I lambdaI = () -> {
            return "lambdaI";
        };
        lambdaI.m();

//        // lambda with one statement and implicit return
//        I lambdaI2 = () -> return "lambdaI with one statement";
//        lambdaI2.m();

        // lambda with one statement and implicit return
        I lambdaI3 = () -> "lambdaI with one statement";
        lambdaI3.m();
    }

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
