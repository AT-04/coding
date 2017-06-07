package org.fundacionjala.coding.ovidio;
import org.junit.Test;
import static org.fundacionjala.coding.ovidio.BankOCR.convertEntryToNumber;
import static org.fundacionjala.coding.ovidio.BankOCR.lineOutPut;
import static org.junit.Assert.assertEquals;

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
        String entry =  " _  _        _        _  _ "
                + "|_||_   |  || | _| _| _||_ "
                + "|_||_|  |  ||_|  |  | _||_|";

        assertEquals("86110??36 ILL", lineOutPut(convertEntryToNumber(entry)));

    }
}

