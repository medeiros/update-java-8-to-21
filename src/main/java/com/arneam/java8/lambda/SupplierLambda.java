package com.arneam.java8.lambda;

import java.time.LocalTime;
import java.util.function.Supplier;

public class SupplierLambda {

    public String supplyMovie() {
        Supplier<StringBuilder> s = () -> new StringBuilder("ironMan");
        return s.get().toString();
    }

    public double supplyRandom() {
        Supplier<Double> s = Math::random;
        return s.get();
    }

    public LocalTime supplyTime() {
        Supplier<LocalTime> lt = LocalTime::now;
        return lt.get();
    }
}
