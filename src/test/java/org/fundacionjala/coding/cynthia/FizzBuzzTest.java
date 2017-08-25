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
        assertEquals("1", fb.isFizz(1));
        assertEquals("2", fb.isFizz(2));
        assertEquals("Fizz", fb.isFizz(3));
        assertEquals("4", fb.isFizz(4));
        assertEquals("Buzz", fb.isFizz(5));
        assertEquals("Fizz", fb.isFizz(6));
        assertEquals("7", fb.isFizz(7));
        assertEquals("8", fb.isFizz(8));
        assertEquals("Fizz", fb.isFizz(9));
        assertEquals("Buzz", fb.isFizz(10));
        assertEquals("11", fb.isFizz(11));
        assertEquals("Fizz", fb.isFizz(12));
        assertEquals("FizzBuzz", fb.isFizz(15));


    }
}
