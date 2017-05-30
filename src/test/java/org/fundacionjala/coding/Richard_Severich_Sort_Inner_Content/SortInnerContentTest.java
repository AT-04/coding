package org.fundacionjala.coding.Richard_Severich_Sort_Inner_Content;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by RichardSeverich on 5/23/2017.
 */
public class SortInnerContentTest {

    private SortInnerContent sortInner;

    /**
     * This is the method that will run before each unit test.
     */
    @Before
    public void setUp() {
        sortInner = new SortInnerContent();
    }

    /**
     * This test checks the string that returns the method getSortInner returns the expected string.
     */
    @Test
    public void verifyChangeOfWaitForMe() {
        String firstCad = "wait for me";
        String expectedResult = "wiat for me";
        assertEquals(expectedResult, sortInner.sortInner(firstCad));
    }

    /**
     * This test checks the string that returns the method getSortInner returns the expected string.
     */
    @Test
    public void verifyChangeOfThisKataIsEasy() {
        String firstCad = "this kata is easy";
        String expectedResult = "tihs ktaa is esay";
        assertEquals(expectedResult, sortInner.sortInner(firstCad));
    }

    /**
     * This test checks the string that returns the method getSortInner returns the expected string.
     */
    @Test
    public void verifyChangeOfSortTheInnerContentInDescendingOrder() {
        String firstCad = "sort the inner content in descending order";
        String expectedResult = "srot the inner ctonnet in dsnnieedcg oredr";
        assertEquals(expectedResult, sortInner.sortInner(firstCad));
    }

    /**
     * This test checks the string that returns the method getSortInner returns the expected string.
     */
    @Test
    public void verityChangeOfSortTheInnerContentInDescendingOrderIam() {
        String firstCad = "I am";
        String expectedResult = "I am";
        assertEquals(expectedResult, sortInner.sortInner(firstCad));
    }

}
