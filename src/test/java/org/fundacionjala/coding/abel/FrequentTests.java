package org.fundacionjala.coding.abel;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Test class for frequent.
 */
public class FrequentTests {

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
        Constructor<Frequent> constructor = Frequent.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    /**
     * First Test.
     */
    @Test
    public void basicTests() {
        String msg = "Should work with example test cases";
        assertEquals(msg, 2, Frequent.mostFrequentItemCount(new int[]{3, -1, -1}));
        assertEquals(msg, 5, Frequent.mostFrequentItemCount(new int[]{3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3}));
    }

    /**
     * Second Test.
     */
    @Test
    public void edgeTests() {
        assertEquals("Should work for empty arrays", 0, Frequent.mostFrequentItemCount(new int[0]));
        assertEquals("Should work for 1-element arrays", 1, Frequent.mostFrequentItemCount(new int[]{9}));
        assertEquals("Should work with multiple most frequent items, e.g. nine 7's and nine 1's", 3, Frequent.mostFrequentItemCount(new int[]{7, 1, 7, 1, 7, 1}));
    }

    /**
     * Third Test.
     */
    @Test
    public void randomTests() {
        Random randGen = new Random();
        System.out.println("Testing 40 random arrays...");
        for (int i = 0; i < 40; i++) {
            int[] testArr = new int[randGen.nextInt(30)];
            for (int e = 0; e < testArr.length; e++) {
                testArr[e] = randGen.nextInt(30) - 15;
            }
            assertEquals("Should work with " + arrToString(testArr), mostFrequentAns(testArr), Frequent.mostFrequentItemCount(testArr));
        }
    }

    /**
     * Method To create an String.
     * @param arr Array of Integer.
     * @return String.
     */
    private String arrToString(int[] arr) {
        String retStr = "{ ";
        for (int i : arr) {
            retStr += i + ", ";
        }
        return (retStr.substring(0, retStr.length() - 2)) + " }";
    }

    /**
     * Method to generate numbers.
     * @param collection Array of Integers.
     * @return Int.
     */
    private int mostFrequentAns(int[] collection) {
        int max = 0;
        int currMax = 0;
        int currNum = 0;
        Arrays.sort(collection);
        for (int i = 0; i < collection.length; i++) {
            if (currNum != collection[i]) {
                if (currMax > max)
                    max = currMax;
                currMax = 1;
                currNum = collection[i];
            } else {
                currMax++;
            }
        }
        return (currMax > max ? currMax : max);
    }
}
