package com.arneam.java8.streams;

import com.github.stefanbirkner.systemlambda.SystemLambda;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class ReduceTest {

    private Reduce reduce;

    @BeforeEach
    void setup() {
        reduce = new Reduce();
    }

    @ParameterizedTest
    @CsvSource({"d,a,n,y,dany", "j,o,h,n,john"})
    void shouldReduceName(String v1, String v2, String v3, String v4, String result) {
        assertThat(reduce.name(v1, v2, v3, v4), is(equalTo(result)));
    }

    @ParameterizedTest
    @CsvSource({"2, 3, 4, 24", "1, 2, 3, 6"})
    void shouldGetProductOfNumbers(int v1, int v2, int v3, int result) {
        assertThat(reduce.product(v1, v2, v3), is(equalTo(result)));
    }

    @Test
    void reduceEmpty() throws Exception {
        String result = SystemLambda.tapSystemOutNormalized(() ->
                this.reduce.reduceEmpty());
        assertThat(result, is(equalTo("")));
    }

    @Test
    void reduceOneElement() throws Exception {
        String result = SystemLambda.tapSystemOutNormalized(() ->
                this.reduce.reduceOne(6));
        assertThat(result, is(equalTo("6\n")));
    }

    @ParameterizedTest
    @CsvSource({"6, 8, 10, 24", "1, 2, 3, 6"})
    void reduceMultipleElements(Integer v1, Integer v2, Integer v3,
                                String expectedResult) throws Exception {
        String result = SystemLambda.tapSystemOutNormalized(() ->
                this.reduce.reduceMultiple(v1, v2, v3));
        assertThat(result, is(equalTo(expectedResult + "\n")));
    }

    @ParameterizedTest
    @CsvSource({"car, bus, train, 11", "john, mary, thomas, 14"})
    void shouldReduceLengthOfWords(String name1, String name2, String name3, int count) {
        assertThat(reduce.length(name1, name2, name3), is(equalTo(count)));
    }

}