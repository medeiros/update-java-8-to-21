package com.arneam.java8.methodreference;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class MethodReferenceBoundedTest {

    @Test
    void shouldExecuteBoundedMethodReference() {
        MethodReferenceBounded m = new MethodReferenceBounded();
        assertThat(m.test("Mr. "), is(true));
        assertThat(m.test("Ms. "), is(false));
    }

}
