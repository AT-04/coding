package org.fundacionjala.coding.richardseverich;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by RichardSeverich on 6/12/2017.
 */
public class MultiplesTest {

    /**
     *
     */
    @Test
    public void test() {
        Multiples kata = new Multiples();
        assertEquals(23, kata.solution(10));
        assertEquals(78, kata.solution(20));
        assertEquals(9168, kata.solution(200));
    }
}
