package org.fundacionjala.coding.joseTorrez;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.fundacionjala.coding.joseTorrez.BankOcr.convertNumber;
import static org.fundacionjala.coding.joseTorrez.BankOcr.output;

/**
 * Created by JoseTorrez on 5/16/2017.
 */
public class BankOcrTest {

    /**
     * this is the first test with numbers 123456789.
     */
    @Test
    public void bankOCRtoTryWith9DifferentNumbers() {
        String entryLine = "    _  _     _  _  _  _  _ "
                + "  | _| _||_||_ |_   ||_||_|"
                + "  ||_  _|  | _||_|  ||_| _|";

        assertEquals("123456789", convertNumber(entryLine));
    }

    /**
     * this test is for just zeros.
     */
    @Test
    public void testBankOCRForJustZeros() {
        String entryLine = " _  _  _  _  _  _  _  _  _ "
                + "| || || || || || || || || |"
                + "|_||_||_||_||_||_||_||_||_|";

        assertEquals("000000000", convertNumber(entryLine));
    }

    /**
     * this test is for just one.
     */
    @Test
    public void testBankOCRSForJustOnes() {
        String entryLine = "                           "
                + "  |  |  |  |  |  |  |  |  |"
                + "  |  |  |  |  |  |  |  |  |";

        assertEquals("111111111", convertNumber(entryLine));
    }

    /**
     * this test is for just for two.
     */
    @Test
    public void testBankOCRSForJustTwos() {
        String entryLine = " _  _  _  _  _  _  _  _  _ "
                + " _| _| _| _| _| _| _| _| _|"
                + "|_ |_ |_ |_ |_ |_ |_ |_ |_ ";

        assertEquals("222222222", convertNumber(entryLine));
    }

    /**
     * this test is for just three.
     */
    @Test
    public void testBankOCRForJustThrees() {
        String entryLine = " _  _  _  _  _  _  _  _  _ "
                + " _| _| _| _| _| _| _| _| _|"
                + " _| _| _| _| _| _| _| _| _| ";

        assertEquals("333333333", convertNumber(entryLine));
    }

    /**
     * this test is for just four.
     */
    @Test
    public void testBankOCRForJustFours() {
        String entryLine = "                           "
                + "|_||_||_||_||_||_||_||_||_|"
                + "  |  |  |  |  |  |  |  |  |";

        assertEquals("444444444", convertNumber(entryLine));
    }

    /**
     * this test is for just five.
     */
    @Test
    public void testBankOCRForJustFives() {
        String entryLine = " _  _  _  _  _  _  _  _  _ "
                + "|_ |_ |_ |_ |_ |_ |_ |_ |_ "
                + " _| _| _| _| _| _| _| _| _|";

        assertEquals("555555555", convertNumber(entryLine));
    }

    /**
     * this test is for just six.
     */
    @Test
    public void testBankOCRForJustSixs() {
        String entryLine = " _  _  _  _  _  _  _  _  _ "
                + "|_ |_ |_ |_ |_ |_ |_ |_ |_ "
                + "|_||_||_||_||_||_||_||_||_|";

        assertEquals("666666666", convertNumber(entryLine));
    }

    /**
     * this test is for just seven.
     */
    @Test
    public void testBankOCRForJustSevens() {
        String entryLine = " _  _  _  _  _  _  _  _  _ "
                + "  |  |  |  |  |  |  |  |  |"
                + "  |  |  |  |  |  |  |  |  |";

        assertEquals("777777777", convertNumber(entryLine));
    }

    /**
     * this test is for just eight.
     */
    @Test
    public void testBankOCRForJustEights() {
        String entryLine = " _  _  _  _  _  _  _  _  _ "
                + "|_||_||_||_||_||_||_||_||_|"
                + "|_||_||_||_||_||_||_||_||_|";

        assertEquals("888888888", convertNumber(entryLine));
    }

    /**
     * this test is for just nine.
     */
    @Test
    public void testBankOCRForJustNines() {
        String entryLine = " _  _  _  _  _  _  _  _  _ "
                + "|_||_||_||_||_||_||_||_||_|"
                + " _| _| _| _| _| _| _| _| _|";

        assertEquals("999999999", convertNumber(entryLine));
    }

    /**
     * this test is for correct number count .
     */
    @Test
    public void testBankOCRForCorrectNumberCount() {
        String entryLine = "    _  _  _  _  _  _  _  _ "
                + "|_||_   ||_ | ||_|| || || |"
                + "  | _|  | _||_||_||_||_||_|";

        assertEquals("457508000", output(convertNumber(entryLine)));
    }

    /**
     * this test is for incorrect number count .
     */
    @Test
    public void testBankOCRForIncorrectNumberCount() {
        String entryLine = " _  _     _  _        _  _ "
                + "|_ |_ |_| _|  |  ||_||_||_ "
                + "|_||_|  | _|  |  |  | _| _|";

        assertEquals("664371495 ERR", output(convertNumber(entryLine)));
    }

    /**
     * this test is for invalid number count .
     */
    @Test
    public void testBankOCRForInvalidNumberCount() {
        String entryLine = " _  _        _        _  _ "
                + "|_||_   |  || | _| _| _||_ "
                + "|_||_|  |  ||_|  |  | _||_|";

        assertEquals("86110??36 ILL", output(convertNumber(entryLine)));
    }

}
