package test.java.org.fundacionjala.coding.cynthia;

import static org.junit.Assert.assertEquals;

import main.java.org.fundacionjala.coding.cynthia.MiddleCharacter;
import org.junit.Test;

/**
 * Tests.
 */
public class MiddleCharacterTest {

    @Test
    public void evenTests() {
        MiddleCharacter middle = new MiddleCharacter();

        assertEquals("es", middle.getMiddle("test"));
        assertEquals("dd", middle.getMiddle("middle"));
    }

    @Test
    public void oddTests() {
        MiddleCharacter middle = new MiddleCharacter();
        assertEquals("t", middle.getMiddle("testing"));
        assertEquals("A", middle.getMiddle("A"));
    }

    @Test
    public void BasicTests() {
        MiddleCharacter middle = new MiddleCharacter();
        assertEquals("Hi", middle.getMiddle("Hi"));
        assertEquals("u", middle.getMiddle("Sun"));
    }

    @Test
    public void Tests() {
        MiddleCharacter middle = new MiddleCharacter();
        assertEquals("b", middle.getMiddle("Numbers"));
        assertEquals("r", middle.getMiddle("Performance"));
        assertEquals("C", middle.getMiddle("Hello Cynthia"));
    }

}

