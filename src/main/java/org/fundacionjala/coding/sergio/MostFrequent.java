package org.fundacionjala.coding.sergio;

/**
 *
 */
public final class MostFrequent {

    /***
     *
     */
    private MostFrequent() {

    }

    /**
     * @param collection of numbers.
     * @return number.
     */
    static int mostFrequentItemCount(int[] collection) {
        int count = 1, tempCount = 0;
        int temp = 0;
        for (int i = 0; i < (collection.length - 1); i++) {
            temp = collection[i];
            tempCount = 0;
            for (int j = 1; j < collection.length; j++) {
                if (temp == collection[j]) {
                    tempCount++;
                }
                if (tempCount > count) {
                    count = tempCount;
                }
            }

        }
        return count;
    }
}
