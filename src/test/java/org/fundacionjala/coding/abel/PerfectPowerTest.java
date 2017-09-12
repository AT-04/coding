package org.fundacionjala.coding.abel;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Random;

import org.junit.Test;

import static java.lang.Math.log;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by abelb on 8/23/2017.
 */
public class PerfectPowerTest {

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
        Constructor<PerfectPower> constructor = PerfectPower.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    /**
     * First Test.
     */
    @Test
    public void test0() {
        assertNull("0 is not a perfect number", PerfectPower.isPerfectPower(0));
    }

    /**
     * Second Test.
     */
    @Test
    public void test1() {
        assertNull("1 is not a perfect number", PerfectPower.isPerfectPower(1));
    }

    /**
     * Third Test.
     */
    @Test
    public void test2() {
        assertNull("2 is not a perfect number", PerfectPower.isPerfectPower(2));
    }

    /**
     * Fourth Test.
     */
    @Test
    public void test3() {
        assertNull("3 is not a perfect number", PerfectPower.isPerfectPower(3));
    }

    /**
     * Fifth Test.
     */
    @Test
    public void test4() {
        assertArrayEquals("4 = 2^2", new int[]{2, 2}, PerfectPower.isPerfectPower(4));
    }

    /**
     * Sixth Test.
     */
    @Test
    public void test5() {
        assertNull("5 is not a perfect power", PerfectPower.isPerfectPower(5));
    }

    /**
     * Seventh Test.
     */
    @Test
    public void test8() {
        assertArrayEquals("8 = 2^3", new int[]{2, 3}, PerfectPower.isPerfectPower(8));
    }

    /**
     * Eight Test.
     */
    @Test
    public void test9() {
        assertArrayEquals("9 = 3^2", new int[]{3, 2}, PerfectPower.isPerfectPower(9));
    }

    /**
     * Ninth Test.
     */
    @Test
    public void testUpTo500() {
        int[] pp = {4, 8, 9, 16, 25, 27, 32, 36, 49, 64, 81, 100, 121, 125, 128, 144, 169, 196, 216, 225,
                243, 256, 289, 324, 343, 361, 400, 441, 484};
        for (int i : pp) {
            assertNotNull(i + " is a perfect power", PerfectPower.isPerfectPower(i));
        }
    }

    /**
     * Tenth Test.
     */
    @Test
    public void testRandomPerfectPowers() {
        Random rnd = new Random();
        for (int i = 0; i < 100; i++) {
            int m = rnd.nextInt(254) + 2;
            int k = (int) (rnd.nextDouble() * (log(Integer.MAX_VALUE) / log(m) - 2.0) + 2.0);
            int l = ipow(m, k);
            int[] r = PerfectPower.isPerfectPower(l);
            assertNotNull(l + " is a perfect power", r);
            assertEquals(r[0] + "^" + r[1] + "!=" + l, l, ipow(r[0], r[1]));
        }
    }

    /**
     * Helper Method for last test.
     *
     * @param b int.
     * @param e int.
     * @return int.
     */
    private static int ipow(int b, int e) {
        int p = 1;
        for (; e > 0; e >>= 1) {
            if ((e & 1) == 1) {
                p *= b;
            }
            b *= b;
        }
        return p;
    }
}
