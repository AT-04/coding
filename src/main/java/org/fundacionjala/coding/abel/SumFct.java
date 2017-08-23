package org.fundacionjala.coding.abel;

import java.math.BigInteger;

/**
 * The drawing shows 6 squares the sides of which have a length of 1, 1, 2, 3, 5, 8. It's easy to see that
 * the sum of the perimeters of these squares is : 4 * (1 + 1 + 2 + 3 + 5 + 8) = 4 * 20 = 80
 * Could you give the sum of the perimeters of all the squares in a rectangle when there are n + 1 squares
 * disposed in the same manner as in the drawing:
 * #Hint: See Fibonacci sequence
 * #Ref: http://oeis.org/A000045
 * The function perimeter has for parameter n where n + 1 is the number of squares (they are numbered from 0 to n)
 * and returns the total perimeter of all the squares.
 */
public final class SumFct {

    /**
     * Private Constructor.
     */
    private SumFct() {

    }

    /**
     * Calculates the permiter of a rectangle compose by squares.
     *
     * @param n Number of rectanbles.
     * @return Big Integer.
     */
    public static BigInteger perimeter(BigInteger n) {
        BigInteger a;
        BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ONE;
        BigInteger total = BigInteger.ZERO;

        for (int i = 0; i <= n.intValue(); i++) {
            a = b;
            b = c;
            c = a.add(b);
            total = total.add(a);
        }

        return total.multiply(BigInteger.valueOf(4));
    }
}
