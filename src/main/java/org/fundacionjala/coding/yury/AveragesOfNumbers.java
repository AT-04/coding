package org.fundacionjala.coding.yury;

/**
 * Created by YuryOrtuno on 6/6/2017.
 */
public class AveragesOfNumbers {

    /**
     * @param ints String de numbers.
     * @return solve
     */
    public double[] averages(int[] ints) {
        int sizeArray = (ints == null || ints.length <= 1) ? 0 : ints.length - 1;
        double[] averagesArray = (sizeArray == 0) ? new double[0] : new double[sizeArray];
        int i = 0;
        while (sizeArray > 0) {
            averagesArray[i] = (double) (ints[i] + ints[i + 1]) / 2;
            i++;
            sizeArray--;
        }
        return averagesArray;
    }
}


