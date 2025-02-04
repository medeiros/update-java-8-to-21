package com.arneam.java8.streams;

import org.junit.jupiter.api.Test;

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

}