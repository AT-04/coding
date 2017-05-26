package org.fundacionjala.coding.ovidio_spinwords;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by OvidioMiranda on 5/26/2017.
 */
public class SpinWordTest {

    /**
     * Test for see one sentecen reverse.
     */
    @Test
    public void whenYouHaveOneWord() {
        SpinWord test1 = new SpinWord("Hello");
        String result = test1.spinWords();
        assertEquals("olleH", result);
    }

    /**
     * Test for when you have three words and last string passed to five letters.
     */
    @Test
    public void whenYouHaveThreeWordsAndLastStringPassedToFiveLetters() {
        SpinWord test1 = new SpinWord("Hey fellow warriors");
        String result = test1.spinWords();
        assertEquals("Hey wollef sroirraw", result);
    }

    /**
     * Test for when you have four words and are less to five letters.
     */
    @Test
    public void whenYouHaveFourWordsAndAreLessToFiveLetters() {
        SpinWord test1 = new SpinWord("This is a test");
        String result = test1.spinWords();
        assertEquals("This is a test", result);
    }

    /**
     * Test for when you have three words and third word passed the five letters.
     */
    @Test
    public void whenYouHaveThreeWordsAndThirdWordPassedTheFiveLetters() {
        SpinWord test1 = new SpinWord("This is another test");
        String result = test1.spinWords();
        assertEquals("This is rehtona test", result);
    }

}
