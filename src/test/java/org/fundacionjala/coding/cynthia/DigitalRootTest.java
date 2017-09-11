package org.fundacionjala.coding.cynthia;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by Cynthia on 9/11/2017.
 */
public class DigitalRootTest {

    /**
     *
     */
    @Test
    public void tests() {
        DigitalRoot digital = new DigitalRoot();
        assertEquals("Nope!", digital.sumOfDigits(16), 7);
        assertEquals("Nope!", digital.sumOfDigits(942), 6);
        assertEquals("Nope!", digital.sumOfDigits(132189), 6);
        assertEquals("Nope!", digital.sumOfDigits(493193), 2);
        assertEquals("Nope!", digital.sumOfDigits(54), 9);
        assertEquals("Nope!", digital.sumOfDigits(100), 1);
    }
}
