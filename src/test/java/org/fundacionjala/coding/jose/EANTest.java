package org.fundacionjala.coding.jose;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by JoseTorrez on 5/30/2017.
 */
public class EANTest {
    private EAN eanValidation;

    /**
     *
     */
    @Before
    public void initObjects() {
        eanValidation = new EAN();
    }

    /**
     *
     */
    @Test
    public void rightNumber() {
       assertTrue(eanValidation.validate("4003301018398"));
    }
    /**
     *
      */
    @Test
   public void wrongNumber() {
        assertFalse(eanValidation.validate("4003301018395"));
    }
}
