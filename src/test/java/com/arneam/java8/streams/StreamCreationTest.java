package com.arneam.java8.streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class StreamCreationTest {

    private StreamCreation streamCreation;

    @BeforeEach
    void setup() {
        this.streamCreation = new StreamCreation();
    }

    @Test
    void shouldCreateStreamFromArray() {
        assertThat(streamCreation.createFromArray(new Integer[] {1, 2, 3, 4}),
                is(equalTo(4L)));
    }

    @Test
    void shouldCreateStreamFromCollection() {
        assertThat(streamCreation.createFromCollection(Arrays.asList(1, 2, 3, 4)),
                is(equalTo(4L)));
    }

    @Test
    void shouldCreateStreamFromMap() {
        Map<Integer, String> names = new HashMap<>();
        names.put(1, "John");
        names.put(2, "Mary");
        names.put(3, "Lucas");
        names.put(4, "Matheus");
        assertThat(streamCreation.createFromMap(names),
                is(equalTo(4L)));
    }

    @Test
    void shouldCreateStreamFromListOfValues() {
        assertThat(streamCreation.createFromValues("a", "b", "c", "d"),
                is(equalTo(4L)));

        assertThat(streamCreation.createFromValues(1, 2, 3),
                is(equalTo(3L)));
    }

    @Test
    void shouldCreateStreamFromFile() throws IOException {
        Path resourceFile = Paths.get(
                "src","test","resources", "teststream.txt");
        assertThat(streamCreation.createFromFile(resourceFile),
                is(equalTo(4L)));
    }

}