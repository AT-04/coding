package org.fundacionjala.coding;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Test for {@link Library}.
 */
public class LibraryTest {

    /**
     * Verify some library method.
     */
    @Test
    public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
}
