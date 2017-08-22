package org.fundacionjala.coding.ovidio;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by OvidioMiranda on 8/18/2017.
 */
public class SequenceTest {

    private Sequence sequence;

    /**
     *
     */
    @Before
    public void setUp() {
        sequence = new Sequence();
    }

    /**
     *
     */
    @Test
    public void basicTests() {
        assertEquals("getScore(1) returns a wrong result", 50, sequence.getScore(1));
        assertEquals("getScore(2) returns a wrong result", 150, sequence.getScore(2));
        assertEquals("getScore(3) returns a wrong result", 300, sequence.getScore(3));
        assertEquals("getScore(4) returns a wrong result", 500, sequence.getScore(4));
        assertEquals("getScore(5) returns a wrong result", 750, sequence.getScore(5));
        assertEquals("getScore(6) returns a wrong result", 1050, sequence.getScore(6));
        assertEquals("getScore(7) returns a wrong result", 1400, sequence.getScore(7));
        assertEquals("getScore(8) returns a wrong result", 1800, sequence.getScore(8));
        assertEquals("getScore(9) returns a wrong result", 2250, sequence.getScore(9));
        assertEquals("getScore(10) returns a wrong result", 2750, sequence.getScore(10));
        assertEquals("getScore(20) returns a wrong result", 10500, sequence.getScore(20));
        assertEquals("getScore(30) returns a wrong result", 23250, sequence.getScore(30));
        assertEquals("getScore(100) returns a wrong result", 252500, sequence.getScore(100));
        assertEquals("getScore(123) returns a wrong result", 381300, sequence.getScore(123));
        assertEquals("getScore(1000) returns a wrong result", 25025000, sequence.getScore(1000));
        assertEquals("getScore(1234) returns a wrong result", 38099750, sequence.getScore(1234));
        assertEquals("getScore(10000) returns a wrong result", 2500250000L, sequence.getScore(10000));
        assertEquals("getScore(12345) returns a wrong result", 3810284250L, sequence.getScore(12345));
    }
}

