package org.fundacionjala.coding.ovidio_sortInnerContent;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by OvidioMiranda on 5/26/2017.
 */
public class SortInnerContentTest {

    private SortInnerContent sortInnerContent;

    /**
     * Initial setup.
     */
    @Before
    public void setUp() {
        sortInnerContent = new SortInnerContent();
    }

    /**
     * Will be tested the sorted with only a character.
     */
    @Test
    public void sortedWithOnlyACharacter() {
        assertEquals("I", sortInnerContent.sort("I"));
    }

    /**
     * Will be tested the sorted with only a character more one word.
     */
    @Test
    public void sortedWithOnlyACharacterMoreAWord() {
        assertEquals("I am", sortInnerContent.sort("I am"));
    }


    /**
     * Will be tested the sorted with only a word.
     */
    @Test
    public void sortedWithOnlyWord() {
        assertEquals("ctonnet", sortInnerContent.sort("content"));
    }

    /**
     * Will be tested the sorted with six words.
     */
    @Test
    public void sortedWithSixWords() {
        String sentence = "sort the inner content in descending order";
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr", sortInnerContent.sort(sentence));
    }

    /**
     * Will be tested the sorted with three words.
     */
    @Test
    public void sortedWithThreeWords() {
        String sentence = "wait for me";
        assertEquals("wiat for me", sortInnerContent.sort(sentence));
    }

    /**
     * Will be tested the sorted with four words.
     */
    @Test
    public void sortedWithFourWords() {
        String sentence = "this kata is easy";
        assertEquals("tihs ktaa is esay", sortInnerContent.sort(sentence));
    }

}
