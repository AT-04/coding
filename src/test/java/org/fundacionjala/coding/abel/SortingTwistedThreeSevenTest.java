package org.fundacionjala.coding.abel;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by abelb on 8/22/2017.
 */
public class SortingTwistedThreeSevenTest {


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
        Constructor<SortingTwistedThreeSeven> constructor = SortingTwistedThreeSeven.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    /**
     * Testing Package Private method.
     */
    @Test
    public void testChangePositionStaticMethod() {
        final Integer firstResult = 37;
        final Integer secondResult = 73;
        assertEquals(firstResult, SortingTwistedThreeSeven.changePositions(73));
        assertEquals(secondResult, SortingTwistedThreeSeven.changePositions(37));
    }

    /**
     * Basic Tests from Kata.
     */
    @Test
    public void basicTests() {
        assertEquals(Arrays.toString(new Integer[]{1, 2, 7, 4, 5, 6, 3, 8, 9}),
                Arrays.toString(SortingTwistedThreeSeven.sortTwisted37(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9})));
        assertEquals(Arrays.toString(new Integer[]{12, 14, 13}),
                Arrays.toString(SortingTwistedThreeSeven.sortTwisted37(new Integer[]{12, 13, 14})));
        assertEquals(Arrays.toString(new Integer[]{2, 7, 4, 3, 9}),
                Arrays.toString(SortingTwistedThreeSeven.sortTwisted37(new Integer[]{9, 2, 4, 7, 3})));
    }
}
