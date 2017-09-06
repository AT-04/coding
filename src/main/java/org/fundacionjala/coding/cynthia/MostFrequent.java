package org.fundacionjala.coding.cynthia;

/**
 * Created by Cynthia on 9/5/2017.
 */
public class MostFrequent {

    /**
     * @param a is the array.
     * @return the most repeat.
     */
    public int mostFrequentItemCount(int[] a) {
        int mayor = 0;
        for (int anA : a) {
            int count = 0;
            for (int anA1 : a) {
                if (anA1 == anA) {
                    count++;
                }
            }
            if (count > mayor) {
                mayor = count;
            }
        }
        return mayor;
    }
}
