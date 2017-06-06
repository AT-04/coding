package org.fundacionjala.coding.ovidio;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by OvidioMiranda on 6/2/2017.
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

