package com.arneam.java8.methodreference;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceConstructor {
    public String concat(String name1, String name2) {
        return concatWithNoArgsConstructor(name1, name2);
    }

    public String concatUpper(String name1, String name2) {
        return concatWithSingleArgConstructor(name1, name2);
    }

    private static String concatWithNoArgsConstructor(String name1, String name2) {
        // method reference is related to object creation with ::new (when the only
        //      thing that the method do is to create an instance
        // can be called as lambda: "() -> new StringBuilder()"
        Supplier<StringBuilder> s = StringBuilder::new;
        return s.get().append(name1).append(" and ").append(name2).toString();
    }

    private static String concatWithSingleArgConstructor(String name1, String name2) {
        // method reference is related to object creation with ::new (when the only
        //      thing that the method do is to create an instance
        // It can take one parameter and still uses the same MR syntax with ::new
        //      (the parameter is inferred)
        // can be called as lambda: "(s) -> new StringBuilder(s)"
        Function<String, StringBuilder> f = StringBuilder::new;
        return f.apply(name1.toUpperCase()).append(" AND ")
                .append(name2.toUpperCase()).toString();
    }
}
