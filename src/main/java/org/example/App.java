package org.example;

import org.example.fizzBuzzChain.FizzBuzzChain;
import org.example.fizzBuzzChain.impl.BuzzStep;
import org.example.fizzBuzzChain.impl.FizzBuzzStep;
import org.example.fizzBuzzChain.impl.FizzStep;

public class App {
    public static void main( String[] args ) {
        fizzBuzz(100);
    }

    private static void fizzBuzz(int n) {
        FizzBuzzChain fizzBuzzChain = FizzBuzzChain.of(
                new FizzBuzzStep(),
                new FizzStep(),
                new BuzzStep()
        );

        for (int i = 0; i < n; i++) {
            System.out.println(fizzBuzzChain.apply(i));
        }
    }
}
