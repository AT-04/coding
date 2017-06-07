package org.fundacionjala.coding.marcan;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by MarcandeaCabrera on 5/23/2017.
 */
public class SortContentTest {

    private SortContent sortContent;
    /**
     * This test is a method Before.
     */
    @Before
    public void methodBefore() {
        sortContent = new SortContent();
    }

    /**
     * This test is for verify to characters inverse inside of the word in a sentence.
     */
    @Test
    public void verifyOneWord() {
        assertEquals("Conidg", sortContent.sortContent("Coding"));
        assertEquals("I am", sortContent.sortContent("I am"));
    }

    /**
     * This test is for verify to characters inverse inside of the word in a sentence.
     */
    @Test
    public void verifyASentence() {
        assertEquals("The Conidg Ptriccae", sortContent.sortContent("The Coding Practice"));
    }

    /**
     * This test is for verify to characters inverse inside of the word in a sentence.
     * Different Stage, less to three characters.
     */
    @Test
    public void verifyWordsLessToThreeCharacters() {
        assertEquals("I am", sortContent.sortContent("I am"));
    }

    /**
     * This test is for verify to characters inverse inside of the word in a sentence.
     * Best stage. Combination stage.
     */
    @Test
    public void verifyWordsLessAndGreaterToThreeCharacters() {
        assertEquals("I am Conidg", sortContent.sortContent("I am Coding"));
    }
}
