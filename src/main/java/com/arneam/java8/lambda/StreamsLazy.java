package com.arneam.java8.lambda;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsLazy {
    private String found = "";

    public String findFirstPersonThatStartsWithA(String... people) {
        boolean hasFound = Stream.of(people).peek(System.out::println)
                .map(String::toUpperCase).anyMatch(p -> {
            if (p.startsWith("A")) {
                this.found = p;
                return true;
            }
            return false;
        });
        return hasFound ? found : "notFound";
    }

    public String findFirstPersonOfMagicalFilter(String... people) {
        return Stream.of(people).peek(System.out::println)
            .filter(s -> s.startsWith("B") || s.startsWith("C"))
            .filter(s -> s.length() > 3)
            .limit(1) // it will discard the others once one item is found
            .collect(Collectors.joining());
    }
}
