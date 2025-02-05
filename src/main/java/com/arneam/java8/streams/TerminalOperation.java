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

    public int findAny(Integer... values) {
        // findAny() is a terminal operation but with no reduction,
        // so once the item is found, the return happens without
        // all records are being processed.
        // Reductions reduce the entire stream into one value.
        Optional<Integer> anyValue = Stream.of(values).findAny();
        return anyValue.orElse(0);
    }

    public int findFirst(Integer... values) {
        // findAny() is a terminal operation but with no reduction,
        // so once the item is found, the return happens without
        // all records are being processed.
        // Reductions reduce the entire stream into one value.
        Optional<Integer> anyValue = Stream.of(values).findFirst();
        return anyValue.orElse(0);
    }

    public boolean findAnyMatch(Integer... values) {
        // applies predicate
        // if one matches, returns true
        return Stream.of(values).anyMatch(s -> s > 2);
    }

    public boolean findAllMatch(Integer... values) {
        // applies predicate
        // if all matches, returns true
        return Stream.of(values).allMatch(s -> s > 2);
    }

    public boolean findNoneMatch(Integer... values) {
        // applies predicate
        // if none matches, returns true
        return Stream.of(values).noneMatch(s -> s > 2);
    }

    public void print (String... values) {
        Stream.of(values).forEach(System.out::println);
    }
}
