package org.fundacionjala.coding.ovidio;


import static java.util.Arrays.stream;

/**
 * Created by Simon on 06/09/2017.
 * Consider an array of sheep where some sheep may be missing from their place.
 * We need a function that counts the number of sheep present in the array (true means present).
 * <p>
 * For example,
 * <p>
 * [true,  true,  true,  false,
 * true,  true,  true,  true ,
 * true,  false, true,  false,
 * true,  false, false, true ,
 * true,  true,  true,  true ,
 * false, false, true,  true]
 * The correct answer would be 17.
 */
public class CountingSheep {
    /**
     * Count Sheeps.
     *
     * @param arrayOfSheeps arraySheeps.
     * @return count.
     */
    public int countSheeps(Boolean[] arrayOfSheeps) {
        return (int) stream(arrayOfSheeps).filter(n -> n.equals(true)).count();
    }
}
