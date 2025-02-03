package com.arneam.java8.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Stream;

public class StreamCreation {
    public long createFromArray(Integer[] integers) {
        Stream<Integer> stream = Arrays.stream(integers);
        return stream.count();
    }

    public long createFromCollection(Collection<Integer> collection) {
        Stream<Integer> stream = collection.stream();
        return stream.count();
    }

    public long createFromMap(Map<Integer, String> names) {
        // Map is not a Collection (does not have stream())
        // Set is a Collection (and Collections have stream())
        // So entrySet() give us a Set (i.e. Collection) view of the Map
        Stream<Map.Entry<Integer, String>> stream = names.entrySet().stream();
        return stream.count();
    }

    @SafeVarargs
    public final <T> long createFromValues(T... values) {
        Stream<T> streamOfValues = Stream.of(values);
        return streamOfValues.count();
    }

    public long createFromFile(Path resourceFile) throws IOException {
        String filePath = resourceFile.toFile().getAbsolutePath();
        try (Stream<String> fileStream = Files.lines(Paths.get(filePath))) {
            fileStream.forEach(s ->
                    System.out.println("do something with " + s));
        }
        try (Stream<String> fileStream = Files.lines(Paths.get(filePath))) {
            return fileStream.count();
        }
    }

    public long infiniteRandomStream() {
        return Stream.generate(Math::random)
            .peek(System.out::println)
            .limit(100) // if comment this line, goes to infinity
            .count();
    }

    public long infiniteEvenStream() {
        return Stream.iterate(0, n -> 2 + n)
            .peek(System.out::println)
            .limit(100) // if comment this line, goes to infinity
            .count();
    }
}
