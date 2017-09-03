package org.fundacionjala.coding.marcos;

/**
 * Created by Marcos.
 */
public final class MysteryFunction {

    public static final int BIT_SHIFT = 1;

    /**
     * Private constructor for the Mystery function utility class.
     */
    private MysteryFunction() {

    }

    /**
     * This method perform the calculation of the mystery function based in the
     * standard Gray Code logic expression, using XOR and unsigned bit shift operators.
     *
     * @param n is the entry in the mystery sequence.
     * @return the mystery corresponding value.
     */
    public static long mystery(long n) {
        return n ^ n >>> BIT_SHIFT;
    }

    /**
     * This method perform the inverse operation of the mystery function, using XOR and
     * unsigned bit shift operators. It is based in the standard Gray Code Inverse algorithm.
     *
     * @param n the mystery value.
     * @return the corresponding entry.
     */
    public static long mysteryInv(long n) {
        long mysteryEntry = 0;
        while (n != 0) {
            mysteryEntry ^= n;
            n >>>= BIT_SHIFT;
        }
        return mysteryEntry;
    }
}
