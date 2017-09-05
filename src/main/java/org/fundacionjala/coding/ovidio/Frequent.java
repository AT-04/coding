package org.fundacionjala.coding.ovidio;

/**
 * Created by Administrator on 9/5/2017.
 */
public class Frequent {
    /**
     * Find most frequent item count.
     *
     * @param ints array.
     * @return int most frequent.
     */
    public int mostFrequentItemCount(int[] ints) {
        int mostFrequent = 0;
        for (int anInt : ints) {
            int count = 0;
            for (int value : ints) {
                if (value == anInt) {
                    count++;
                }
            }
            if (count > mostFrequent) {
                mostFrequent = count;
            }
        }
        return mostFrequent;
    }

}
