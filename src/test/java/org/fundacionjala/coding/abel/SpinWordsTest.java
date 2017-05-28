package org.fundacionjala.coding.abel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AbelBarrientos on 5/22/2017.
 */
public class SpinWordsTest {

    private SpinWords spinWords;

    /**
     *
     */
    @Before
    public void initObjects() {
        spinWords = new SpinWords();
    }

    /**
     *
     */
    @Test
    public void aSingleWordIsReversed() {
        assertEquals("olleH", spinWords.spinWords("Hello"));
    }

    /**
     *
     */
    @Test
    public void aLongWordIsReversed() {
        assertEquals("noitaminA", spinWords.spinWords("Animation"));
    }

    /**
     *
     */
    @Test
    public void spinASingleThreeWord() {
        assertEquals("Bye", spinWords.spinWords("Bye"));
    }
    /**
     *
     */
    @Test
    public void spinASingleFiveWord() {
        assertEquals("olleH", spinWords.spinWords("Hello"));
    }

    /**
     *
     */
    @Test
    public void spinATwoWordsSentence() {
        assertEquals("olleH guy", spinWords.spinWords("Hello guy"));
    }

    /**
     *
     */
    @Test
    public void spinWordsFromFirstExample() {
        assertEquals("Hey wollef sroirraw", spinWords.spinWords("Hey fellow warriors"));
    }

    /**
     *
     */
    @Test
    public void spinWordsFromSecondExample() {
        assertEquals("This is a test", spinWords.spinWords("This is a test"));
    }

    /**
     *
     */
    @Test
    public void spinWordsFromThirdExample() {
        assertEquals("This is rehtona test", spinWords.spinWords("This is another test"));
    }
}
