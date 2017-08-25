package org.fundacionjala.coding.ovidio;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by OvidioMiranda on 8/25/2017.
 */
public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;
    private static final String FIZZ_BUZZ = "FizzBuzz";
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    /**
     *
     */
    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
        fizzBuzz.printNumbers(100);
    }

    /**
     *
     */
    @Test
    public void testForNumberDivisibleForThree() {
        assertTrue(FIZZ.equals(fizzBuzz.fizzBuzzOf(3)));
    }

    /**
     *
     */
    @Test
    public void testForNumberDivisibleForFive() {
        assertTrue(BUZZ.equals(fizzBuzz.fizzBuzzOf(5)));
    }

    /**
     *
     */
    @Test
    public void testForNumberDivisibleForThreeAndFive() {
        assertTrue(FIZZ_BUZZ.equals(fizzBuzz.fizzBuzzOf(15)));
    }

    /**
     *
     */
    @Test
    public void testCounterFizzfromOneToOneHundred() {
        assertEquals(27, (fizzBuzz.counter(FIZZ)));
    }

    /**
     *
     */
    @Test
    public void testCounterBuzzfromOneToOneHundred() {
        assertEquals(14, (fizzBuzz.counter(BUZZ)));
    }

    /**
     *
     */
    @Test
    public void testCounterFizzBuzzfromOneToOneHundred() {
        assertEquals(6, (fizzBuzz.counter(FIZZ_BUZZ)));
    }
}
