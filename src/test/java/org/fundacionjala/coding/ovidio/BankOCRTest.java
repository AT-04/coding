package org.fundacionjala.coding.ovidio;
import org.junit.Test;
import static org.fundacionjala.coding.ovidio.BankOCR.convertEntryToNumber;
import static org.fundacionjala.coding.ovidio.BankOCR.validateAccountNumber;
import static org.fundacionjala.coding.ovidio.BankOCR.getNumberValue;
import static org.fundacionjala.coding.ovidio.BankOCR.lineOutPut;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by OvidioMiranda on 5/16/2017.
 */
public class BankOCRTest {

    //http://codingdojo.org/kata/BankOCR/

    /**
     *
     */
    @Test
    public void bankOCRtoTryWith9DifferentNumbers() {
        String entryLine = "    _  _     _  _  _  _  _ "
                + "  | _| _||_||_ |_   ||_||_|"
                + "  ||_  _|  | _||_|  ||_| _|";

        assertEquals("123456789", convertEntryToNumber(entryLine));
    }

    /**
     *
     */
    @Test
    public void testBankOCRForJustZeros() {
        String entryLine = " _  _  _  _  _  _  _  _  _ "
                + "| || || || || || || || || |"
                + "|_||_||_||_||_||_||_||_||_|";

        assertEquals("000000000", convertEntryToNumber(entryLine));
    }

    /**
     *
     */
    @Test
    public void testBankOCRSForJustOnes() {
        String entryLine = "                           "
                + "  |  |  |  |  |  |  |  |  |"
                + "  |  |  |  |  |  |  |  |  |";

        assertEquals("111111111", convertEntryToNumber(entryLine));
    }

    /**
     *
     */
    @Test
    public void testBankOCRSForJustTwos() {
        String entryLine = " _  _  _  _  _  _  _  _  _ "
                + " _| _| _| _| _| _| _| _| _|"
                + "|_ |_ |_ |_ |_ |_ |_ |_ |_ ";

        assertEquals("222222222", convertEntryToNumber(entryLine));
    }

    /**
     *
     */
    @Test
    public void testBankOCRForJustThrees() {
        String entryLine = " _  _  _  _  _  _  _  _  _ "
                + " _| _| _| _| _| _| _| _| _|"
                + " _| _| _| _| _| _| _| _| _| ";

        assertEquals("333333333", convertEntryToNumber(entryLine));
    }

    /**
     *
     */
    @Test
    public void testBankOCRForJustFours() {
        String entryLine = "                           "
                + "|_||_||_||_||_||_||_||_||_|"
                + "  |  |  |  |  |  |  |  |  |";

        assertEquals("444444444", convertEntryToNumber(entryLine));
    }

    /**
     *
     */
    @Test
    public void testBankOCRForJustFives() {
        String entryLine = " _  _  _  _  _  _  _  _  _ "
                + "|_ |_ |_ |_ |_ |_ |_ |_ |_ "
                + " _| _| _| _| _| _| _| _| _|";

        assertEquals("555555555", convertEntryToNumber(entryLine));
    }

    /**
     *
     */
    @Test
    public void testBankOCRForJustSixs() {
        String entryLine = " _  _  _  _  _  _  _  _  _ "
                + "|_ |_ |_ |_ |_ |_ |_ |_ |_ "
                + "|_||_||_||_||_||_||_||_||_|";

        assertEquals("666666666", convertEntryToNumber(entryLine));
    }

    /**
     *
     */
    @Test
    public void testBankOCRForJustSevens() {
        String entryLine = " _  _  _  _  _  _  _  _  _ "
                + "  |  |  |  |  |  |  |  |  |"
                + "  |  |  |  |  |  |  |  |  |";

        assertEquals("777777777", convertEntryToNumber(entryLine));
    }

