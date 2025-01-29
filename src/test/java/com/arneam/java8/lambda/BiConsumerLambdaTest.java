package com.arneam.java8.lambda;

import com.github.stefanbirkner.systemlambda.SystemLambda;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class BiConsumerLambdaTest {

    private BiConsumerLambda biConsumerLambda;

    @BeforeEach
    void setup() {
        this.biConsumerLambda = new BiConsumerLambda();
    }

    @Test
    void shouldPrintCapitalAndCountry() throws Exception {
        String result = SystemLambda.tapSystemOut(() -> this.biConsumerLambda
                .capitalAndCity("Dublin", "Ireland"));
        assertThat(result, is(equalTo("Dublin is the capital of Ireland; \n")));
    }

    @Test
    void shouldPrintCapitalsAndCountries() throws Exception {
        Map<String, String> capitalsCities = new HashMap<>();
        capitalsCities.put("Brasilia", "Brasil");
        capitalsCities.put("Buenos Aires", "Argentina");

        String result = SystemLambda.tapSystemOut(() -> this.biConsumerLambda
                .capitalsAndCities(capitalsCities));
        assertThat(result, is(equalTo(
                "Brasilia is the capital of Brasil; " +
                        "\nBuenos Aires is the capital of Argentina; \n")));
    }

}
