package org.fundacionjala.coding.cynthia;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by Cynthia on 8/18/2017.
 */
public class SequenceTest {

    /**
     * test.
     */
    @Test
    public void basicTests() {
        Sequence sec = new Sequence();
        assertEquals("getScore(1) returns a wrong result", 50, sec.getScore(1));
        assertEquals("getScore(2) returns a wrong result", 150, sec.getScore(2));
        assertEquals("getScore(3) returns a wrong result", 300, sec.getScore(3));
        assertEquals("getScore(4) returns a wrong result", 500, sec.getScore(4));
        assertEquals("getScore(5) returns a wrong result", 750, sec.getScore(5));
        assertEquals("getScore(6) returns a wrong result", 1050, sec.getScore(6));
        assertEquals("getScore(7) returns a wrong result", 1400, sec.getScore(7));
        assertEquals("getScore(8) returns a wrong result", 1800, sec.getScore(8));
        assertEquals("getScore(9) returns a wrong result", 2250, sec.getScore(9));
        assertEquals("getScore(10) returns a wrong result", 2750, sec.getScore(10));
        assertEquals("getScore(20) returns a wrong result", 10500, sec.getScore(20));
        assertEquals("getScore(30) returns a wrong result", 23250, sec.getScore(30));
        assertEquals("getScore(100) returns a wrong result", 252500, sec.getScore(100));
        assertEquals("getScore(123) returns a wrong result", 381300, sec.getScore(123));
        assertEquals("getScore(1000) returns a wrong result", 25025000, sec.getScore(1000));
        assertEquals("getScore(1234) returns a wrong result", 38099750, sec.getScore(1234));
        assertEquals("getScore(10000) returns a wrong result", 2500250000L, sec.getScore(10000));
        assertEquals("getScore(12345) returns a wrong result", 3810284250L, sec.getScore(12345));
    }
}
