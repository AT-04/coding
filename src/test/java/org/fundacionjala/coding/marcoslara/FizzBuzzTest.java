package org.fundacionjala.coding.marcoslara;

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
        assertEquals(FizzBuzz.printNumber(1), "1");
    }

    /**
     * Basic test for the number three.
     */
    @Test
    public void fizzBuzzOfThree() {
        assertEquals(FizzBuzz.printNumber(3), "Fizz");
    }

    /**
     * Basic tets for the number five.
     */
    @Test
    public void fizzBuzzOfFive() {
        assertEquals(FizzBuzz.printNumber(5), "Buzz");
    }

    /**
     * Basic test for the number fifteen.
     */
    @Test
    public void fizzBuzzOfFifteen() {
        assertEquals(FizzBuzz.printNumber(15), "FizzBuzz");
    }

    /**
     * FOR THE STAGE TWO
     * Basic test for the number fifty three.
     */
    @Test
    public void fizzBuzzOfFiftyThree() {
        assertEquals(FizzBuzz.printNumber(53), "FizzBuzz");
    }
}
