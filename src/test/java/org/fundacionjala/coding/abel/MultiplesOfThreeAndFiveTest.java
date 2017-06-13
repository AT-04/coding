package org.fundacionjala.coding.abel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AbelBarrientos on 6/12/2017.
 */
public class MultiplesOfThreeAndFiveTest {

    /**
     *
     */
    @Test
    public void test() {
        assertEquals(23, Solution.solution(10));
        assertEquals(78, Solution.solution(20));
        assertEquals(9168, Solution.solution(200));
    }
}
