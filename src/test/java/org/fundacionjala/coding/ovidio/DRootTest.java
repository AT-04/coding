package org.fundacionjala.coding.ovidio;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Simon on 06/09/2017.
 */
public class DRootTest {
    private DRoot dRoot;

    /**
     * Execute before each test method.
     */
    @Before
    public void setUp() {
        dRoot = new DRoot();
    }

    /**
     * Tests.
     */
    @Test
    public void testForDroot() {
        assertEquals(dRoot.digitalRoot(16), 7);
        assertEquals(dRoot.digitalRoot(942), 6);
        assertEquals(dRoot.digitalRoot(132189), 6);
        assertEquals(dRoot.digitalRoot(493193), 2);
    }
}
