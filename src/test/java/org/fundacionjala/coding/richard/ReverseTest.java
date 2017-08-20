package org.fundacionjala.coding.richard;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Richard on 8/20/2017.
 * <p>
 * Do you know how to write a recursive function? Let's test it!
 * Definition: Recursive function is a function that calls itself during its execution
 * Your objective is to complete a recursive function reverse() that receives str as
 * String and returns the same string in reverse order
 */
public class ReverseTest {

    private Reverse reverse;

    /**
     *
     */
    @Before
    public void setUp() {
        reverse = new Reverse();
    }

    /**
     *
     */
    @Test
    public void testSomethingOne() {
        String expectedResult = "dlrow olleh";
        assertEquals(expectedResult, reverse.reverse("hello world"));
    }

    /**
     *
     */
    @Test
    public void testSomethingTwo() {
        String expectedResult = "abcd";
        assertEquals(expectedResult, reverse.reverse("dcba"));
    }

    /**
     *
     */
    @Test
    public void testSomethingThree() {
        String expectedResult = "12345";
        assertEquals(expectedResult, reverse.reverse("54321"));
    }

    /**
     *
     */
    @Test
    public void testSomethingFour() {
        String expectedResult = "a";
        assertEquals(expectedResult, reverse.reverse("a"));
    }
}
