package org.fundacionjala.coding.ovidio;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by OvidioMiranda on 5/26/2017.
 */
public class SpinWordTest {
    private SpinWord spinWord;

    /**
     * Initial setup.
     */
    @Before
    public void setUp() {
        spinWord = new SpinWord();
    }

    /**
     * Test for see one sentecen reverse.
     */
    @Test
    public void whenYouHaveOneWord() {
        assertEquals("olleH", spinWord.spinWords("Hello"));
    }

    /**
     * Test for when you have three words and last string passed to five letters.
     */
    @Test
    public void whenYouHaveThreeWordsAndLastStringPassedToFiveLetters() {
        assertEquals("Hey wollef sroirraw", spinWord.spinWords("Hey fellow warriors"));
    }

    /**
     * Test for when you have four words and are less to five letters.
     */
    @Test
    public void whenYouHaveFourWordsAndAreLessToFiveLetters() {
        assertEquals("This is a test", spinWord.spinWords("This is a test"));
    }

    /**
     * Test for when you have three words and third word passed the five letters.
     */
    @Test
    public void whenYouHaveThreeWordsAndThirdWordPassedTheFiveLetters() {
        assertEquals("This is rehtona test", spinWord.spinWords("This is another test"));
    }

}
