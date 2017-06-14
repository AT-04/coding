package org.fundacionjala.coding.ovidio;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by OvidioMiranda on 6/12/2017.
 */
public class MultiplesOfThreeAndFiveTest {

    /**
     *
     */
    @Test
    public void test() {
        assertEquals(23, MultiplesOfThreeAndFive.solution(10));
        assertEquals(78, MultiplesOfThreeAndFive.solution(20));
        assertEquals(9168, MultiplesOfThreeAndFive.solution(200));
    }
}
