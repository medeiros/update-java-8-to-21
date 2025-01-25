package com.arneam.java8.lambda;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class NegativeNumberPredicateTest {

    @Test
    void shouldPredicateNegativeNumber() {
        NegativeNumberPredicate negativeNumberPredicate = new NegativeNumberPredicate();
        assertThat(negativeNumberPredicate.test(-1), is(true));
        assertThat(negativeNumberPredicate.test(1), is(false));
    }
}