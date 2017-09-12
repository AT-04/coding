package org.fundacionjala.coding.abel;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Test class for Dir Reduction.
 */
public class DirReductionTest {

    /**
     * Test for Private Constructors.
     *
     * @throws NoSuchMethodException     Thrown when a particular method cannot be found.
     * @throws IllegalAccessException    Thrown when an application tries to reflectively create an instance.
     * @throws InvocationTargetException thrown by an invoked method or constructor.
     * @throws InstantiationException    Thrown when an application tries to create an instance of a class
     *                                   using the {@code newInstance} method in class.
     */
    @Test
    public void privateConstructorTest() throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException {
        Constructor<DirReduction> constructor = DirReduction.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    /**
     * Tests provided.
     *
     * @throws Exception for any exception.
     */
    @Test
    public void testSimpleDirReduc() throws Exception {
        assertEquals("\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\"",
                new String[]{"WEST"},
                DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));

        assertEquals("\"NORTH\", \"WEST\", \"SOUTH\", \"EAST\"",
                new String[]{"NORTH", "WEST", "SOUTH", "EAST"},
                DirReduction.dirReduc(new String[]{"NORTH", "WEST", "SOUTH", "EAST"}));
    }
}
