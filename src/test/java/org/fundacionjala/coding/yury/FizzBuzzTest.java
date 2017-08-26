package org.fundacionjala.coding.yury;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 8/25/2017.
 */
public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    /**
     * This method before.
     */
    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    /**
     * Test.
     */
    @Test
    public void fizz() {
        assertEquals("1", fizzBuzz.sequence(1));
        assertEquals("1 2 Fizz 4", fizzBuzz.sequence(4));
        assertEquals("1 2 Fizz 4 Buzz", fizzBuzz.sequence(5));
        assertEquals("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz", fizzBuzz.sequence(10));
        assertEquals("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz", fizzBuzz.sequence(15));
    }
}
