package org.fundacionjala.coding.richard.severich.spinwords;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by RichardSeverich on 5/22/2017.
 */
public class SpinWordsTest {

    /**
     * This test checks the string that returns the method getSpinWord returns the expected string.
     */
    @Test
    public void verifyChangeHeyFellowWarriors() {
        SpinWords spinWords = new SpinWords();
        String expectedResult = "Hey wollef sroirraw";
        assertEquals(expectedResult, spinWords.spin("Hey fellow warriors"));
    }

    /**
     * This test checks the string that returns the method getSpinWord returns the expected string.
     */
    @Test
    public void verifyChangeThisIsATest() {
        SpinWords spinWords = new SpinWords();
        String expectedResult = "This is a test";
        assertEquals(expectedResult, spinWords.spin("This is a test"));
    }

    /**
     * This test checks the string that returns the method getSpinWord returns the expected string.
     */
    @Test
    public void verifyChangeThisIsAnotherTest() {
        SpinWords spinWords = new SpinWords();
        String expectedResult = "This is rehtona test";
        assertEquals(expectedResult, spinWords.spin("This is another test"));
    }
}
