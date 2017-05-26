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
        String secondLine = "  | _| _||_||_ |_   ||_||_|| |";
        String thirdLine = "  ||_  _|  | _||_|  ||_| _||_|";
        Assert.assertEquals("1234567890", BankOCR.convertEntryToNumber(firstLine, secondLine, thirdLine));
    }
}
