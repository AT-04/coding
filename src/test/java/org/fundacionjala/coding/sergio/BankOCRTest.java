package org.fundacionjala.coding.sergio;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Created by Administrator on 5/16/2017.
 */
public class BankOCRTest {
    /**
     *
     */
    @Test
    public void comprobateEntryNumbersOneToZero() {

        String firstLine = "    _  _     _  _  _  _  _ ";
        String secndLine = "  | _| _||_||_ |_   ||_||_|";
        String thirdLine = "  ||_  _|  | _||_|  ||_| _|";
        assertEquals("123456789", BankOCR.convertEntryToNumber(firstLine, secndLine, thirdLine));
    }

    /**
     *
     */
    @Test
    public void checkEntryOnlyZeros() {
        String firstLine = " _  _  _  _  _  _  _  _  _ ";
        String secndLine = "| || || || || || || || || |";
        String thirdLine = "|_||_||_||_||_||_||_||_||_|";
        Assert.assertEquals("000000000", BankOCR.convertEntryToNumber(firstLine, secndLine, thirdLine));
    }
    /**
     *
     */
    @Test
    public void checkSumValidationTrue() {
        String entry = "345882865";

        assertTrue(BankOCR.validationCheckSum(entry));
    }
    /**
     *
     */
    @Test
    public void checkSumValidationFalse() {
        String entry = "356987453";

        assertFalse(BankOCR.validationCheckSum(entry));
    }

    /**
     *
     */
    @Test
    public void userStoryThreeCaseERR() {
        String entry = "356987453";

        assertEquals("356987453 ERR", BankOCR.errorAccount(entry));
    }

    /**
     *
     */
    @Test
    public void userStoryThreeCaseILL() {
        String entry = "86110??36";

        assertEquals("86110??36 ILL", BankOCR.errorAccount(entry));
    }
}
