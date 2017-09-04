package org.fundacionjala.coding.jose;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by JoseTorrez on 9/4/2017.
 */
public class MiddleTest {

    private Middle middle;

    /**
     * Initializer.
     */
    @Before
    public void setUp() {
        middle = new Middle();

    }

    /**
     * Test for even number of characters.
     */
    @Test
    public void evenTests() {
        assertEquals("es", middle.getMiddle("test"));
        assertEquals("dd", middle.getMiddle("middle"));
    }

    /**
     * Test for odd numbers of characters.
     */
    @Test
    public void oddTests() {
        assertEquals("t", middle.getMiddle("testing"));
        assertEquals("A", middle.getMiddle("A"));
    }

    /**
     * Test for a long even number of characters.
     */
    @Test
    public void longEvenTest() {
        assertEquals("e", middle.getMiddle("thisisalongsequenceofword"));
        assertEquals("e", middle.getMiddle("anotherwordforthistestofmiddlecharacter"));
    }

    /**
     * Test for a long odd number of characters.
     */
    @Test
    public void longOddTest() {
        assertEquals("eq", middle.getMiddle("thisisalongsequenceofwords"));
        assertEquals("es", middle.getMiddle("anotherwordforthistestofmiddlecharacters"));
    }

}
