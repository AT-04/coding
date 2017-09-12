package org.fundacionjala.coding.abel;

import java.util.HashMap;
import java.util.Map;

/**
 * Frequent number Class.
 */
public final class Frequent {

    /**
     * Private Constructor.
     */
    private Frequent() {

    }

    /**
     * Returns the Most Frequent Item in the Array.
     *
     * @param ints The Array given.
     * @return The Most Frequent Number in the Array.
     */
    public static int mostFrequentItemCount(int[] ints) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int anInt : ints) {
            if (map.containsKey(anInt)) {
                int counter = map.get(anInt);
                map.put(anInt, counter + 1);
            } else {
                map.put(anInt, 1);
            }
        }
        int mostFrequent = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > mostFrequent) {
                mostFrequent = entry.getValue();
            }
        }

        return mostFrequent;
    }
}
