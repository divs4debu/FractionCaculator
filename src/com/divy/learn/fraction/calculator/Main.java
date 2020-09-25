package com.divy.learn.fraction.calculator;

public class Main {

    public static void main(String[] args) {
        // lets say user enter 2 number 2/3 and 5/10
        // so i create 2 fractions
        Fractions firstFraction = new Fractions(2,3);
        Fractions secondFraction = new Fractions(5, 10);
        Calculator calculator = new Calculator(firstFraction, secondFraction);

        System.out.printf("The multiplication of the fraction %s and %s is: %s \n",
                firstFraction.toString(),
                secondFraction.toString(),
                calculator.multiply().toString());
    }
}
