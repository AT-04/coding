package org.fundacionjala.coding.jose;

/**
 * Created by JoseTorrez on 9/5/2017.
 */
public class FrequentItem {

    /**
     * This method is for find the most frequent number in a collection.
     * @param collection of numbers received.
     * @return the item most repeated in the collection.
     */
    public int mostFrequentItemCount(int[] collection) {
        int most = 0;
        for (int i = 0; i < collection.length; i++) {
            int count = 0;
            for (int x : collection) {
                if (x == collection[i]) {
                    count++;
                }
            }
            if (count > most) {
                most = count;
            }
        }
        return most;
    }

}
