package com.arneam.java8.streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class StreamsLazyTest {

    private StreamsLazy stream;

    @BeforeEach
    void setup() {
        stream = new StreamsLazy();
    }

    @Test
    void shouldFindPerson() {
        assertThat(stream.findFirstPersonThatStartsWithA(
                "John", "Alex", "David", "April", "Edward"),
                is(equalTo("ALEX")));
    }

    @Test
    void shouldGetFirstPersonOfTheMagicalFilter() {
        assertThat(stream.findFirstPersonOfMagicalFilter("April",
                        "Ben", "Charlie", "David", "Bach", "Mozart",
                        "Schopenhauer"),
                is(equalTo("Charlie")));
    }


}