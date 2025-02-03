package com.arneam.java8.methodreference;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class MethodReferenceContextTest {

    @Test
    void shouldGetZeroIntegers() {
        MethodReferenceContext m = new MethodReferenceContext();
        assertThat(m.countIntegers(), is(equalTo(0)));
    }

    @Test
    void shouldGetOneInteger() {
        MethodReferenceContext m = new MethodReferenceContext();
        assertThat(m.countIntegers(12), is(equalTo(1)));
    }

    @Test
    void shouldGetTwoIntegers() {
        MethodReferenceContext m = new MethodReferenceContext();
        assertThat(m.countIntegers(12, 24), is(
                equalTo(2)));
    }

}