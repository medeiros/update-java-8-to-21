package com.arneam.java8.lambda;

import java.util.function.Supplier;

public class SupplierLambda {

    public String supply() {
        Supplier<StringBuilder> s = () -> new StringBuilder("ironMan");
        return s.get().toString();
    }
}
