package org.fundacionjala.coding.cynthia;

import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by USUARIO on 05/06/2017.
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
     * verify the checkSum valid.
     */
    @Test
    public void validEanValidation() {
        assertEquals(true, eanValidation.isValidEANCode("4003301018398"));
    }

    /**
     * verify the checkSum invalid.
     */
    @Test
    public void invalidEanValidation() {
        assertEquals(false, eanValidation.isValidEANCode("4003301018392"));
    }


}
