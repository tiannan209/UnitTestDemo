package com.company;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class MathTest {
    @Test
    public void add_TwoPlusTwo_ReturnFour(){
        final int expected = 4;

        final int actual = Math.add(2, 2);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void multiply_ThreeAndZero_ReturnZero(){
        //Arrange
        final int expected = 0;

        final int actual = Math.multiply(3, 0);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void divide_TenDividedByFive_ReturnTwo(){
        final double expected = 2.0;

        final double actual = Math.divide(10, 5);

        Assert.assertEquals(actual, expected, 0);
    }

    @Test (expected = IllegalArgumentException.class)
    public void divide_TenDividedByZero_ThrowsIllegalArgumentException(){
        Math.divide(10, 0);
    }

}