package org.fundacionjala.coding;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by MarcandeaCabrera on 5/19/2017.
 */
public class SpinWordTest {
    private SpinWord string;

    /**
     * This is a method Before.
     */
    @Before
    public void methodBefore() {
        string = new SpinWord();
    }

    /**
     * Verify words less than or equal to five characters.
     */
    @Test
    public void wordLessOrEqualsThanFiveCharacters() {
        assertEquals("Hola odnum", string.reverseWord("Hola mundo"));
    }

    /**
     * Verify words smaller or longer or equals than five characters.
     */
    @Test
    public void wordLessEqualsOrLongerThanFiveCharacters() {
        assertEquals("Hola odnum aednacram mundos", string.reverseWord("Hola mundo marcandea sodnum"));
    }


}
