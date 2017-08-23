package org.fundacionjala.coding.ovidio;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Simon on 22/08/2017.
 */
public class SmallestIntegerFinderTest {
    private SmallestIntegerFinder smallestIntegerFinder;

    /**
     * Execute before each test method.
     */
    @Before
    public void setUp() {
        smallestIntegerFinder = new SmallestIntegerFinder();
    }

    /**
     * Example 1 Test.
     */
    @Test
    public void example1() {
        int expected = 11;
        int actual = smallestIntegerFinder.findSmallestInt(new int[]{78, 56, 232, 12, 11, 43});
        assertEquals(expected, actual);
    }

    /**
     * Example 2 Test.
     */
    @Test
    public void example2() {
        int expected = -33;
        int actual = smallestIntegerFinder.findSmallestInt(new int[]{78, 56, -2, 12, 8, -33});
        assertEquals(expected, actual);
    }

    /**
     * Example 3 Test.
     */
    @Test
    public void example3() {
        int expected = Integer.MIN_VALUE;
        int actual = smallestIntegerFinder.findSmallestInt(new int[]{0, Integer.MIN_VALUE, Integer.MAX_VALUE});
        assertEquals(expected, actual);
    }
}
