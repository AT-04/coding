package org.fundacionjala.coding.marcoslara.bankocr;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Marcos Lara on 5/19/2017.
 */
public class BankOCRTest {

    @Test
    public void testOfTheStoryOne() {
        String entry =  "    _  _     _  _  _  _  _ "
                + "  | _| _||_||_ |_   ||_||_|"
                + "  ||_  _|  | _||_|  ||_| _|";

        String expectedResult = "123456789";
        assertEquals(expectedResult, BankOCR.convertToNumber(entry));
    }
/*
    @Test
    public void validateTheCheckSumOfAKnowNumber() {
        assertTrue(validateAccountNumber("345882865"));
    }*/
}
