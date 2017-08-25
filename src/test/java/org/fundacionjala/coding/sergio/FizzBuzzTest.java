package org.fundacionjala.coding.sergio;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by SergioNavarro on 8/25/2017.
 */
public class FizzBuzzTest {
    /**
     *
     */
    @Test
    public void test01() {
        int num = 4;
        String[] input = {"1", "2", "Fizz", "4"};
        assertEquals(input, FizzBuzz.resolve(num));
    }

}
