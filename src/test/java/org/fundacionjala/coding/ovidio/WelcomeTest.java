package org.fundacionjala.coding.ovidio;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Simon on 22/08/2017.
 */
public class WelcomeTest {
    public static final String MESSAGE = "Your function should have returned 'Welcome'. Try again.";
    private Welcome welcome;

    /**
     * Execute before each test method.
     */
    @Before
    public void setUp() {
        welcome = new Welcome();
    }

    /**
     * Example Test.
     */
    @Test
    public void exampleTest() {

        assertEquals(MESSAGE, "Welcome", welcome.greet("english"));
        assertEquals(MESSAGE, "Welkom", welcome.greet("dutch"));
        assertEquals(MESSAGE, "Welcome", welcome.greet("IP_ADDRESS_INVALID"));
    }
}
