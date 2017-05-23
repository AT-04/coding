package org.fundacionjala.coding.Richard_Severich_Sort_Inner_Content;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by RichardSeverich on 5/23/2017.
 */
public class SortInnerContentTest {

    /**
     * This test checks the string that returns the method getSortInner returns the expected string.
     */
    @Test
    public void verifyChangeOfWaitForMe() {
        SortInnerContent sortInner = new SortInnerContent("wait for me");
        String expectedResult = "wiat for me";
        assertEquals(expectedResult, sortInner.getSortInner());
    }

    /**
     * This test checks the string that returns the method getSortInner returns the expected string.
     */
    @Test
    public void verifyChangeOfThisKataIsEasy() {
        SortInnerContent sortInner = new SortInnerContent("this kata is easy");
        String expectedResult = "tihs ktaa is esay";
        assertEquals(expectedResult, sortInner.getSortInner());
    }

    /**
     * This test checks the string that returns the method getSortInner returns the expected string.
     */
    @Test
    public void verifyChangeOfSortTheInnerContentInDescendingOrder() {
        SortInnerContent sortInner = new SortInnerContent("sort the inner content in descending order");
        String expectedResult = "srot the inner ctonnet in dsnnieedcg oredr";
        assertEquals(expectedResult, sortInner.getSortInner());
    }


}
