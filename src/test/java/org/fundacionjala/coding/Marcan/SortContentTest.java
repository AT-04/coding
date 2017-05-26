package org.fundacionjala.coding.Marcan;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by MarcandeaCabrera on 5/23/2017.
 */
public class SortContentTest {
    /**
     * This test is for verify to characters inverse inside of the word.
     */
    @Test
    public void verifyOneWord() {
        SortContent sortContent = new SortContent();
        assertEquals("Conidg", sortContent.sortContent("Coding"));
    }

    /**
     * This test is for verify to characters inverse inside of the word in a sentence.
     */
    @Test
    public void verifyASentence() {
        SortContent sortContent = new SortContent();
        assertEquals("The Conidg Ptriccae", sortContent.sortContent("The Coding Practice"));
    }
}
