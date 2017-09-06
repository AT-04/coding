package org.fundacionjala.coding.richard;

import java.math.BigInteger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * The year is 1214. One night, Pope Innocent III awakens to find the the archangel Gabriel floating before
 * him. Gabriel thunders to the pope:
 * Gather all of the learned men in Pisa, especially Leonardo Fibonacci. In order for the crusades in the
 * holy lands to be successful, these men must calculate the millionth number in Fibonacci's recurrence. Fail
 * to do this, and your armies will never reclaim the holy land. It is His will.
 * The angel then vanishes in an explosion of white light.
 * Pope Innocent III sits in his bed in awe. How much is a million? he thinks to himself.
 * He never was very good at math.
 * He tries writing the number down, but because everyone in Europe is still using Roman numerals at this
 * moment in history, he cannot represent this number. If he only knew about the invention of zero, it might
 * make this sort of thing easier.
 * He decides to go back to bed. He consoles himself, The Lord would never challenge me thus; this must have
 * been some deceit by the devil. A pretty horrendous nightmare, to be sure.
 * Pope Innocent III's armies would go on to conquer Constantinople (now Istanbul), but they would never
 * reclaim the holy land as he desired.
 * <p>
 * In this kata you will have to calculate fib(n) where:
 * <p>
 * fib(0) := 0
 * fib(1) := 1
 * fin(n + 2) := fib(n + 1) + fib(n)
 * Write an algorithm that can handle n where 1000000 ≤ n ≤ 1500000.
 * <p>
 * Your algorithm must output the exact integer answer, to full precision. Also, it must correctly handle negative
 * numbers as input.
 * <p>
 * HINT I: Can you rearrange the equation fib(n + 2) = fib(n + 1) + fib(n) to find fib(n) if you already know
 * fin(n + 1) and fib(n + 2)? Use this to reason what value fib has to have for negative values.
 * <p>
 * HINT II: See http://mitpress.mit.edu/sicp/chapter1/node15.html
 */
public class FibonacciTest {

    /**
     *
     */
    @Test
    public void testFib0() {
        testFib(0, 0);
    }

    /**
     *
     */
    @Test
    public void testFib1() {
        testFib(1, 1);
    }

    /**
     *
     */
    @Test
    public void testFib2() {
        testFib(1, 2);
    }

    /**
     *
     */
    @Test
    public void testFib3() {
        testFib(2, 3);
    }

    /**
     *
     */
    @Test
    public void testFib4() {
        testFib(3, 4);
    }

    /**
     *
     */
    @Test
    public void testFib5() {
        testFib(5, 5);
    }

    /**
     * @param expected expected.
     * @param input    input.
     */
    private static void testFib(long expected, long input) {
        Fibonacci fibonacci = new Fibonacci();
        BigInteger found;
        try {
            found = fibonacci.fib(BigInteger.valueOf(input));
        } catch (Throwable e) {
            throw new AssertionError("exception during test: " + e, e);
        }
        assertEquals(BigInteger.valueOf(expected), found);
    }

}
