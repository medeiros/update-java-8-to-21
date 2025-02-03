package com.arneam.java8.lambda;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class BasicLambdaTest {

    @Test
    void shouldGenerateOldStyleAnonymousClass() {
        BasicLambda basicLambda = new BasicLambda();
        assertThat(basicLambda.anonymousClass(),
                is (equalTo("I::m()")));
    }

    @Test
    void shouldGenerateStatementLambda() {
        BasicLambda basicLambda = new BasicLambda();
        assertThat(basicLambda.statementLambda(),
                is(equalTo("statementLambda")));
    }

    @Test
    void shouldGenerateExpressionLambda() {
        BasicLambda basicLambda = new BasicLambda();
        assertThat(basicLambda.expressionLambda(),
                is(equalTo("expressionLambda")));
    }

}
