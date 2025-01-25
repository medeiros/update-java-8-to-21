package com.arneam.java8.lambda;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerLambda {

    public void print(String value) {
        getStringConsumer().accept(value);
    }

    public void print(List<String> names) {
        names.forEach(getStringConsumer());
    }

    private static Consumer<String> getStringConsumer() {
        return System.out::println;
    }

}
