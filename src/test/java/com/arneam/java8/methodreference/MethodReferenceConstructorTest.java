package com.arneam.java8.methodreference;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class MethodReferenceConstructorTest {

    @Test
    void shouldCreateConstructorMethodReference() {
        MethodReferenceConstructor m = new MethodReferenceConstructor();
        assertThat(m.concat("john", "mary"), is(equalTo(
                "john and mary")));
    }

    @Test
    void shouldCreateConstructorMethodReferenceWithUppercase() {
        MethodReferenceConstructor m = new MethodReferenceConstructor();
        assertThat(m.concatUpper("john", "mary"), is(equalTo(
                "JOHN AND MARY")));
    }

}