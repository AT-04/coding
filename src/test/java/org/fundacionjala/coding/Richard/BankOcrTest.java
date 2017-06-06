package org.fundacionjala.coding.Richard;

import org.fundacionjala.coding.Richard.BankOcr;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by RichardSeverich on 5/16/2017.
 */

public class BankOcrTest
{

    @Test
    public void CreateInstance()
    {
        BankOcr bankOrc = new BankOcr();
        assertTrue(bankOrc instanceof  BankOcr);
    }

    @Test
    public void BankOCRTest()
    {
        String entryLine1 =  "    _  _     _  _  _  _  _ ";
        String entryLine2 =  "  | _| _||_||_ |_   ||_||_|";
        String entryLine3 =  "  ||_  _|  | _||_|  ||_| _|";

        BankOcr bankOrc = new BankOcr();

        String expectedResult="123456789";

        assertEquals(expectedResult, bankOrc.convertEntryToNumber(entryLine1,entryLine2,entryLine3));
    }

}
