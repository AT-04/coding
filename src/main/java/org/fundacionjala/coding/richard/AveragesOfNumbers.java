package org.fundacionjala.coding.richard;

/**
 * Created by Richard on 6/7/2017.
 */
public class AveragesOfNumbers {

    /**
     * @param intArray Int Array.
     * @return Double Array
     */
    public double[] averages(int[] intArray) {
        int sizeArray = (intArray == null || intArray.length <= 1) ? 0 : intArray.length - 1;
        double[] averagesArray = (sizeArray == 0) ? new double[0] : new double[sizeArray];
        int i = 0;
        while (sizeArray > 0) {
            averagesArray[i] = (double) (intArray[i] + intArray[i + 1]) / 2;
            i++;
            sizeArray--;
        }
        return averagesArray;
    }
}
