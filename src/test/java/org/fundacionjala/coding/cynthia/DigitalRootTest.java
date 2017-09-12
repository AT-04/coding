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
        assertEquals(7, digital.sumOfDigits(16));
        assertEquals(6, digital.sumOfDigits(942));
        assertEquals(6, digital.sumOfDigits(132189));
        assertEquals(2, digital.sumOfDigits(493193));
        assertEquals(9, digital.sumOfDigits(54));
        assertEquals(1, digital.sumOfDigits(100));
    }
}
