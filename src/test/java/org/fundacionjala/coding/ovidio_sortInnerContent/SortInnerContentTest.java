package org.fundacionjala.coding.ovidio_sortInnerContent;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by OvidioMiranda on 5/26/2017.
 */
public class SortInnerContentTest {

    /**
     * Will be tested the sorted with only a word.
     */
    @Test
    public void sortedWithOnlyWord() {
        SortInnerContent sortInnerContent = new SortInnerContent();
        assertEquals("ctonnet", sortInnerContent.sort("content"));
    }

    /**
     * Will be tested the sorted with six words.
     */
    @Test
    public void sortedWithSixWords() {
        SortInnerContent sortInnerContent = new SortInnerContent();
        String sentence = "sort the inner content in descending order";
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr", sortInnerContent.sort(sentence));
    }

    /**
     * Will be tested the sorted with three words.
     */
    @Test
    public void sortedWithThreeWords() {
        SortInnerContent sortInnerContent = new SortInnerContent();
        String sentence = "wait for me";
        assertEquals("wiat for me", sortInnerContent.sort(sentence));
    }

    /**
     * Will be tested the sorted with four words.
     */
    @Test
    public void sortedWithFourWords() {
        SortInnerContent sortInnerContent = new SortInnerContent();
        String sentence = "this kata is easy";
        assertEquals("tihs ktaa is esay", sortInnerContent.sort(sentence));
    }

}
