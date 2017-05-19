package org.fundacionjala.coding.joseTorrez;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by JoseTorrez on 5/16/2017.
 */
public class BankOcrTest {

    @Test
    public void testBankOcrStoryOne() {
        String entryLine1 = "      _  _       _   _  _   _   _   " +
                "   |  _| _| |_| |_  |_   | |_| |_|  " +
                "   | |_  _|   |  _| |_|  | |_|  _|  ";
        String expectedResult = "132456789";
        assertEquals(expectedResult, entryLine1.convertToNumber(entryLine1));
    }

}
