package org.fundacionjala.coding.abel;

import java.util.Arrays;

/**
 * #Sorting on planet Twisted-3-7
 * There is a planet... in a galaxy far far away. It is exactly like our planet, but it has one difference:
 * #The values of the digits 3 and 7 are twisted. Our 3 means 7 on the planet Twisted-3-7. And 7 means 3.
 * Your task is to create a method, that can sort an array the way it would be sorted on Twisted-3-7.
 * 7 Examples from a friend from Twisted-3-7:
 * [1,2,3,4,5,6,7,8,9] -> [1,2,7,4,5,6,3,8,9]
 * [12,13,14] -> [12,14,13]
 * [9,2,4,7,3] -> [2,7,4,3,9]
 */
public final class SortingTwistedThreeSeven {

    /**
     * Private Constructor.
     */
    private SortingTwistedThreeSeven() {
    }

    /**
     * Change the position of 3 and 7.
     * @param i Integer.
     * @return Integer.
     */
    static Integer changePositions(Integer i) {
        return Integer.valueOf(i.toString()
                .replace("7", "*")
                .replace("3", "7")
                .replace("*", "3")
        );
    }

    /**
     * Sort and the array.
     * @param array Integer[].
     * @return Integer[].
     */
    public static Integer[] sortTwisted37(Integer[] array) {
        return Arrays.stream(array)
                .map(SortingTwistedThreeSeven::changePositions)
                .sorted(Integer::compare)
                .map(SortingTwistedThreeSeven::changePositions)
                .toArray(Integer[]::new);
    }

}
