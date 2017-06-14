package org.fundacionjala.coding.sergio;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by SergioNavarro on 6/12/2017.
 */
public class MultiplesTest {
    /**
     *
     */
    @Test
    public void test() {
        assertEquals(23, Multiples.solution(10));
        assertEquals(78, Multiples.solution(20));
        assertEquals(9168, Multiples.solution(200));
    }
}
