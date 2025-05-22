package com.haris.week12.lab;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class SimpleCalculatorTest extends TestCase {

    @Test
    public void testAddition2And3Equals5() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(5,calculator.add(2,3));
    }

    public void testAddition0And0Equals0() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(0, calculator.add(0,0));
    }

    public void testDivision9And3Equals3() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(3, calculator.divide(9,3));
    }

    public void testDivisionException() {
    SimpleCalculator calculator = new SimpleCalculator();
    assertThrows(ArithmeticException.class, () -> {
        calculator.divide(4,0);
        });
    }
}