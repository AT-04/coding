package org.fundacionjala.coding.marcan;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by MarcandeaCabrera on 5/26/2017.
 */
public class TestValidationEAN {
    private ValidationEAN stringEAN;

    /**
     * This is a method Before.
     */
    @Before
    public void methodBefore() {
        stringEAN = new ValidationEAN();
    }

    /**
     * This is a Test for verify if is true the result (equal to ultimate number).
     */
    @Test
    public void firstTestForAssertTrueOfString() {
        assertTrue(stringEAN.verifyStringEAN("4003301018398"));
    }

    /**
     * This is a Test for verify if is false the result (equal to ultimate number).
     */
    @Test
    public void secondTestForAssertFalseOfString() {
        assertFalse(stringEAN.verifyStringEAN("4003301018392"));
    }


}
