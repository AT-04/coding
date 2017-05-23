package org.fundacionjala.coding.marcoslara.sortinnercontent;

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
        SortInnerContent sortInnerContent = new SortInnerContent("");

        assertEquals("", sortInnerContent.getSortInnerContent());
    }

    /**
     * Test that tests the Sort Inner Content for a string with a letter.
     */
    @Test
    public void getSortInnerContentOfAStringWithOneLetterIsTheSameLetter() {
        SortInnerContent sortInnerContent = new SortInnerContent("a");

        assertEquals("a", sortInnerContent.getSortInnerContent());
    }

    /**
     * Test that tests the Sort Inner Content for a string with three letters.
     */
    @Test
    public void getSortInnerContentOfAStringWithThreeLettersIsTheSameString() {
        SortInnerContent sortInnerContent = new SortInnerContent("abc");

        assertEquals("abc", sortInnerContent.getSortInnerContent());
    }

    /**
     * Test that tests the Sort Inner Content for a string with six letters.
     */
    @Test
    public void getSortInnerContentOfAStringWithSixLetters() {
        SortInnerContent sortInnerContent = new SortInnerContent("abcdef");

        assertEquals("aedcbf", sortInnerContent.getSortInnerContent());
    }

    /**
     * Test that tests the Sort Inner Content for a string with two words.
     */
    @Test
    public void getSortInnerContentOfAStringWithTwoWords() {
        SortInnerContent sortInnerContent = new SortInnerContent("time gaming");

        assertEquals("tmie gnmiag", sortInnerContent.getSortInnerContent());
    }

    /**
     * Test that tests the Sort Inner Content for a string (example 1).
     */
    @Test
    public void getSortInnerContentOfAExampleStringNumberOne() {
        SortInnerContent sortInnerContent = new SortInnerContent("sort the inner content in descending order");

        assertEquals("srot the inner ctonnet in dsnnieedcg oredr", sortInnerContent.getSortInnerContent());
    }

    /**
     * Test that tests the Sort Inner Content for a string (example 2).
     */
    @Test
    public void getSortInnerContentOfAExampleStringNumberTwo() {
        SortInnerContent sortInnerContent = new SortInnerContent("wait for me");

        assertEquals("wiat for me", sortInnerContent.getSortInnerContent());
    }

    /**
     * Test that tests the Sort Inner Content for a string (example 3).
     */
    @Test
    public void getSortInnerContentOfAExampleStringNumberThree() {
        SortInnerContent sortInnerContent = new SortInnerContent("this kata is easy");

        assertEquals("tihs ktaa is esay", sortInnerContent.getSortInnerContent());
    }
}
