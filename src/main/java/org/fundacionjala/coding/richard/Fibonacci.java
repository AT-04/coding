package org.fundacionjala.coding.richard;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

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
public class Fibonacci {

    private Map<BigInteger, BigInteger> computedValues = new HashMap<>();
    private static final int TWO = 2;

    /**
     * This method is a constructor.
     */
    public Fibonacci() {
        computedValues.put(BigInteger.ZERO, BigInteger.ONE);
        computedValues.put(BigInteger.ONE, BigInteger.ONE);
    }

    /**
     * @param n this variable contains a Big Integer number.
     * @return the Bing integer.
     */
    public BigInteger fib(BigInteger n) {
        BigInteger negativeChanger = BigInteger.ONE;
        if (n.equals(BigInteger.ZERO)) {
            return BigInteger.ZERO;
        }

        if (n.signum() == -1) {
            n = n.abs();
            if ((n.mod(BigInteger.valueOf(2))).equals(BigInteger.ZERO)) {
                negativeChanger = BigInteger.valueOf(-1);
            }
        }
        return negativeChanger.multiply(fibonacci(n.subtract(BigInteger.ONE)));
    }

    /**
     * @param n this variable contains a Big Integer number.
     * @return the Bing integer.
     */
    private BigInteger fibonacci(BigInteger n) {
        if (computedValues.containsKey(n)) {
            return computedValues.get(n);
        }
        BigInteger k = n.divide(BigInteger.valueOf(TWO));
        if ((n.mod(BigInteger.valueOf(TWO))).equals(BigInteger.ZERO)) {
            computedValues.put(n, (fibonacci(k).multiply(fibonacci(k)))
                    .add(fibonacci(k.subtract(BigInteger.ONE)).multiply(fibonacci(k.subtract(BigInteger.ONE)))));
            return computedValues.get(n);
        } else {
            computedValues.put(n, ((fibonacci(k).multiply(fibonacci(k.add(BigInteger.ONE))))
                    .add(fibonacci(k.subtract(BigInteger.ONE)).multiply(fibonacci(k)))));
            return computedValues.get(n);
        }
    }
}
