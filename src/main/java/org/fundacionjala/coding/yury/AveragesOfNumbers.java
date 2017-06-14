package org.fundacionjala.coding.yury;

/**
 * Created by YuryOrtuno on 6/6/2017.
 */
public final class AveragesOfNumbers {
    /**
     * Constructor.
     */
    private AveragesOfNumbers() {
    }

    /**
     * @param ints String de numbers.
     * @return solve
     */
    public static double[] averages(int[] ints) {
        int sizeArray = (ints == null || ints.length <= 1) ? 0 : ints.length - 1;
        double[] averagesArray = (sizeArray == 0) ? new double[0] : new double[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            averagesArray[i] = (double) (ints[i] + ints[i + 1]) / 2;
        }
        return averagesArray;
    }
}


