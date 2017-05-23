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
        SpinWords spinWords = new SpinWords("Hey fellow warriors");
        String expectedResult = "Hey wollef sroirraw";
        assertEquals(expectedResult, spinWords.getSpinWord());
    }

    /**
     * This test checks the string that returns the method getSpinWord returns the expected string.
     */
    @Test
    public void verifyChangeThisIsATest() {
        SpinWords spinWords = new SpinWords("This is a test");
        String expectedResult = "This is a test";
        assertEquals(expectedResult, spinWords.getSpinWord());
    }

    /**
     * This test checks the string that returns the method getSpinWord returns the expected string.
     */
    @Test
    public void verifyChangeThisIsAnotherTest() {
        SpinWords spinWords = new SpinWords("This is another test");
        String expectedResult = "This is rehtona test";
        assertEquals(expectedResult, spinWords.getSpinWord());
    }


}
