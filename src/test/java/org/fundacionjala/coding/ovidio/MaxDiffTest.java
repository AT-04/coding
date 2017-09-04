package org.fundacionjala.coding.ovidio;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Simon on 27/08/2017.
 */
public class MaxDiffTest {

    private MaxDiff maxDiff;

    /**
     *
     */
    @Before
    public void setUp() {
        maxDiff = new MaxDiff();
    }

    /**
     *
     */
    @Test
    public void basicTests() {
        assertEquals("only positives", 4, maxDiff.maxDiff(new int[]{1, 2, 3, 4, 5, 5, 4}));
        assertEquals("only negatives", 30, maxDiff.maxDiff(new int[]{-4, -5, -3, -1, -31}));
        assertEquals("positives and negatives", 10, maxDiff.maxDiff(new int[]{1, 2, 3, 4, -5, 5, 4}));
        assertEquals("single element", 0, maxDiff.maxDiff(new int[]{1000000}));
        assertEquals("empty", 0, maxDiff.maxDiff(new int[]{}));
    }
}
