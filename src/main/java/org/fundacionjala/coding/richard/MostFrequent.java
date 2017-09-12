package org.fundacionjala.coding.richard;

/**
 * Created by Administrator on 9/5/2017.
 */
public class MostFrequent {

    /**
     * This method returns the most frequent item count.
     *
     * @param arrayNumbers This variable contains the array of ints.
     * @return return the most frequent item count.
     */
    public int mostFrequentItemCount(int[] arrayNumbers) {
        if (arrayNumbers.length == 0) {
            return 0;
        }
        int count = 0;
        int biggerNumber = 0;
        for (int firstNumber : arrayNumbers) {
            for (int secondNumber : arrayNumbers) {
                if (firstNumber == secondNumber) {
                    count++;
                }
            }
            if (count > biggerNumber) {
                biggerNumber = count;
            }
            count = 0;
        }
        return biggerNumber;
    }
}
