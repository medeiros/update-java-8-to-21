package com.arneam.java8.lambda;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class FunctionLambdaTest {

    @Test
    void shouldGetStringSize() {
        FunctionLambda functionLambda = new FunctionLambda();
        assertThat(functionLambda.stringSize("daniel"),
                is(equalTo(6)) );
    }

}