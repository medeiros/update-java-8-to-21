package com.arneam.java8.lambda;

interface Eval<T> {
    boolean isNegative(T t);
}

public class PredicateLambda {

    public boolean isNegative(Integer i) {
        Eval<Integer> lambda = t -> t < 0;
        return lambda.isNegative(i);
    }

}
