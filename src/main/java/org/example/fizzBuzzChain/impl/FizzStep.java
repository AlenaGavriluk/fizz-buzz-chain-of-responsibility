package org.example.fizzBuzzChain.impl;

import org.example.fizzBuzzChain.FizzBuzzChain;

public class FizzStep implements FizzBuzzChain {
    private FizzBuzzChain nextStep;

    @Override
    public String apply(int number) {
        if(number % 3 == 0) {
            return "Fizz";
        } else {
            return applyNext(number);
        }
    }

    @Override
    public void setNextStep(FizzBuzzChain nextStep) {
        this.nextStep = nextStep;
    }

    @Override
    public FizzBuzzChain getNextStep() {
        return nextStep;
    }
}
