package com.arneam.java8.lambda;

import com.github.stefanbirkner.systemlambda.SystemLambda;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class ConsumerLambdaTest {

    private ConsumerLambda consumerLambda;

    @BeforeEach
    void setup() {
        this.consumerLambda = new ConsumerLambda();
    }

    @Test
    void shouldPrintData() throws Exception {
        String result = SystemLambda.tapSystemOut(() -> this.consumerLambda.print("javajava"));
        assertThat(result, is(equalTo("javajava\n")));
    }

    @Test
    void shouldPrintSeveralData() throws Exception {
        List<String> names = new ArrayList<>();
        names.add("Joao");
        names.add("Maria");
        String result = SystemLambda.tapSystemOut(() -> this.consumerLambda.print(names));
        assertThat(result, is(equalTo("Joao\nMaria\n")));
    }

}