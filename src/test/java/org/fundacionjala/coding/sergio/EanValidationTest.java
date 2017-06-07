package org.fundacionjala.coding.sergio;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Created by Sergio on 04/06/2017.
 */
public class EanValidationTest {
    /**
     *
     */
    @Test
    public void firstExampleOfChecksum() {
        String entry = "4003301018398";

        assertTrue(EanValidation.validation(entry));
    }

    /**
     *
     */
    @Test
    public void secondExampleOfChecksum() {
        String entry = "4003301018392";

        assertFalse(EanValidation.validation(entry));
    }

    /**
     *
     */
    @Test
    public void otherTestEntry() {
        String entry = "6298752047129";

        assertTrue(EanValidation.validation(entry));
    }

}
