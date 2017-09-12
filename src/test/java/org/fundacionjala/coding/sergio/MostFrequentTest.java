package org.fundacionjala.coding.sergio;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 *
 */
public class MostFrequentTest {

    /**
     * This test assert the modifier of the Sequence private constructor class.
     *
     * @throws NoSuchMethodException     throw when no private constructor is defined.
     * @throws IllegalAccessException    throw when can not access to the constructor.
     * @throws InvocationTargetException throw when can not be perform a invocation.
     * @throws InstantiationException    throw when a instantiation can not be performed.
     */
    @Test
    public void privateConstructorTest() throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException {
        Constructor<MostFrequent> constructor = MostFrequent.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    /**
     *
     */
    @Test
    public void tests() {
        assertEquals(2, MostFrequent.mostFrequentItemCount(new int[]{3, -1, -1}));
        assertEquals(5, MostFrequent.mostFrequentItemCount(new int[]{3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3}));
    }
}
