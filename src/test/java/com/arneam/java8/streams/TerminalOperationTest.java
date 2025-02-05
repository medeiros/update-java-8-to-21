package com.arneam.java8.streams;

import com.github.stefanbirkner.systemlambda.SystemLambda;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class TerminalOperationTest {

    @Test
    void shouldCallReductionOperationCount() {
        TerminalOperation terminalOperation = new TerminalOperation();
        assertThat(terminalOperation.count(1, 2, 3), is(equalTo(3L)));
    }

    @Test
    void shouldCallReductionOperationMin() {
        TerminalOperation terminalOperation = new TerminalOperation();
        assertThat(terminalOperation.min(1, 2, 3), is(equalTo(1)));
    }

    @Test
    void shouldCallReductionOperationMax() {
        TerminalOperation terminalOperation = new TerminalOperation();
        assertThat(terminalOperation.max(1, 2, 3), is(equalTo(3)));
    }

    @ParameterizedTest
    @CsvSource({"1, 2, 3, 1", "3, 2, 1, 3", "2, 1, 3, 2"})
    void shouldFindAny(int value1, int value2, int value3, int result) {
        TerminalOperation terminalOperation = new TerminalOperation();
        assertThat(terminalOperation.findAny(value1, value2, value3),
                is(equalTo(result)));
    }

    @ParameterizedTest
    @CsvSource({"1, 2, 3, 1", "3, 2, 1, 3", "2, 1, 3, 2"})
    void shouldFindFirst(int value1, int value2, int value3, int result) {
        TerminalOperation terminalOperation = new TerminalOperation();
        assertThat(terminalOperation.findFirst(value1, value2, value3),
                is(equalTo(result)));
    }

    @ParameterizedTest
    @CsvSource({"1, 2, 3, true", "1, 2, 1, false", "4, 1, 3, true"})
    void shouldFindAnyMatchHigherThan2(int value1, int value2, int value3,
                                       boolean result) {
        TerminalOperation terminalOperation = new TerminalOperation();
        assertThat(terminalOperation.findAnyMatch(value1, value2, value3),
                is(equalTo(result)));
    }

    @ParameterizedTest
    @CsvSource({"1, 2, 3, false", "1, 2, 1, false", "3, 4, 5, true"})
    void shouldFindAllMatchHigherThan2(int value1, int value2, int value3,
                                       boolean result) {
        TerminalOperation terminalOperation = new TerminalOperation();
        assertThat(terminalOperation.findAllMatch(value1, value2, value3),
                is(equalTo(result)));
    }

    @ParameterizedTest
    @CsvSource({"1, 2, 3, false", "1, 1, -1, true", "3, 4, 5, false"})
    void shouldFindNoneMatchHigherThan2(int value1, int value2, int value3,
                                       boolean result) {
        TerminalOperation terminalOperation = new TerminalOperation();
        assertThat(terminalOperation.findNoneMatch(value1, value2, value3),
                is(equalTo(result)));
    }

    @Test
    void shouldPrintData() throws Exception {
        TerminalOperation terminalOperation = new TerminalOperation();
        String result = SystemLambda.tapSystemOutNormalized(() ->
                terminalOperation.print("john"));
        assertThat(result, is(equalTo("john\n")));
    }

}