package com.arneam.java8.methodreference;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

class MethodReferenceStaticTest {

    @Test
    void shouldSortListItems() {
        List<Integer> numbers = Arrays.asList(2, 1, 5, 3, 4);
        MethodReferenceStatic methodReferenceStatic = new
                MethodReferenceStatic();
        methodReferenceStatic.sort(numbers);
        assertThat(numbers, contains(1, 2, 3, 4, 5));
    }

}