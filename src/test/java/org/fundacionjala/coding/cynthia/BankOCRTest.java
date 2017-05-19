package org.fundacionjala.coding.cynthia;

import org.fundacionjala.coding.cynthia.BankOCR;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by CynthiaTerrazas on 5/16/2017.
 */
public class BankOCRTest {
    @Test
    public void bankOCRtoTry(){

        String entryLine1 = "    _  _     _  _  _  _  _ ";
        String entryLine2 = "  | _| _||_||_ |_   ||_||_|";
        String entryLine3 = "  ||_  _|  | _||_|  ||_| _|";

        String expectedResult = "123456789";

        assertEquals(expectedResult, BankOCR.convertEntryToNumber(entryLine1, entryLine2, entryLine3));

    }

    @Test
    public void theDigitIsOne(){
        String entryLine1 ="   ";
        String entryLine2 ="  |";
        String entryLine3 ="  |";

    }

}





