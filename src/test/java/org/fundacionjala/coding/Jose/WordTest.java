package org.fundacionjala.coding.Jose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by JoseTorrez on 5/19/2017.
 */
public class WordTest {

    /**
     *
     */
    @Test
    public void HelloisolleH() {
        Word spinWords = new Word();

        assertEquals("olleH", spinWords.Words("Hello"));
    }

    /**
     *
     */
    @Test
    public void longWord() {
        Word spinWords = new Word();

        assertEquals("detcepxE", spinWords.Words("Expected"));
    }

    /**
     *
     */    @Test
    public void threeWord() {
        Word spinWords = new Word();

        assertEquals("Yes", spinWords.Words("Yes"));
    }
    /**
     *
     */
    @Test
    public void fiveWord() {
        Word spinWords = new Word();

        assertEquals("yppaH", spinWords.Words("Happy"));
    }

    /**
     *
     */
    @Test
    public void twoSentence() {
        Word spinWords = new Word();

        assertEquals("olleH guy", spinWords.Words("Hello guy"));
    }

    /**
     *
     */
    @Test
    public void spinWordsFromFirstExample() {
        Word spinWords = new Word();

        assertEquals("Hey elttit seiggod", spinWords.Words("Hey little doggies"));
    }

    /**
     *
     */
    @Test
    public void spinWordsFromSecondExample() {
        Word spinWords = new Word();

        assertEquals("tahW neppaH ereH", spinWords.Words("What Happen Here"));
    }

    /**
     *
     */
    @Test
    public void spinWordsFromThirdExample() {
        Word spinWords = new Word();

        assertEquals("steL take it now", spinWords.Words("Lets take it now"));
    }
}