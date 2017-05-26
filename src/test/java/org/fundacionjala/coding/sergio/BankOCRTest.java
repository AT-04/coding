package org.fundacionjala.coding.sergio;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by Administrator on 5/16/2017.
 */
public class BankOCRTest {
    /**
     *
     */
    @Test
    public void comprobateEntryNumbersOneToZero() {

        String firstLine = "    _  _     _  _  _  _  _  _ ";
        String secndLine = "  | _| _||_||_ |_   ||_||_|| |";
        String thirdLine = "  ||_  _|  | _||_|  ||_| _||_|";
        Assert.assertEquals("1234567890", BankOCR.convertEntryToNumber(firstLine, secndLine, thirdLine));
    }

    /**
     *
     */
    @Test
    public void checkEntryOnlyZeros() {
        String firstLine = " _  _  _  _  _  _  _  _  _  _ ";
        String secndLine = "| || || || || || || || || || |";
        String thirdLine = "|_||_||_||_||_||_||_||_||_||_|";
        Assert.assertEquals("0000000000", BankOCR.convertEntryToNumber(firstLine, secndLine, thirdLine));
    }
}
