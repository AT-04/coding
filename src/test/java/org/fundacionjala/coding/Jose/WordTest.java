package org.fundacionjala.coding.Jose;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by JoseTorrez on 5/19/2017.
 */
public class WordTest {
    private Word spinwords;

    /**
     *
     */
    @Before
    public void initObjects() {
        spinwords = new Word();
    }

    /**
     *
     */
    @Test
    public void helloIs() {

        assertEquals("olleH", spinwords.words("Hello"));
    }

    /**
     *
     */
    @Test
    public void longWord() {


        assertEquals("detcepxE", spinwords.words("Expected"));
    }

    /**
     *
     */
    @Test
    public void threeWord() {

        assertEquals("Yes", spinwords.words("Yes"));
    }

    /**
     *
     */
    @Test
    public void fiveWord() {

        assertEquals("yppaH", spinwords.words("Happy"));
    }

    /**
     *
     */
    @Test
    public void twoSentence() {

        assertEquals("olleH guy", spinwords.words("Hello guy"));
    }

    /**
     *
     */
    @Test
    public void spinWordsFromFirstExample() {

        assertEquals("Hey elttil seiggod", spinwords.words("Hey little doggies"));
    }

    /**
     *
     */
    @Test
    public void spinWordsFromSecondExample() {

        assertEquals("What neppaH Here", spinwords.words("What Happen Here"));
    }

    /**
     *
     */
    @Test
    public void spinWordsFromThirdExample() {

        assertEquals("Lets take it now", spinwords.words("Lets take it now"));
    }
}
