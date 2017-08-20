package org.fundacionjala.coding.yury;

import main.java.org.fundacionjala.coding.yury.EanValidation;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by YuryOrtuno on 5/26/2017.
 */
public class EanValidationTests {

    /**
     *
     */
    @Test
    public void timesNumber() {
        EanValidation eanValidation = new EanValidation();
        assertTrue(eanValidation.validation("4003301018398"));
    }

    /**
     *
     */
    @Test
    public void timesNumberIsFalse() {
        EanValidation eanValidation = new EanValidation();
        assertFalse(eanValidation.validation("4003301018392"));
    }


}