    /**
     *
     */
    @Test
    public void testBankOCRForJustEights() {
        String entryLine = " _  _  _  _  _  _  _  _  _ "
                + "|_||_||_||_||_||_||_||_||_|"
                + "|_||_||_||_||_||_||_||_||_|";

        assertEquals("888888888", convertEntryToNumber(entryLine));
    }

    /**
     *
     */
    @Test
    public void testBankOCRForJustNines() {
        String entryLine = " _  _  _  _  _  _  _  _  _ "
                + "|_||_||_||_||_||_||_||_||_|"
                + " _| _| _| _| _| _| _| _| _|";

        assertEquals("999999999", convertEntryToNumber(entryLine));
    }

    /**
     *
     */
    @Test
    public void testBankOCRForCorrectNumberCount() {
        String entryLine = "    _  _  _  _  _  _  _  _ "
                + "|_||_   ||_ | ||_|| || || |"
                + "  | _|  | _||_||_||_||_||_|";

        assertEquals("457508000", lineOutPut(convertEntryToNumber(entryLine)));
    }

    /**
     *
     */
    @Test
    public void testBankOCRForIncorrectNumberCount() {
        String entryLine = " _  _     _  _        _  _ "
                + "|_ |_ |_| _|  |  ||_||_||_ "
                + "|_||_|  | _|  |  |  | _| _|";

        assertEquals("664371495 ERR", lineOutPut(convertEntryToNumber(entryLine)));
    }

    /**
     *
     */
    @Test
    public void testBankOCRForInvalidNumberCount() {
        String entry = " _  _        _        _  _ "
                + "|_||_   |  || | _| _| _||_ "
                + "|_||_|  |  ||_|  |  | _||_|";


        assertEquals("86110??36 ILL", lineOutPut(convertEntryToNumber(entry)));

    }

    /**
     *
     */
    @Test
    public void isValueEqualOne() {
        String entryNumber = "   "
                + "  |"
                + "  |";
        String expectedResult = "1";
        assertEquals(expectedResult, getNumberValue(entryNumber));
    }

    /**
     *
     */
    @Test
    public void isValueEqualTwo() {
        String entryNumber = " _ "
                + " _|"
                + "|_ ";
        String expectedResult = "2";
        assertEquals(expectedResult, getNumberValue(entryNumber));
    }

    /**
     *
     */
    @Test
    public void isValueEqualTree() {
        String entryNumber = " _ "
                + " _|"
                + " _|";
        String expectedResult = "3";
        assertEquals(expectedResult, getNumberValue(entryNumber));
    }

    /**
     *
     */
    @Test
    public void isValueEqualFour() {
        String entryNumber = "   "
                + "|_|"
                + "  |";
        String expectedResult = "4";
        assertEquals(expectedResult, getNumberValue(entryNumber));
    }

    /**
     *
     */
    @Test
    public void isValueEqualFive() {
        String entryNumber = " _ "
                + "|_ "
                + " _|";
        String expectedResult = "5";
        assertEquals(expectedResult, getNumberValue(entryNumber));
    }

    /**
     *
     */
    @Test
    public void isValueEqualSix() {
        String entryNumber = " _ "
                + "|_ "
                + "|_|";
        String expectedResult = "6";
        assertEquals(expectedResult, getNumberValue(entryNumber));
    }

    /**
     *
     */
    @Test
    public void isValueEqualSeven() {
        String entryNumber = " _   |  |";
        String expectedResult = "7";
        assertEquals(expectedResult, getNumberValue(entryNumber));
    }


    /**
     *
     */
    @Test
    public void isValueEqualEight() {
        String entryNumber = " _ "
                + "|_|"
                + "|_|";
        String expectedResult = "8";
        assertEquals(expectedResult, getNumberValue(entryNumber));
    }

    /**
     *
     */
    @Test
    public void isValueEqualNine() {
        String entryNumber = " _ "
                + "|_|"
                + " _|";
        String expectedResult = "9";
        assertEquals(expectedResult, getNumberValue(entryNumber));
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

}

