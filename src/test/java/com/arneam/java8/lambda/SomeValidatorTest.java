package com.arneam.java8.lambda;

import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class SomeValidatorTest {

    @Test
    void shouldValidateEvenNumber() {
        assertThat(SomeValidator.check(2, n -> n % 2 == 0), is(true));
        assertThat(SomeValidator.check(2, n -> n % 2 == 1), is(false));
    }

    @Test
    void shouldValidateGentleman() {
        Predicate<String> misterPredicate = s -> s.startsWith("Mr.");
        assertThat(SomeValidator.check("Mr. Crowley", misterPredicate), is(true));
        assertThat(SomeValidator.check("Miss Crowley", misterPredicate), is(false));
    }

}