package org.fundacionjala.coding.marcoslara.multiplesofthreeandfive;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Marcos on 12-06-2017.
 */
public class MultiplesOfThreeAndFiveTest {
    /**
     * Main test.
     */
    @Test
    public void test() {
        assertEquals(23, MultiplesOfThreeAndFive.solution(10));
        assertEquals(78, MultiplesOfThreeAndFive.solution(20));
        assertEquals(9168, MultiplesOfThreeAndFive.solution(200));
    }
}
