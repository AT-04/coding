package org.fundacionjala.coding.marcos;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.text.DecimalFormat;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Marcos.
 */
public class MagnetsTest {

    /**
     * Custom assertion method for the kata.
     *
     * @param act actual result.
     * @param exp expected result.
     */
    private static void assertFuzzyEquals(double act, double exp) {
        boolean inRange = Math.abs(act - exp) <= 1e-6;
        if (!inRange) {
            DecimalFormat df = new DecimalFormat("#0.000000");
            System.out.println("At 1e-6: Expected must be " + df.format(exp) + ", but got " + df.format(act));
        }
        assertEquals(true, inRange);
    }

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
        Constructor<Magnets> constructor = Magnets.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    /**
     * Basic test for Magnet particles in boxes kata.
     */
    @Test
    public void test1() {
        System.out.println("Fixed Tests: doubles");
        assertFuzzyEquals(Magnets.doubles(1, 10), 0.5580321939764581);
        assertFuzzyEquals(Magnets.doubles(10, 1000), 0.6921486500921933);
        assertFuzzyEquals(Magnets.doubles(10, 10000), 0.6930471674194457);
        assertFuzzyEquals(Magnets.doubles(20, 10000), 0.6930471955575918);
        assertFuzzyEquals(Magnets.doubles(30, 10000), 0.6930471955576123);
    }
}
