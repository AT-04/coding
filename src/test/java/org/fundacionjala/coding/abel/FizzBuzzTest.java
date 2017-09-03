package org.fundacionjala.coding.abel;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by AbelBarrientos on 8/25/2017.
 */
public class FizzBuzzTest {
    private static final String ONE = "1";
    private static final String THREE = "Fizz";
    private static final String FIVE = "Buzz";
    private static final String FIFTEEN = "FizzBuzz";
    private static final String THIRTEEN = "Fizz";
    private static final String FIFTYTWO = "Buzz";

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
        Constructor<FizzBuzz> constructor = FizzBuzz.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    /**
     * Test to print values until a specific number.
     */
    @Test
    public void printFizzBuzz() {
        FizzBuzz.printNumbers(100);
    }

    /**
     * Test the value of One.
     */
    @Test
    public void fizzBuzzOfOneIs() {
        assertTrue(ONE.equals(FizzBuzz.fizzBuzzOf(1)));
    }

    /**
     * Test the value of Three.
     */
    @Test
    public void fizzBuzzOfThreeIs() {
        assertTrue(THREE.equals(FizzBuzz.fizzBuzzOf(3)));
    }

    /**
     * Test the value of Five.
     */
    @Test
    public void fizzBuzzOfFiveIs() {
        assertTrue(FIVE.equals(FizzBuzz.fizzBuzzOf(5)));
    }

    /**
     * Test the value of Fifteen.
     */
    @Test
    public void fizzBuzzOfFifteenIs() {
        assertTrue(FIFTEEN.equals(FizzBuzz.fizzBuzzOf(15)));
    }

    /**
     * Second Stage test value of Thirteen.
     */
    @Test
    public void fizzBuzzOfThirteenIs() {
        assertTrue(THIRTEEN.equals(FizzBuzz.fizzBuzzOf(13)));
    }

    /**
     * Second Stage test value of 52.
     */
    @Test
    public void fizzBuzzOfFiftyTwoIs() {
        assertTrue(FIFTYTWO.equals(FizzBuzz.fizzBuzzOf(52)));
    }
}
