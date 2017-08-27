package org.fundacionjala.coding.richard;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 8/25/2017.
 */
public class FizzBuzzTest {


    private FizzBuzz fizzBuzz;

    /**
     *
     */
    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    /**
     *
     */
    @Test
    public void testMultipleOfThree() {
        assertEquals(fizzBuzz.getFizzBuzz(3), "Fizz");
    }

    /**
     *
     */
    @Test
    public void testNumberContainsThree() {
        assertEquals(fizzBuzz.getFizzBuzz(13), "Fizz");
    }

    /**
     *
     */
    @Test
    public void testMultiplesOfFive() {
        assertEquals(fizzBuzz.getFizzBuzz(5), "Buzz");
    }

    /**
     *
     */
    @Test
    public void testNumberContainsFive() {
        assertEquals(fizzBuzz.getFizzBuzz(52), "Buzz");
    }

    /**
     *
     */
    @Test
    public void testIsMultipleOfThreeAndFive() {
        assertEquals(fizzBuzz.getFizzBuzz(15), "FizzBuzz");
    }

    /**
     *
     */
    @Test
    public void testContainsThreeAndFive() {
        assertEquals(fizzBuzz.getFizzBuzz(53), "FizzBuzz");
    }

    /**
     *
     */
    @Test
    public void testNotMultiplesOfFive() {
        assertEquals(fizzBuzz.getFizzBuzz(1), "1");
    }
}
