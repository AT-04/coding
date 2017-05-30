package org.fundacionjala.coding.richard.severich.spinwords;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by RichardSeverich on 5/22/2017.
 */
public class SpinWordsTest {

    private SpinWords spinWords;

    /**
     * This method is executed before all the Unit Test.
     */
    @Before
    public void setUp() {
        spinWords = new SpinWords();
    }

    /**
     * This test checks the string that returns the method getSpinWord returns the expected string.
     */
    @Test
    public void verifyChangeHeyFellowWarriors() {

        String expectedResult = "Hey wollef sroirraw";
        assertEquals(expectedResult, spinWords.spin("Hey fellow warriors"));
    }

    /**
     * This test checks the string that returns the method getSpinWord returns the expected string.
     */
    @Test
    public void verifyChangeThisIsATest() {
        String expectedResult = "This is a test";
        assertEquals(expectedResult, spinWords.spin("This is a test"));
    }

    /**
     * This test checks the string that returns the method getSpinWord returns the expected string.
     */
    @Test
    public void verifyChangeThisIsAnotherTest() {
        String expectedResult = "This is rehtona test";
        assertEquals(expectedResult, spinWords.spin("This is another test"));
    }
}
