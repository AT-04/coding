package org.fundacionjala.coding.ovidio_eanValidation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by OvidioMiranda on 5/26/2017.
 */
public class EanValidationTest {


    /*
    *This test evaluate EAN
     */
    @Test
    public void isEanValidate() {
        EanValidation test = new EanValidation();
        Boolean result = test.validate("4003301018398");
        assertTrue(result);
    }
}
