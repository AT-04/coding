package org.fundacionjala.coding.sergio;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by SergioNavarro on 8/25/2017.
 */
public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    /**
     * Initial setup.
     */
    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    /**
     *
     */
    @Test
    public void test01() {
        int num = 4;
        String[] input = {"1", "2", "Fizz", "4"};
        assertTrue(Arrays.equals(input, fizzBuzz.resolve(num)));
    }

}
