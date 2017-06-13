package org.fundacionjala.coding.cynthia;

/**
 * Created by CynthiaTerrazas on 6/6/2017.
 */
public final class AveragesNumbers {
    /**
     * this is the method constructor.
     */
    private AveragesNumbers() {
    }

    /**
     * this method calculate the average of numbers.
     *
     * @param array of integers is the enter to the method.
     * @return arraryProm of doubles is the final result.
     */
    public static double[] arrayAverage(int[] array) {
        if (array == null || array.length <= 1) {
            return new double[0];
        }
        double[] arrayProm = new double[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            arrayProm[i] = (double) (array[i] + array[i + 1]) / 2;
        }
        return arrayProm;
    }
}
