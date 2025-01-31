package com.arneam.java8.lambda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class UnanyOperatorLambdaTest {

    private UnanyOperatorLambda unaryLambda;

    @BeforeEach
    void setup() {
        unaryLambda = new UnanyOperatorLambda();
    }

    @ParameterizedTest
    @CsvSource({"daniel,DANIEL", "maria,MARIA", "diana,DIANA",
            "patricia,PATRICIA"})
    void shouldGetStringSize(String name, String expectedResult) {
        assertThat(unaryLambda.peopleLocation(name),
                is(equalTo(expectedResult)));
    }

    @ParameterizedTest
    @CsvSource({"daniel,daniel", "maria,maria", "diana,diana",
            "patricia,patricia"})
    void shouldGetUserIdentity(String name, String expectedResult) {
        assertThat(unaryLambda.userIdentity(name), is(equalTo(expectedResult)));
    }

}
