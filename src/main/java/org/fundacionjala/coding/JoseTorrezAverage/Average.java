package org.fundacionjala.coding.JoseTorrezAverage;

/**
 * Created by JUANJOSE on 08/06/2017.
 */
public final class Average {

    /**
     * Constructor.
     */
    private Average() {

    }
    /**
     * This method get an averga of two numbers in the array.
     * @param array contain the numbers.
     * @return double array.
     */
    public static double[] averageNumbers(int[] array) {
        if (array == null || array.length <= 1) {
            return new double[0];
        }
        double[] result = new double[array.length - 1];
        int i = 0;
        while (i < array.length - 1) {
            result[i] = (double) (array[i] + array[i + 1]) / 2;
            i++;
        }
        return result;
    }
}
