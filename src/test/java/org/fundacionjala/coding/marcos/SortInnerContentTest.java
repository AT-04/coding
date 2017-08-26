package org.fundacionjala.coding.marcos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Marcos Lara on 5/23/2017.
 */
public class SortInnerContentTest {
    /**
     * Test that tests the Sort Inner Content for an empty string.
     */
    @Test
    public void getSortInnerContentOfAEmptyStringIsAEmptyString() {
        String sentence = "";
        assertEquals("", SortInnerContent.sortInnerContent(sentence));
    }

    /**
     * Test that tests the Sort Inner Content for a string with a letter.
     */
    @Test
    public void getSortInnerContentOfAStringWithOneLetterIsTheSameLetter() {
        String sentence = "a";
        assertEquals("a", SortInnerContent.sortInnerContent(sentence));
    }

    /**
     * Test that tests the Sort Inner Content for a string with three letters.
     */
    @Test
    public void getSortInnerContentOfAStringWithThreeLettersIsTheSameString() {
        String sentence = "abc";

        assertEquals("abc", SortInnerContent.sortInnerContent(sentence));
    }

    /**
     * Test that tests the Sort Inner Content for a string with six letters.
     */
    @Test
    public void getSortInnerContentOfAStringWithSixLetters() {
        String sentence = "abcdef";

        assertEquals("aedcbf", SortInnerContent.sortInnerContent(sentence));
    }

    /**
     * Test that tests the Sort Inner Content for a string with two words.
     */
    @Test
    public void getSortInnerContentOfAStringWithTwoWords() {
        String sentence = "gaming time";

        assertEquals("gnmiag tmie", SortInnerContent.sortInnerContent(sentence));
    }

    /**
     * Test that tests the Sort Inner Content for a string (example 1).
     */
    @Test
    public void getSortInnerContentOfAExampleStringNumberOne() {
        String sentence = "sort the inner content in descending order";

        assertEquals("srot the inner ctonnet in dsnnieedcg oredr", SortInnerContent.sortInnerContent(sentence));
    }

    /**
     * Test that tests the Sort Inner Content for a string (example 2).
     */
    @Test
    public void getSortInnerContentOfAExampleStringNumberTwo() {
        String sentence = "wait for me";

        assertEquals("wiat for me", SortInnerContent.sortInnerContent(sentence));
    }

    /**
     * Test that tests the Sort Inner Content for a string (example 3).
     */
    @Test
    public void getSortInnerContentOfAExampleStringNumberThree() {
        String sentence = "this kata is easy";

        assertEquals("tihs ktaa is esay", SortInnerContent.sortInnerContent(sentence));
    }
}
