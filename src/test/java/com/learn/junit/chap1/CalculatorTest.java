package com.learn.junit.chap1;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    /*private int numberOfError;

    public void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(50.0, 10.0);
        if (result != 60.0) {
            throw new IllegalStateException("Bad result: " + result);
        }
    }

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        try {
            calculatorTest.testAdd();
        } catch (IllegalStateException exception) {
            calculatorTest.numberOfError++;
            exception.printStackTrace();
        }
        if (calculatorTest.numberOfError > 0) {
            throw new IllegalStateException("There were " + calculatorTest.numberOfError + " error(s).");
        }
    }*/

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        double result = calculator.add(50.0, 10.0);
        Assert.assertEquals(60, result, 0);
    }
}
