package com.arneam.java8.lambda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class BiPredicateLambdaTest {

    BiPredicateLambda lambda;

    @BeforeEach
    void setup() {
        this.lambda = new BiPredicateLambda();
    }

    @Test
    public void shouldPredicate() {
        assertThat(this.lambda.hasCityInName("Vatican City"), (is(true)));
    }

    @Test
    public void shouldBiPredicate() {
        assertThat(this.lambda.hasCityInName(12,"Vatican City"), (is(true)));
        assertThat(this.lambda.hasCityInName(13,"Vatican City"), (is(false)));
        assertThat(this.lambda.hasCityInName(9,"Sao Paulo"), (is(false)));
    }

}