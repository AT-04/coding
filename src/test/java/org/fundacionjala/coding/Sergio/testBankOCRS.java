package org.fundacionjala.coding;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Administrator on 5/16/2017.
 */
public class testBankOCRS {
    @Test
    public void testBankStoryOne()
    {
        String entry = "    _  _     _  _  _  _  _ "+
                       "  | _| _||_||_ |_   ||_||_|"+
                       "  ||_  _|  | _||_|  ||_| _|";
        String expectecResult = "123456789";
        assertEquals(expectecResult, BankORC.convertEntryToNumber(entry));
    }
}
