package org.fundacionjala.coding.yury;

/**
 * Created by Administrator on 8/30/2017.
 */
public class MysteryFunction {

    /**
     * This method calculate value mystery.
     *
     * @param n is position.
     * @return value mystery.
     */
    public long mystery(long n) {
        return n ^ (n >> 1);
    }

    /**
     * This method calculate value mystery.
     *
     * @param n value mystery.
     * @return position.
     */
    public long mysteryInv(long n) {
        long binary;
        for (binary = n >> 1; binary != 0; binary = binary >> 1) {
            n = n ^ binary;
        }
        return n;
    }

    /**
     * This method gray.
     *
     * @return gray code.
     */
    public String nameOfMystery() {
        return "Gray Code";
    }

}
