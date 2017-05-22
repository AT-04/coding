package org.fundacionjala.coding.abel;

import org.junit.Test;

import static org.fundacionjala.coding.abel.BankOCR.convertEntryToNumber;
import static org.junit.Assert.assertEquals;


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
        ReadFile readFile = new ReadFile();

        String actualResult = readFile.read(fileName);
        String expectedResult =  "123456789";

        assertEquals(expectedResult, convertEntryToNumber(actualResult));
    }
}
