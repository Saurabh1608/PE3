package com.stackroute.unittest.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {

    @Test
    public void testconsecutiveNumbers() {
        ConsecutiveNumbers check=new ConsecutiveNumbers();
        assertEquals( "Consecutive series" ,check.consecutiveNumbers("21,22,23"));

    }

    @Test
    public void testconsecutiveNumbers2() {
        ConsecutiveNumbers check=new ConsecutiveNumbers();
        assertEquals( "Consecutive series" ,check.consecutiveNumbers("21,20,19"));

    }
    @Test
    public void testconsecutiveNumbers3() {
        ConsecutiveNumbers check=new ConsecutiveNumbers();
        assertEquals( "Not a consecutive series" ,check.consecutiveNumbers("1,2,3,4,5,6,6"));

    }
}