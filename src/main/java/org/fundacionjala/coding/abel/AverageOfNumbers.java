package org.fundacionjala.coding.abel;

/**
 * Created by AbelBarrientos on 6/6/2017.
 */
public final class AverageOfNumbers {

    /**
     * Constructor.
     */
    private AverageOfNumbers() {
    }

    /**
     * Return the avergages of an array.
     * @param intArray Int Array
     * @return Double Array
     */
    public static double[] averages(int[] intArray) {
        if (intArray == null || intArray.length <= 1) {
            return new double[0];
        }
        double[] averagesArray = new double[intArray.length - 1];
        for (int i = 0; i < intArray.length - 1; i++) {
            averagesArray[i] = (double) (intArray[i] + intArray[i + 1]) / 2;
        }
        return averagesArray;
    }
}
