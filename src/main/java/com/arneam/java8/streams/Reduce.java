package com.arneam.java8.streams;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Reduce {
    /**
     * The reduce() method combines a stream into a single object.
     * It is a reduction, which means it processes all elements.
     * The most common way of doing a reduction is to start an initial value
     *  and keep merging it with the next value.
     * <p>
     *  T reduce (T identity, BinaryOperator<T> accumulator)
     *      BinaryOperator<T> functional method:
     *          T apply(T, T);
     *  The "identity" is the initial value of the reduction and also
     *  what is returned if the stream is empty. This means that
     *  there will always be a result and thus Optional is not the
     *  return type (of this version of reduce()).
     *  The "accumulator" combines the current result with the current
     *  value of the stream
     */

    public String name(String... elems) {
        return Stream.of(elems).reduce("", (s, c) -> s + c);
    }

    public int product(Integer... values) {
        return Stream.of(values).reduce(1, (a, b) -> a * b);
    }

    /**
     * Optional<T> reduce (BinaryOperator</T> accumulator)
     * When you leave out the identity, an Optional is returned because there may be not any data
     * (all the elements could have been filtered out earlier). There are three possible results:
     *  a) empty stream => empty Optional returned
     *  b) one element in stream => that element is returned
     *  c) multiple elements in a stream => accumulator is applied
     */
    public void reduceEmpty() {
        // cannot create stream and call reduce inline; compiler does not know
        // how to infer the type, so consider the BinaryOperator as BinaryOperator<Object>
        // and then it not compile
        Stream<Integer> empty = Stream.empty();
        printStream(empty);
    }

    public void reduceOne(int element) {
        Stream<Integer> one = Stream.of(element);
        printStream(one);
    }

    public void reduceMultiple(Integer... values) {
        Stream<Integer> multiple = Stream.of(values);
        printStream(multiple);
    }

    private void printStream(Stream<Integer> stream) {
        stream.reduce(Integer::sum).ifPresent(System.out::println);
    }

    /**
     * <U> U reduce (U identity, BiFunction accumulator, BinaryOperation combiner)
     * We use this version when we are dealing with different types, allowing us to
     * create intermediate reductions and combine them at the end.
     * This is useful when working with parallel streams - the streams cam be decomposed
     * and reassembled by separate threads.
     * For example, if we wanted to count the length of four 1000-character strings, the
     * first two values and the last two values could be calculated independently. The
     * intermediate results (2000) would then be combined into a final value (4000).
     * Examples: we want to count the number of characters in each String
     */
    public int length(String... values) {
        return Stream.of(values).reduce(0,  // identity is int
                (a, b) -> a + b.length(), // a is int, b is string (stream type)
                (a, b) -> a + b);   // both are int
    }
}
