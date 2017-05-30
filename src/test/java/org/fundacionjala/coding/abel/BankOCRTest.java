package org.fundacionjala.coding.abel;

import org.junit.Test;

import static org.fundacionjala.coding.abel.BankOCR.convertEntryToNumber;
import static org.fundacionjala.coding.abel.BankOCR.readFile;
import static org.fundacionjala.coding.abel.BankOCR.validateAccountNumber;
import static org.fundacionjala.coding.abel.BankOCR.lineOutPut;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Created by AbelBarrientos on 5/19/2017.
 */
public class BankOCRTest {

    /**
     *
     */
    @Test
    public void testBankOCRStoryOne() {
        String entry =  "    _  _     _  _  _  _  _ "
                      + "  | _| _||_||_ |_   ||_||_|"
                      + "  ||_  _|  | _||_|  ||_| _|";

        String expectedResult = "123456789";
        assertEquals(expectedResult, convertEntryToNumber(entry));
    }

    /**
     *
     */
    @Test
    public void testBankOCRStoryOneJustZeros() {
        String entry =  " _  _  _  _  _  _  _  _  _ "
                      + "| || || || || || || || || |"
                      + "|_||_||_||_||_||_||_||_||_|";

        String expectedResult = "000000000";
        assertEquals(expectedResult, convertEntryToNumber(entry));
    }

    /**
     *
     */
    @Test
    public void testBankOCRStoryOneJustOnes() {
        String entry =  "                           "
                      + "  |  |  |  |  |  |  |  |  |"
                      + "  |  |  |  |  |  |  |  |  |";

        String expectedResult = "111111111";
        assertEquals(expectedResult, convertEntryToNumber(entry));
    }

    /**
     *
     */
    @Test
    public void testBankOCRStoryOneJustTwos() {
        String entry =  " _  _  _  _  _  _  _  _  _ "
                      + " _| _| _| _| _| _| _| _| _|"
                      + "|_ |_ |_ |_ |_ |_ |_ |_ |_ ";

        String expectedResult = "222222222";
        assertEquals(expectedResult, convertEntryToNumber(entry));
    }

    /**
     *
     */
    @Test
    public void testBankOCRStoryOneJustThrees() {
        String entry =  " _  _  _  _  _  _  _  _  _ "
                      + " _| _| _| _| _| _| _| _| _|"
                      + " _| _| _| _| _| _| _| _| _| ";

        String expectedResult = "333333333";
        assertEquals(expectedResult, convertEntryToNumber(entry));
    }

    /**
     *
     */
    @Test
    public void testBankOCRStoryOneJustFours() {
        String entry =  "                           "
                      + "|_||_||_||_||_||_||_||_||_|"
                      + "  |  |  |  |  |  |  |  |  |";

        String expectedResult = "444444444";
        assertEquals(expectedResult, convertEntryToNumber(entry));
    }

    /**
     *
     */
    @Test
    public void testBankOCRStoryOneJustFives() {
        String entry =  " _  _  _  _  _  _  _  _  _ "
                      + "|_ |_ |_ |_ |_ |_ |_ |_ |_ "
                      + " _| _| _| _| _| _| _| _| _|";

        String expectedResult = "555555555";
        assertEquals(expectedResult, convertEntryToNumber(entry));
    }

    /**
     *
     */
    @Test
    public void testBankOCRStoryOneJustSixs() {
        String entry =  " _  _  _  _  _  _  _  _  _ "
                      + "|_ |_ |_ |_ |_ |_ |_ |_ |_ "
                      + "|_||_||_||_||_||_||_||_||_|";

        String expectedResult = "666666666";
        assertEquals(expectedResult, convertEntryToNumber(entry));
    }

    /**
     *
     */
    @Test
    public void testBankOCRStoryOneJustSevens() {
        String entry =  " _  _  _  _  _  _  _  _  _ "
                      + "  |  |  |  |  |  |  |  |  |"
                      + "  |  |  |  |  |  |  |  |  |";

        String expectedResult = "777777777";
        assertEquals(expectedResult, convertEntryToNumber(entry));
    }

    /**
     *
     */
    @Test
    public void testBankOCRStoryOneJustEights() {
        String entry =  " _  _  _  _  _  _  _  _  _ "
                      + "|_||_||_||_||_||_||_||_||_|"
                      + "|_||_||_||_||_||_||_||_||_|";

        String expectedResult = "888888888";
        assertEquals(expectedResult, convertEntryToNumber(entry));
    }

