package org.fundacionjala.coding.abel;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by AbelBarrientos on 5/22/2017.
 */
public class SpinWordsTest {

    /**
     *
     */
    @Test
    public void aSingleWordIsReversed() {
        SpinWords spinWords = new SpinWords();

        assertEquals("olleH", spinWords.reverse("Hello"));
    }

    /**
     *
     */
    @Test
    public void aLongWordIsReversed() {
        SpinWords spinWords = new SpinWords();

        assertEquals("noitaminA", spinWords.reverse("Animation"));
    }

    /**
     *
     */
    @Test
    public void getAWordInTheSentence() {
        SpinWords spinWords = new SpinWords();
        List<String> expected = Arrays.asList("Hello");

        assertEquals(expected, spinWords.getWords("Hello"));
    }

    /**
     *
     */
    @Test
    public void getAllWordsInTheSentence() {
        SpinWords spinWords = new SpinWords();
        List<String> expected = Arrays.asList("This", "is", "a", "long", "sentence");

        assertEquals(expected, spinWords.getWords("This is a long sentence"));
    }

    /**
     *
     */
    @Test
    public void spinASingleThreeWord() {
        SpinWords spinWords = new SpinWords();

        assertEquals("Bye", spinWords.spinWords("Bye"));
    }
    /**
     *
     */
    @Test
    public void spinASingleFiveWord() {
        SpinWords spinWords = new SpinWords();

        assertEquals("olleH", spinWords.spinWords("Hello"));
    }

    /**
     *
     */
    @Test
    public void spinATwoWordsSentence() {
        SpinWords spinWords = new SpinWords();

        assertEquals("olleH guy", spinWords.spinWords("Hello guy"));
    }

    /**
     *
     */
    @Test
    public void spinWordsFromFirstExample() {
        SpinWords spinWords = new SpinWords();

        assertEquals("Hey wollef sroirraw", spinWords.spinWords("Hey fellow warriors"));
    }

    /**
     *
     */
    @Test
    public void spinWordsFromSecondExample() {
        SpinWords spinWords = new SpinWords();

        assertEquals("This is a test", spinWords.spinWords("This is a test"));
    }

    /**
     *
     */
    @Test
    public void spinWordsFromThirdExample() {
        SpinWords spinWords = new SpinWords();

        assertEquals("This is rehtona test", spinWords.spinWords("This is another test"));
    }
}
