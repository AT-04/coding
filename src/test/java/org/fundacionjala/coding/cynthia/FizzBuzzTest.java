package org.fundacionjala.coding.cynthia;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by Administrator on 8/25/2017.
 */
public class FizzBuzzTest {
    /**
     * tests.
     */
    @Test
    public void basicTests() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("1", fb.isFizzBuzz(1));
        assertEquals("2", fb.isFizzBuzz(2));
        assertEquals("Fizz", fb.isFizzBuzz(3));
        assertEquals("4", fb.isFizzBuzz(4));
        assertEquals("Buzz", fb.isFizzBuzz(5));
        assertEquals("Fizz", fb.isFizzBuzz(6));
        assertEquals("7", fb.isFizzBuzz(7));
        assertEquals("8", fb.isFizzBuzz(8));
        assertEquals("Fizz", fb.isFizzBuzz(9));
        assertEquals("Buzz", fb.isFizzBuzz(10));
        assertEquals("11", fb.isFizzBuzz(11));
        assertEquals("Fizz", fb.isFizzBuzz(12));
        assertEquals("FizzBuzz", fb.isFizzBuzz(15));


    }
}