    /**
     *
     */
    @Test
    public void testBankOCRStoryOneJustNines() {
        String entry =  " _  _  _  _  _  _  _  _  _ "
                      + "|_||_||_||_||_||_||_||_||_|"
                      + " _| _| _| _| _| _| _| _| _|";

        String expectedResult = "999999999";
        assertEquals(expectedResult, convertEntryToNumber(entry));
    }

    /**
     *
     */
    @Test
    public void testBankOCRStoryOneReadFileWorks() {
        String fileName = "src/test/resources/123456789.txt";

        String actualResult = readFile(fileName);
        String expectedResult =  "123456789";

        assertEquals(expectedResult, convertEntryToNumber(actualResult));
    }

    /**
     *
     */
    @Test
    public void testBankOCRStoryOneReadFileAllOnes() {
        String fileName = "src/test/resources/111111111.txt";

        String actualResult = readFile(fileName);
        String expectedResult =  "111111111";

        assertEquals(expectedResult, convertEntryToNumber(actualResult));
    }

    /**
     *
     */
    @Test
    public void testBankOCRStoryOneReadFileAllTwos() {
        String fileName = "src/test/resources/222222222.txt";

        String actualResult = readFile(fileName);
        String expectedResult =  "222222222";

        assertEquals(expectedResult, convertEntryToNumber(actualResult));
    }

    /**
     *
     */
    @Test
    public void validateTheCheckSumOfAKnowNumber() {
        assertTrue(validateAccountNumber("345882865"));
    }

    /**
     *
     */
    @Test
    public void validateTheCheckSumOfAUnKnowNumber() {
        assertFalse(validateAccountNumber("345882864"));
    }

    /**
     *
     */
    @Test
    public void testBankOCRStoryThreeInvalidValues() {
        String entry =  "    _  _     _  _  _       "
                      + "  | _| _||_||_ |_   ||_||_|"
                      + "  ||_  _|  | _||_|  ||_| _|";

        String expectedResult = "1234567??";
        assertEquals(expectedResult, convertEntryToNumber(entry));
    }

    /**
     *
     */
    @Test
    public void testBankOCRStoryThreeOneAccountValidToOutputFile() {
        String entry =  "    _  _  _  _  _  _  _  _ "
                      + "|_||_   ||_ | ||_|| || || |"
                      + "  | _|  | _||_||_||_||_||_|";

        String expectedResult = "457508000";
        assertTrue(validateAccountNumber("457508000"));
        assertEquals(expectedResult, lineOutPut(convertEntryToNumber(entry)));
    }

    /**
     *
     */
    @Test
    public void testBankOCRStoryThreeOneAccountErrorToOutputFile() {
        String entry =  " _  _     _  _        _  _ "
                      + "|_ |_ |_| _|  |  ||_||_||_ "
                      + "|_||_|  | _|  |  |  | _| _|";

        String expectedResult = "664371495 ERR";
        assertFalse(validateAccountNumber("664371495"));
        assertEquals(expectedResult, lineOutPut(convertEntryToNumber(entry)));
    }

    /**
     *
     */
    @Test
    public void testBankOCRStoryThreeOneAccountInvalidNumberToOutputFile() {
        String entry =  " _  _        _        _  _ "
                      + "|_||_   |  || | _| _| _||_ "
                      + "|_||_|  |  ||_|  |  | _||_|";

        String expectedResult = "86110??36 ILL";
        assertFalse(validateAccountNumber("86110??36"));
        assertEquals(expectedResult, lineOutPut(convertEntryToNumber(entry)));
    }

    /**
     *
     */
    @Test
    public void testBankOCRStoryThreeAllInputs() {
        String entryOne =  "    _  _  _  _  _  _  _  _ "
                         + "|_||_   ||_ | ||_|| || || |"
                         + "  | _|  | _||_||_||_||_||_|";
        String entryTwo =  " _  _     _  _        _  _ "
                         + "|_ |_ |_| _|  |  ||_||_||_ "
                         + "|_||_|  | _|  |  |  | _| _|";
        String entryThree =  " _  _        _        _  _ "
                           + "|_||_   |  || | _| _| _||_ "
                           + "|_||_|  |  ||_|  |  | _||_|";

        String expectedResultOne = "457508000";
        String expectedResultTwo = "664371495 ERR";
        String expectedResultThree = "86110??36 ILL";
        assertTrue(validateAccountNumber("457508000"));
        assertFalse(validateAccountNumber("664371495"));
        assertFalse(validateAccountNumber("86110??36"));
        assertEquals(expectedResultOne, lineOutPut(convertEntryToNumber(entryOne)));
        assertEquals(expectedResultTwo, lineOutPut(convertEntryToNumber(entryTwo)));
        assertEquals(expectedResultThree, lineOutPut(convertEntryToNumber(entryThree)));
    }
}
