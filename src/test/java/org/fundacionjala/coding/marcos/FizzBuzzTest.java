package org.fundacionjala.coding.marcos;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Marcos on 8/25/2017.
 * Unit test for Fizz Buzz Class.
 */
public class FizzBuzzTest {

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
        Constructor<FizzBuzz> constructor = FizzBuzz.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }


    /**
     * Basic test for the number one.
     */
    @Test
    public void fizzBuzzOfOne() {
        assertEquals("1", FizzBuzz.printNumber(1));
    }

    /**
     * Basic test for the number three.
     */
    @Test
    public void fizzBuzzOfThree() {
        assertEquals(FizzBuzz.FIZZ, FizzBuzz.printNumber(3));
    }

    /**
     * Basic tets for the number five.
     */
    @Test
    public void fizzBuzzOfFive() {
        assertEquals(FizzBuzz.BUZZ, FizzBuzz.printNumber(5));
    }

    /**
     * Basic tets for the number eleven.
     */
    @Test
    public void fizzBuzzOfEleven() {
        assertEquals("11", FizzBuzz.printNumber(11));
    }

    /**
     * Basic test for the number fifteen.
     */
    @Test
    public void fizzBuzzOfFifteen() {
        assertEquals(FizzBuzz.FIZZ_BUZZ, FizzBuzz.printNumber(15));
    }

    /**
     * For the stage two.
     * Basic test for the number fifty three.
     */
    @Test
    public void fizzBuzzO355fFiftyThree() {
        assertEquals(FizzBuzz.FIZZ_BUZZ, FizzBuzz.printNumber(53));
    }

    /**
     * For the stage two.
     * Basic test for the number Three thousand five hundred fifty three.
     */
    @Test
    public void fizzBuzzOfThreeThousandFiveHundredFiftyThree() {
        assertEquals(FizzBuzz.FIZZ_BUZZ, FizzBuzz.printNumber(3553));
    }

    /**
     * For the stage two.
     * Basic test for the number Three million thirty thousand five hundred three.
     */
    @Test
    public void fizzBuzzOfThreeMillionThirtyThousandFiveHundredThree() {
        assertEquals(FizzBuzz.FIZZ_BUZZ, FizzBuzz.printNumber(3030503));
    }
}
