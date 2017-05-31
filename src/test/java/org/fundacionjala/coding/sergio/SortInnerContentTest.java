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
    public void wordIsMinorThan3() {
        String sentence = "hi all folks";

        assertEquals("hi all floks", SortInnerContent.sortReverse(sentence));
    }

}