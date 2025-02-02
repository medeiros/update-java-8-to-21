package com.arneam.java8.lambda;

import java.util.function.Predicate;

public class FinalEffectiveFinal {
    public boolean testIt(int x) {
        int y = 11;
        //x = 13;   // if lambda uses it, the variable cannot be changed after declared,
        //y = 14;   // since it is considered final or effective final
                    // uncomment and see the compiler error at line 11
        Predicate<Integer> predicate = (a) -> {
            System.out.println("x = " + x + "; y = " + y);
            return a == 10;
        };
        //x = 14;   // same here - the position doesn't matter
        //y = 15;   // uncomment and see the compiler error at line 11
        return predicate.test(x);
    }
}
