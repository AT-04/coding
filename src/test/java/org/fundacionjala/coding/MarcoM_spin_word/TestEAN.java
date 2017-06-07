package org.fundacionjala.coding.MarcoM_spin_word;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Created by Administrator on 5/26/2017.
 */
public class TestEAN {

    /**
     * verify.
     */
    @Test
    public void validateTrue() {
        EAN validator = new EAN();
        assertTrue(validator.validate("4003301018398"));

    }

    /**
     * verify.
     */
    @Test
    public void validateFalse() {
        EAN validator = new EAN();
        assertFalse(validator.validate("4003301018392"));
    }
}
