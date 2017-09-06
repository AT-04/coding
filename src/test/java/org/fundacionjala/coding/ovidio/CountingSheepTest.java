package org.fundacionjala.coding.ovidio;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Simon on 06/09/2017.
 */
public class CountingSheepTest {
    private CountingSheep countingSheep;
    private Boolean[] array1 = {true, true, true, false,
            true, true, true, true,
            true, false, true, false,
            true, false, false, true,
            true, true, true, true,
            false, false, true, true};

    /**
     * Initial setup.
     */
    @Before
    public void setUp() {
        countingSheep = new CountingSheep();
    }

    /**
     * Test.
     */
    @Test
    public void test() {
        String message = "There are 17 sheeps in total";
        assertEquals(message, 17,   countingSheep.countSheeps(array1));
    }
}
