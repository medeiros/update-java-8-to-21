package com.arneam.java8.lambda;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


class SupplierLambdaTest {

    @Test
    void shouldSupplyStringBuilder() {
        SupplierLambda supplierLambda = new SupplierLambda();
        assertThat(supplierLambda.supply(), is(equalTo("ironMan")));
    }

}