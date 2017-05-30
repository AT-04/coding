package org.fundacionjala.coding.Jose;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by JoseTorrez on 5/30/2017.
 */
public class EANTest {
    /**
     *
     */
    @Test
    public void rightNumber() {
       EAN eanValidation = new EAN();
       assertTrue(eanValidation.validate("4003301018398"));
    }
    /**
     *
      */
    @Test
   public void wrongNumber() {
               EAN eanValidation = new EAN();
               assertFalse(eanValidation.validate("4003301018395"));
    }
}
