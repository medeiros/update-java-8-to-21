package com.arneam.java8.methodreference;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class MethodReferenceUnboundedTest {

    @ParameterizedTest
    @CsvSource({"john,JOHN","mary,MARY"})
    void shouldExecuteUnBoundedMethodReference(String name, String
            expectedResult) {
        MethodReferenceUnbounded m = new MethodReferenceUnbounded();
        assertThat(m.apply(name), is(equalTo(expectedResult)));
    }

}