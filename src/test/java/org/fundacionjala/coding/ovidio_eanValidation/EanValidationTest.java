package org.fundacionjala.coding.ovidio_eanValidation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by OvidioMiranda on 5/26/2017.
 */
public class EanValidationTest {

    private EanValidation eanValidation;

    /**
     * Initial setup.
     */
    @Before
    public void setUp() {
        eanValidation = new EanValidation();
    }

    /**
     * This test for  It is a valid EAN code.
     */
    @Test
    public void itIsAVvalidEanCode() {
        assertTrue(eanValidation.validate("4003301018398"));
    }

    /**
     * This test is when is not a valid Ean code.
     */
    @Test
    public void itIsNotAValidEanCode() {
        assertFalse(eanValidation.validate("4003301018391"));
    }
}
