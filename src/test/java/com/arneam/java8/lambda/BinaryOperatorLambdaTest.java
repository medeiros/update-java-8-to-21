package com.arneam.java8.lambda;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class BinaryOperatorLambdaTest {

    @ParameterizedTest
    @CsvSource({"jose, maria, josemaria", "verde, amarelo, verdeamarelo"})
    void shouldConcatStrings(String value1, String value2, String result) {
        BinaryOperatorLambda lambda = new BinaryOperatorLambda();
        assertThat(lambda.concatString(value1, value2), is(equalTo(result)));
    }
}