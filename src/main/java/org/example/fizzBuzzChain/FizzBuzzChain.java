package org.example.fizzBuzzChain;

public interface FizzBuzzChain {
    String apply(int number);
    void setNextStep(FizzBuzzChain nextStep);
    FizzBuzzChain getNextStep();
    static FizzBuzzChain of(FizzBuzzChain firstStep, FizzBuzzChain ...nextSteps ) {
        FizzBuzzChain head = firstStep;
        for (FizzBuzzChain step : nextSteps) {
            head.setNextStep(step);
            head = step;
        }
        return firstStep;
    }
    default String applyNext(int number){
        if(getNextStep() == null){
            return "" + number;
        } else {
            return getNextStep().apply(number);
        }
    }
}
