package org.fundacionjala.coding.ovidio;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Simon on 06/09/2017.
 */
public class VowelsTest {
    private Vowels vowels;

    /**
     * Initial setup.
     */
    @Before
    public void setUp() {
        vowels = new Vowels();
    }

    /**
     * Test.
     */
    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, vowels.getCount("abracadabra"));
    }
}
