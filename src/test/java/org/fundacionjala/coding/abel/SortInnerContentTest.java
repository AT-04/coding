package org.fundacionjala.coding.abel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AbelBarrientos on 5/23/2017.
 */
public class SortInnerContentTest {

    /**
     *
     */
    @Test
    public void aSingleWordIsSorted() {
        SortInnerContent sortInnerContent = new SortInnerContent();

        assertEquals("srot", sortInnerContent.sort("sort"));
    }

    /**
     *
     */
    @Test
    public void aLongSingleWordIsSorted() {
        SortInnerContent sortInnerContent = new SortInnerContent();

        assertEquals("ctonnet", sortInnerContent.sort("content"));
    }
    /**
     *
     */
    @Test
    public void aLongerSingleWordIsSorted() {
        SortInnerContent sortInnerContent = new SortInnerContent();

        assertEquals("atonmiian", sortInnerContent.sort("animation"));
    }

    /**
     *
     */
    @Test
    public void sortInnerContentOfASingleFourLetterWord() {
        SortInnerContent sortInnerContent = new SortInnerContent();

        assertEquals("psas", sortInnerContent.sortInnerContent("pass"));
    }

    /**
     *
     */
    @Test
    public void sortInnerContentOfTwoWordSentence() {
        SortInnerContent sortInnerContent = new SortInnerContent();

        assertEquals("hlleo trhee", sortInnerContent.sortInnerContent("hello there"));
    }

    /**
     *
     */
    @Test
    public void sortInnerContentOfFirstExample() {
        SortInnerContent sortInnerContent = new SortInnerContent();

        assertEquals("srot the inner ctonnet in dsnnieedcg oredr",
                sortInnerContent.sortInnerContent("sort the inner content in descending order"));
    }

    /**
     *
     */
    @Test
    public void sortInnerContentOfSecondExample() {
        SortInnerContent sortInnerContent = new SortInnerContent();

        assertEquals("wiat for me", sortInnerContent.sortInnerContent("wait for me"));
    }

    /**
     *
     */
    @Test
    public void sortInnerContentOfThirdExample() {
        SortInnerContent sortInnerContent = new SortInnerContent();

        assertEquals("tihs ktaa is esay", sortInnerContent.sortInnerContent("this kata is easy"));
    }
}
