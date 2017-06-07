package org.fundacionjala.coding.marcoslara.bankocr;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Marcos Lara on 5/19/2017.
 */
public class BankOCRTest {

    /**
     * A basic test of the Story One.
     */
    @Test
    public void testOfTheStoryOne() {
        String entry = "    _  _     _  _  _  _  _ "
                + "  | _| _||_||_ |_   ||_||_|"
                + "  ||_  _|  | _||_|  ||_| _|";

        String expectedResult = "123456789";
        assertEquals(expectedResult, BankOCR.convertToNumber(entry));
    }

    /**
     * Additional test for Story One with zeroes numbers.
     */
    @Test
    public void additionalTestForStoryOneWithZeroesNumbers() {
        String entry = "    _  _     _  _  _  _  _ "
                + "  | _| _||_||_ | || || || |"
                + "  ||_  _|  | _||_||_||_||_|";

        String expectedResult = "123450000";
        assertEquals(expectedResult, BankOCR.convertToNumber(entry));
    }

    /**
     * Additional test with invalid account number.
     */
    @Test
    public void additionalTestForStoryOneWithInvalidAccountNumber() {
        String scan = "    _  _     _  _  _       "
                + "  | _| _||_||_ |_   ||_||_|"
                + "  ||_  _|  | _||_|  ||_| _|";

        String expectedResult = "1234567??";
        assertEquals(expectedResult, BankOCR.convertToNumber(scan));
    }

    /**
     * Additional test with an illegible account number.
     */
    @Test
    public void additionalTestForStoryOneWithIllegibleAccountNumber() {
        String scan = " _  _        _        _  _ "
                + "|_||_   |  || | _| _| _||_ "
                + "|_||_|  |  ||_|  |  | _||_|";

        String expectedResult = "86110??36";
        assertEquals(expectedResult, BankOCR.convertToNumber(scan));
    }

    /**
     * Validate checksum of a valid account number.
     */
    @Test
    public void validateCheckSumOfAValidAccountNumber() {
        assertTrue(BankOCR.validateChecksum("345882865"));
    }

    /**
     * Validate checksum of a invalid account number.
     */
    @Test
    public void validateCheckSumOfAInvalidAccountNumber() {
        assertFalse(BankOCR.validateChecksum("345882864"));
    }

    /**
     * Test for story three of a illegible account number.
     */
    @Test
    public void testStoryThreeOfAIllegibleAccountNumber() {
        String scan = " _  _        _        _  _ "
                + "|_||_   |  || | _| _| _||_ "
                + "|_||_|  |  ||_|  |  | _||_|";

        String expectedResult = "86110??36 ILL";
        assertEquals(expectedResult, BankOCR.validateAccountNumber(scan));
    }

    /**
     * Test for story three of a invalid account number.
     */
    @Test
    public void testStoryThreeOfAInvalidAccountNumber() {
        String scan = " _  _     _  _        _  _ "
                + "|_ |_ |_| _|  |  ||_||_||_ "
                + "|_||_|  | _|  |  |  | _| _|";

        String expectedResult = "664371495 ERR";
        assertEquals(expectedResult, BankOCR.validateAccountNumber(scan));
    }
}
