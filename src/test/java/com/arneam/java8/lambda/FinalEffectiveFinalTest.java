package com.arneam.java8.lambda;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FinalEffectiveFinalTest {

    @Test
    void shouldNotCompileIfVariableFinalOrEffectiveFinal() {
        assertThat(new FinalEffectiveFinal().testIt(10), is(true));
    }

}
