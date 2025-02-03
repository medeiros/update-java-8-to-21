package com.arneam.java8.methodreference;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferenceStatic {
    public void sort(List<Integer> numbers) {
        // Static method references are unbounded
        // it can also be written as lambda: "c -> Collections.sort(c)"
        // (but method reference makes it simpler)
        Consumer<List<Integer>> consumer = Collections::sort;
        consumer.accept(numbers);
    }
}
