package org.fundacionjala.coding.ovidio;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Simon on 27/08/2017.
 */
public class ShortestWordTest {
    private ShortestWord shortestWord;

    /**
     *
     */
    @Before
    public void setUp() {
        shortestWord = new ShortestWord();
    }

    /**
     *
     */
    @Test
    public void findShort() {
        assertEquals(3, shortestWord.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, shortestWord.findShort("turns out random test cases are easier than writing out basic ones"));
    }
}
