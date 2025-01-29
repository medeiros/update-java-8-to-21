package com.arneam.java8.lambda;

import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerLambda {

    public void capitalAndCity(String capital, String city) {
        BiConsumer<String, String> biConsumer = getStringStringBiConsumer();
        biConsumer.accept(capital, city);
    }

    public void capitalsAndCities(Map<String, String> capitalsCities) {
        capitalsCities.forEach(getStringStringBiConsumer());
    }
    private BiConsumer<String, String> getStringStringBiConsumer() {
        return (a, b) -> new ConsumerLambda()
                .print(a.concat(" is the capital of ").concat(b).concat( "; "));
    }

}
