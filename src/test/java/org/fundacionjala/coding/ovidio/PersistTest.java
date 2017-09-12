package org.fundacionjala.coding.ovidio;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Simon on 03/09/2017.
 */
public class PersistTest {
    private Persist persist;

    /**
     * Execute before each test method.
     */
    @Before
    public void setUp() {
        persist = new Persist();
    }
    /**
     * Basic Tests.
     */
    @Test
    public void basicTests() {
        System.out.println("****** Basic Tests ******");
        assertEquals(3, persist.persistence(39));
        assertEquals(0, persist.persistence(4));
        assertEquals(2, persist.persistence(25));
        assertEquals(4, persist.persistence(999));
    }
}
