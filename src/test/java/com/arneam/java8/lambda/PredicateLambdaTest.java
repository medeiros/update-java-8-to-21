package com.arneam.java8.lambda;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PredicateLambdaTest {
    @Test
    void shouldPredicateNegative() {
        PredicateLambda predicateLambda = new PredicateLambda();
        assertThat(predicateLambda.isNegative(-1), is(true));
        assertThat(predicateLambda.isNegative(0), is(false));
        assertThat(predicateLambda.isNegative(1), is(false));
    }

}
