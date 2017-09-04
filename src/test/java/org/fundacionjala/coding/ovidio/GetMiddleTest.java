package org.fundacionjala.coding.ovidio;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Simon on 03/09/2017.
 */
public class GetMiddleTest {
    private GetMiddle getMiddle;

    /**
     * Execute before each test method.
     */
    @Before
    public void setUp() {
        getMiddle = new GetMiddle();
    }

    /**
     * Even Tests.
     */
    @Test
    public void evenTests() {
        assertEquals("es", getMiddle.getMiddle("test"));
        assertEquals("dd", getMiddle.getMiddle("middle"));
    }
    /**
     * Odd Tests.
     */
    @Test
    public void oddTests() {
         assertEquals("t", getMiddle.getMiddle("testing"));
         assertEquals("A", getMiddle.getMiddle("A"));
    }
}
