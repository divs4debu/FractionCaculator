package com.divy.learn.fraction.calculator;

public class Fractions {
    private int numerator;
    private int denominator;

    Fractions(int numerator, int denominator) throws IllegalArgumentException {
        if(denominator == 0) throw new IllegalArgumentException("Denominator cannot be 0");
        if(numerator < 0) throw  new IllegalArgumentException("Numerator must be positive number");

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }
}
