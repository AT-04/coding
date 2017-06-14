package org.fundacionjala.coding.cynthia;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by CynthiaTerrazas on 6/14/2017.
 */
public class MultiplesTest {
    /**
     *
     */
    @Test
    public void theFirstTest() {
        assertEquals(23, Multiples.solution(10));
    }


    /**
     *
     */
    @Test
    public void theSecondtest() {
        assertEquals(78, Multiples.solution(20));
    }

    /**
     *
     */
    @Test
    public void thelastTest() {
        assertEquals(9168, Multiples.solution(200));
    }

}
