package com.divy.learn.fraction.calculator;

public class Calculator {
    private Fractions firstFraction;
    private Fractions secondFraction;

    public Calculator(Fractions first, Fractions second) {
        firstFraction = first;
        secondFraction = second;
    }

    public Fractions multiply() {
        return new Fractions(firstFraction.getNumerator() * secondFraction.getNumerator(),
                            firstFraction.getDenominator() * secondFraction.getDenominator());
    }
}
