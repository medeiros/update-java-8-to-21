package com.arneam.java8.lambda;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class FunctionLambdaTest {

    @ParameterizedTest
    @CsvSource({"daniel,6", "maria,5", "diana,5", "patricia,8"})
    void shouldGetStringSize(String name, int size) {
        FunctionLambda functionLambda = new FunctionLambda();
        assertThat(functionLambda.stringSize(name),
                is(equalTo(size)));
    }

}