package org.fundacionjala.coding.cynthia;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests for Middle Character class.
 */
public class MiddleCharacterTest {
    private MiddleCharacter middle;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        middle = new MiddleCharacter();
    }

    /**
     * First test.
     */
    @Test
    public void evenTests() {
        assertEquals("es", middle.getMiddle("test"));
        assertEquals("dd", middle.getMiddle("middle"));
    }

    /**
     * Second test.
     */
    @Test
    public void oddTests() {
        assertEquals("t", middle.getMiddle("testing"));
        assertEquals("A", middle.getMiddle("A"));
    }

    /**
     * Basic tests.
     */
    @Test
    public void basicTests() {
        assertEquals("Hi", middle.getMiddle("Hi"));
        assertEquals("u", middle.getMiddle("Sun"));
    }

    /**
     * Tests.
     */
    @Test
    public void tests() {
        assertEquals("b", middle.getMiddle("Numbers"));
        assertEquals("r", middle.getMiddle("Performance"));
        assertEquals("C", middle.getMiddle("Hello Cynthia"));
    }

}

