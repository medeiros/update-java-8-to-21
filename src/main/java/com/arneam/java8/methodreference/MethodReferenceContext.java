package com.arneam.java8.methodreference;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceContext {
    public int countIntegers() {
        // compiler infers that it must send zero integers based on the
        // functional interface type (Supplier takes zero params)
        Supplier<Integer> supplier = this::howMany;
        return supplier.get();
    }

    public int countIntegers(int oneInteger) {
        // compiler infers that it must send one integer to the howMany function
        // based on the functional interface type (function takes one param)
        Function<Integer, Integer> func = this::howMany;
        return func.apply(oneInteger);
    }

    public int countIntegers(int oneInteger, int otherInteger) {
        // compiler infers that it must send two integers to the howMany function
        // based on the functional interface type (BiFunction takes two params)
        BiFunction<Integer, Integer, Integer> biFunc = this::howMany;
        return biFunc.apply(oneInteger, otherInteger);
    }

    private int howMany(Integer... ints) {
        return ints.length;
    }

}



