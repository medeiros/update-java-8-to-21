package com.arneam.java8.lambda;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class BiFunctionLambdaTest {

    @ParameterizedTest
    @CsvSource({"joao,maria,joao e maria",
            "corinthians,palmeiras,corinthians e palmeiras"})
    void shouldConcatValues(String value1, String value2,
                            String expectedValue) {
        BiFunctionLambda biFunctionLambda = new BiFunctionLambda();
        String result = biFunctionLambda.concatValues(value1, value2);
        assertThat(result, is(equalTo(expectedValue)));
    }
}