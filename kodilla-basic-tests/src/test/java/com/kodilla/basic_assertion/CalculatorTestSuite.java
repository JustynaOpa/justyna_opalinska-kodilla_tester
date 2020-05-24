package com.kodilla.basic_assertion;


import com.kodilla.inheritance.Car;
import com.sun.tools.javac.util.Assert;
import org.junit.jupiter.api.Test;

import static com.kodilla.basic_assertion.ResultChecker.assertEquals;
import static com.kodilla.basic_assertion.ResultChecker.assertEquals1;

public class CalculatorTestSuite {
    Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        int a = 12;
        int b = 6;
        int sumResult = calculator.sum(a, b);
        assertEquals( 16, sumResult);
    }
    @Test
    public void testSubtraction(){
        int a = 25;
        int b = 14;
        int result = calculator.substract(a,b);
        assertEquals(11, result);
    }
    @Test
    public void testExponentiation(){
        double a = 3;
        double b = 2;
        double result = calculator.exponentiation(a, b);
        assertEquals1(9, result);
    }
}


