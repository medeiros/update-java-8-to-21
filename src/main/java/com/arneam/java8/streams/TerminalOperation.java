package com.arneam.java8.streams;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOperation {
    public long count(Integer... values) {
        // terminal operation - reduce operation (look into all the elements)
        return Stream.of(values).count();
    }

    public int min(Integer... values) {
        // terminal operation - reduce operation (look into all the elements)
        Optional<Integer> result = Stream.of(values).min(comparator());
        return result.orElse(0);
    }

    public int max(Integer... values) {
        // terminal operation - reduce operation (look into all the elements)
        Optional<Integer> result = Stream.of(values).max(comparator());
        return result.orElse(0);
    }

    private static Comparator<Integer> comparator() {
        return Comparator.comparingInt(s -> s);
    }

}
