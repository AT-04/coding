package org.fundacionjala.coding.abel;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by AbelBarrientos on 5/26/2017.
 */
public class EanValidationTest {

    /**
     *
     */
    @Test
    public void validateTheCheckSumOfAKnowNumber() {
        assertTrue(EanValidation.validate("4003301018398"));
    }

    /**
     *
     */
    @Test
    public void validateTheCheckSumOfAWrongNumber() {
        assertFalse(EanValidation.validate("4003301018391"));
    }
}
