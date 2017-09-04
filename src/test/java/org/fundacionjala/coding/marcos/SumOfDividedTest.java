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
public class SumOfDividedTest {

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
        Constructor<SumOfDivided> constructor = SumOfDivided.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    /**
     * Basic test using positive numbers.
     */
    @Test
    public void testOne() {
        int[] first = new int[]{12, 15};
        assertEquals("(2 12)(3 27)(5 15)", SumOfDivided.sumOfDivided(first));
    }

    /**
     * Basic test using positive and negative numbers.
     */
    @Test
    public void testTwo() {
        int[] second = new int[]{15, 30, -45};
        assertEquals("(2 30)(3 0)(5 0)", SumOfDivided.sumOfDivided(second));
    }

    /**
     * Basic test using large positive numbers.
     */
    @Test
    public void testThree() {
        int[] third = new int[]{46, 52, 100, 64};
        assertEquals("(2 262)(5 100)(13 52)(23 46)", SumOfDivided.sumOfDivided(third));
    }

    /**
     * Basic test using negative numbers.
     */
    @Test
    public void testFour() {
        int[] fourth = new int[]{-35, -24, -48, -11};
        assertEquals("(2 -72)(3 -72)(5 -35)(7 -35)(11 -11)", SumOfDivided.sumOfDivided(fourth));
    }
}
