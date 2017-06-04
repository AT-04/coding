package org.fundacionjala.coding.richardseverich;


import org.fundacionjala.coding.richardseverich.EanValidation;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by RichardSeverich on 5/26/2017.
 */
public class EanValidationTest {

    /**
     * This test checks the string that returns the method returns the expected boolean.
     */
    @Test
    public void verifyEANtrue() {
        EanValidation ean = new EanValidation();
        String firstCad = "4003301018398";
        assertTrue(ean.eanValidationCod(firstCad));
    }

    /**
     * This test checks the string that returns the method  returns the expected boolean.
     */
    @Test
    public void verifyEANFalse() {
        EanValidation ean = new EanValidation();
        String firstCad = "4003301018392";
        assertFalse(ean.eanValidationCod(firstCad));
    }

}
