package org.fundacionjala.coding.yury;

/**
 * Created by Administrator on 9/5/2017.
 */
public class Frequent {
    /**
     * This method calculate the number repeated maxim.
     *
     * @param ints is all number.
     * @return repeated maxim.
     */
    public int mostFrequentItemCount(int[] ints) {
        int numberRepeated = 0;
        for (int x : ints) {
            int count = 0;
            for (int y : ints) {
                count += x == y ? 1 : 0;
            }
            numberRepeated = count >= numberRepeated ? count : numberRepeated;
        }
        return numberRepeated;
    }
}
