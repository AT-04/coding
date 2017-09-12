package org.fundacionjala.coding.abel;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * This class test Middle Permutation Class.
 */
public class MiddlePermutationTest {

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
        Constructor<MiddlePermutation> constructor = MiddlePermutation.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    /**
     * Provided and new tests.
     */
    @Test
    public void basicTests() {
        assertEquals("bac", MiddlePermutation.findMidPerm("abc"));
        assertEquals("bdca", MiddlePermutation.findMidPerm("abcd"));
        assertEquals("cbeda", MiddlePermutation.findMidPerm("abcde"));
        assertEquals("cfedba", MiddlePermutation.findMidPerm("abcdef"));
        assertEquals("dcgfeba", MiddlePermutation.findMidPerm("abcdefg"));
        assertEquals("dhgfecba", MiddlePermutation.findMidPerm("abcdefgh"));
        assertEquals("edihgfcba", MiddlePermutation.findMidPerm("abcdefghi"));
        assertEquals("ejihgfdcba", MiddlePermutation.findMidPerm("abcdefghij"));
        assertEquals("fekjihgdcba", MiddlePermutation.findMidPerm("abcdefghijk"));

    }
}
