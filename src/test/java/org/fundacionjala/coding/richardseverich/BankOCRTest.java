package org.fundacionjala.coding.richardseverich;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Richard on 6/4/2017.
 */
public class BankOCRTest {

    private BankOCR bankOrc;
    private String line1;
    private String line2;
    private String line3;
    private String expectedResult;

    /**
     *
     */
    @Before
    public void setUp() {
        bankOrc = new BankOCR();

    }

    /**
     *
     */
    @Test
    public void testStoryOne() {
        line1 = "    _  _     _  _  _  _  _ ";
        line2 = "  | _| _||_||_ |_   ||_||_|";
        line3 = "  ||_  _|  | _||_|  ||_| _|";
        expectedResult = "123456789";
        assertEquals(expectedResult, bankOrc.convertEntryToNumber(line1, line2, line3));
    }

    /**
     *
     */
    @Test
    public void testStoryOneZeros() {
        line1 = " _  _  _  _  _  _  _  _  _ ";
        line2 = "| || || || || || || || || |";
        line3 = "|_||_||_||_||_||_||_||_||_|";
        expectedResult = "000000000";
        assertEquals(expectedResult, bankOrc.convertEntryToNumber(line1, line2, line3));
    }

    /**
     *
     */
    @Test
    public void testStoryOneOnes() {
        line1 = "                           ";
        line2 = "  |  |  |  |  |  |  |  |  |";
        line3 = "  |  |  |  |  |  |  |  |  |";
        expectedResult = "111111111";
        assertEquals(expectedResult, bankOrc.convertEntryToNumber(line1, line2, line3));
    }

    /**
     *
     */
    @Test
    public void testStoryOneTwos() {
        line1 = " _  _  _  _  _  _  _  _  _ ";
        line2 = " _| _| _| _| _| _| _| _| _|";
        line3 = "|_ |_ |_ |_ |_ |_ |_ |_ |_ ";
        expectedResult = "222222222";
        assertEquals(expectedResult, bankOrc.convertEntryToNumber(line1, line2, line3));
    }

    /**
     *
     */
    @Test
    public void testStoryOneThrees() {
        line1 = " _  _  _  _  _  _  _  _  _ ";
        line2 = " _| _| _| _| _| _| _| _| _|";
        line3 = " _| _| _| _| _| _| _| _| _| ";
        expectedResult = "333333333";
        assertEquals(expectedResult, bankOrc.convertEntryToNumber(line1, line2, line3));
    }

    /**
     *
     */
    @Test
    public void testStoryOneFours() {
        line1 = "                           ";
        line2 = "|_||_||_||_||_||_||_||_||_|";
        line3 = "  |  |  |  |  |  |  |  |  |";
        expectedResult = "444444444";
        assertEquals(expectedResult, bankOrc.convertEntryToNumber(line1, line2, line3));
    }

    /**
     *
     */
    @Test
    public void testStoryOneFives() {
        line1 = " _  _  _  _  _  _  _  _  _ ";
        line2 = "|_ |_ |_ |_ |_ |_ |_ |_ |_ ";
        line3 = " _| _| _| _| _| _| _| _| _|";
        expectedResult = "555555555";
        assertEquals(expectedResult, bankOrc.convertEntryToNumber(line1, line2, line3));
    }

    /**
     *
     */
    @Test
    public void testStoryOneSixs() {
        line1 = " _  _  _  _  _  _  _  _  _ ";
        line2 = "|_ |_ |_ |_ |_ |_ |_ |_ |_ ";
        line3 = "|_||_||_||_||_||_||_||_||_|";
        expectedResult = "666666666";
        assertEquals(expectedResult, bankOrc.convertEntryToNumber(line1, line2, line3));
    }

    /**
     *
     */
    @Test
    public void testStoryOneSevens() {
        line1 = " _  _  _  _  _  _  _  _  _ ";
        line2 = "  |  |  |  |  |  |  |  |  |";
        line3 = "  |  |  |  |  |  |  |  |  |";
        expectedResult = "777777777";
        assertEquals(expectedResult, bankOrc.convertEntryToNumber(line1, line2, line3));
    }

    /**
     *
     */
    @Test
    public void testStoryOneEights() {
        line1 = " _  _  _  _  _  _  _  _  _ ";
        line2 = "|_||_||_||_||_||_||_||_||_|";
        line3 = "|_||_||_||_||_||_||_||_||_|";
        expectedResult = "888888888";
        assertEquals(expectedResult, bankOrc.convertEntryToNumber(line1, line2, line3));
    }

    /**
     *
     */
    @Test
    public void testStoryOneNines() {
        line1 = " _  _  _  _  _  _  _  _  _ ";
        line2 = "|_||_||_||_||_||_||_||_||_|";
        line3 = " _| _| _| _| _| _| _| _| _|";
        expectedResult = "999999999";
        assertEquals(expectedResult, bankOrc.convertEntryToNumber(line1, line2, line3));
    }

    /**
     *
     */
    @Test
    public void testStoryTwoValidNumber() {
        assertTrue(bankOrc.isValidChecksum("345882865"));

    }

    /**
     *
     */
    @Test
    public void testStoryTwoInvalidNumber() {
        assertFalse(bankOrc.isValidChecksum("345882864"));

    }

    /**
     *
     */
    @Test
    public void testStoryThreeInvalidNumber() {
        line1 = "    _  _     _  _  _       ";
        line2 = "  | _| _||_||_ |_   ||_||_|";
        line3 = "  ||_  _|  | _||_|  ||_| _|";
        expectedResult = "1234567??";
        assertEquals(expectedResult, bankOrc.convertEntryToNumber(line1, line2, line3));
    }

    /**
     *
     */
    @Test
    public void testStoryThreeAccountValidToOutputFile() {
        line1 = "    _  _  _  _  _  _  _  _ ";
        line2 = "|_||_   ||_ | ||_|| || || |";
        line3 = "  | _|  | _||_||_||_||_||_|";
        expectedResult = "457508000";
        assertEquals(expectedResult, bankOrc.lineOutPut(bankOrc.convertEntryToNumber(line1, line2, line3)));
    }

    /**
     *
     */
    @Test
    public void testBankOCRStoryThreeOneAccountErrorToOutputFile() {
        line1 = " _  _     _  _        _  _ ";
        line2 = "|_ |_ |_| _|  |  ||_||_||_ ";
        line3 = "|_||_|  | _|  |  |  | _| _|";
        expectedResult = "664371495 ERR";
        assertEquals(expectedResult, bankOrc.lineOutPut(bankOrc.convertEntryToNumber(line1, line2, line3)));

    }

    /**
     *
     */
    @Test
    public void testBankOCRStoryThreeOneAccountInvalidNumberToOutputFile() {
        line1 = " _  _        _        _  _ ";
        line2 = "|_||_   |  || | _| _| _||_ ";
        line3 = "|_||_|  |  ||_|  |  | _||_|";
        expectedResult = "86110??36 ILL";
        assertEquals(expectedResult, bankOrc.lineOutPut(bankOrc.convertEntryToNumber(line1, line2, line3)));
    }
}
