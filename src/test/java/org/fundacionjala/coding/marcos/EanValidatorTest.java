package org.fundacionjala.coding.marcos;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Marcos Lara on 5/26/2017.
 */
public class EanValidatorTest {
    /**
     * Test of a valid EAN code.
     */
    @Test
    public void eanValidationOfaStringExample1() {
        String eanCode = "4003301018398";

        assertTrue(EanValidator.validate(eanCode));
    }

    /**
     * Test of a invalid EAN code.
     */
    @Test
    public void eanValidationOfaStringExample2() {
        String eanCode = "4003301018392";

        assertFalse(EanValidator.validate(eanCode));
    }
}
