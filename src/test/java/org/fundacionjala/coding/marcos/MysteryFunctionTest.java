package org.fundacionjala.coding.marcos;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Marcos.
 */
public class MysteryFunctionTest {

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
        Constructor<MysteryFunction> constructor = MysteryFunction.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    /**
     * Mystery function basic tests.
     */
    @Test
    public void mystery() {
        assertEquals("mystery(6) ", 5, MysteryFunction.mystery(6));
        assertEquals("mystery(9) ", 13, MysteryFunction.mystery(9));
        assertEquals("mystery(19) ", 26, MysteryFunction.mystery(19));
    }

    /**
     * Inverse Mystery function basic tests.
     */
    @Test
    public void mysteryInv() {
        assertEquals("mysteryInv(5)", 6, MysteryFunction.mysteryInv(5));
        assertEquals("mysteryInv(13)", 9, MysteryFunction.mysteryInv(13));
        assertEquals("mysteryInv(26)", 19, MysteryFunction.mysteryInv(26));
    }
}
