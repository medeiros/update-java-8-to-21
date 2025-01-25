package com.arneam.java8.lambda;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


class SupplierLambdaTest {

    @Test
    void shouldSupplyStringBuilder() {
        SupplierLambda supplierLambda = new SupplierLambda();
        assertThat(supplierLambda.supplyMovie(), is(equalTo("ironMan")));
        assertThat(supplierLambda.supplyRandom(), is(closeTo(1, 1)));
        assertThat(supplierLambda.supplyTime(), is(notNullValue(LocalTime.class)));
    }

}