package org.fundacionjala.coding.abel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AbelBarrientos on 5/23/2017.
 */
public class SortInnerContentTest {

    private SortInnerContent sortInnerContent;

    /**
     *
     */
    @Before
    public void initObjects() {
        sortInnerContent = new SortInnerContent();
    }

    /**
     *
     */
    @Test
    public void aSingleWordIsSorted() {
        assertEquals("srot", sortInnerContent.sort("sort"));
    }

    /**
     *
     */
    @Test
    public void aLongSingleWordIsSorted() {
        assertEquals("ctonnet", sortInnerContent.sort("content"));
    }
    /**
     *
     */
    @Test
    public void aLongerSingleWordIsSorted() {
        assertEquals("atonmiian", sortInnerContent.sort("animation"));
    }

    /**
     *
     */
    @Test
    public void sortInnerContentOfASingleFourLetterWord() {
        assertEquals("psas", sortInnerContent.sortInnerContent("pass"));
    }

    /**
     *
     */
    @Test
    public void sortInnerContentOfTwoWordSentence() {
        assertEquals("hlleo trhee", sortInnerContent.sortInnerContent("hello there"));
    }

    /**
     *
     */
    @Test
    public void sortInnerContentOfFirstExample() {
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr",
                sortInnerContent.sortInnerContent("sort the inner content in descending order"));
    }

    /**
     *
     */
    @Test
    public void sortInnerContentOfSecondExample() {
        assertEquals("wiat for me", sortInnerContent.sortInnerContent("wait for me"));
    }

    /**
     *
     */
    @Test
    public void sortInnerContentOfThirdExample() {
        assertEquals("tihs ktaa is esay", sortInnerContent.sortInnerContent("this kata is easy"));
    }
}
