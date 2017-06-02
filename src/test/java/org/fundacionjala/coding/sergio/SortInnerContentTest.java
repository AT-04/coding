package org.fundacionjala.coding.sergio;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by SergioNavarro on 5/31/2017.
 */
public class SortInnerContentTest {
    /**
     *
     */
    @Test
    public void sentenceWithWordsLengthlessThan3() {
       String sentence = "I am a cat";

       assertEquals("I am a cat", SortInnerContent.reverseSort(sentence));
    }
    /**
     *
     */
    @Test
    public void firstTestCaseExample() {
        String sentence = "sort the inner content in descending order";

        assertEquals("srot the inner ctonnet in dsnnieedcg oredr", SortInnerContent.reverseSort(sentence));
    }
    /**
     *
     */
    @Test
    public void secondTestCaseExample() {
        String sentence = "wait for me";

        assertEquals("wiat for me", SortInnerContent.reverseSort(sentence));
    }
    /**
     *
     */
    @Test
    public void thirdTestCaseExample() {
        String sentence = "this kata is easy";

        assertEquals("tihs ktaa is esay", SortInnerContent.reverseSort(sentence));
    }

}
