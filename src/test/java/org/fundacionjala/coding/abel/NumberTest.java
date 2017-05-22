package org.fundacionjala.coding.abel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AbelBarrientos on 5/22/2017.
 */
public class NumberTest {

    /**
     *
     */
    @Test
    public void canCreateANumberWithStringRepresentationAndIntValue() {
        Number number = new Number(" _ | ||_|", 0);

        assertEquals(" _ | ||_|", number.getStringRepresentation());
        assertEquals(0, number.getIntValue());
    }
}
