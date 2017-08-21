package org.fundacionjala.coding.abel;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * This class test the Sequence.
 */
public class SequenceTest {

    /**
     * Test for Private Constructors.
     * @throws NoSuchMethodException Thrown when a particular method cannot be found.
     * @throws IllegalAccessException Thrown when an application tries to reflectively create an instance.
     * @throws InvocationTargetException thrown by an invoked method or constructor.
     * @throws InstantiationException Thrown when an application tries to create an instance of a class
     * using the {@code newInstance} method in class.
     */
    @Test
    public void privateConstructorTest() throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException {
        Constructor<Sequence> constructor = Sequence.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    /**
     * All tests.
     */
    @Test
    public void basicTests() {
        assertEquals("getScore(1) returns a wrong result", 50, Sequence.getScore(1));
        assertEquals("getScore(2) returns a wrong result", 150, Sequence.getScore(2));
        assertEquals("getScore(3) returns a wrong result", 300, Sequence.getScore(3));
        assertEquals("getScore(4) returns a wrong result", 500, Sequence.getScore(4));
        assertEquals("getScore(5) returns a wrong result", 750, Sequence.getScore(5));
        assertEquals("getScore(6) returns a wrong result", 1050, Sequence.getScore(6));
        assertEquals("getScore(7) returns a wrong result", 1400, Sequence.getScore(7));
        assertEquals("getScore(8) returns a wrong result", 1800, Sequence.getScore(8));
        assertEquals("getScore(9) returns a wrong result", 2250, Sequence.getScore(9));
        assertEquals("getScore(10) returns a wrong result", 2750, Sequence.getScore(10));
        assertEquals("getScore(20) returns a wrong result", 10500, Sequence.getScore(20));
        assertEquals("getScore(30) returns a wrong result", 23250, Sequence.getScore(30));
        assertEquals("getScore(100) returns a wrong result", 252500, Sequence.getScore(100));
        assertEquals("getScore(123) returns a wrong result", 381300, Sequence.getScore(123));
        assertEquals("getScore(1000) returns a wrong result", 25025000, Sequence.getScore(1000));
        assertEquals("getScore(1234) returns a wrong result", 38099750, Sequence.getScore(1234));
        assertEquals("getScore(10000) returns a wrong result", 2500250000L, Sequence.getScore(10000));
        assertEquals("getScore(12345) returns a wrong result", 3810284250L, Sequence.getScore(12345));
    }
}
