package org.fundacionjala.coding;
import org.junit.Test;
import static  org.junit.Assert.*;


import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 5/16/2017.
 */
public class BankOCRTest {

    @Test
    public void testBankOCRStoryOne() {
        String entry = "    _  _     _  _  _  _  _ " +
                       "  | _| _||_||_ |_   ||_||_|" +
                       "  ||_  _|  | _||_|  ||_| _|";

        String expectedResult = "123456789";
        assertEquals(expectedResult, BankOCR.convertEntryToNumber(entry));

    }

    @Test
    public void testBankOCRStoryOne() {
        String entryLine1 = "    _  _     _  _  _  _  _ ";
        String entryLine2 = "  | _| _||_||_ |_   ||_||_|";
        String entryLine3 = "  ||_  _|  | _||_|  ||_| _|";

        String expectedResult = "123456789";
        assertEquals(expectedResult, BankOCR.convertEntryToNumber(entryLine1, entryLine2, entryLine3));

    }
}
