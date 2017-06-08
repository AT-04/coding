package org.fundacionjala.coding.richardseverich;

/**
 * Created by Richard on 6/7/2017.
 */
public class AveragesOfNumbers {

    /**
     * @param numbers Int Array.
     * @return Double Array
     */
    public double[] averages(int[] numbers) {
        if (numbers != null && numbers.length > 2) {
            double[] averageNumbers;
            averageNumbers = new double[numbers.length - 1];
            for (int i = 0; i < numbers.length - 1; i++) {
                averageNumbers[i] = (double) (numbers[i] + numbers[i + 1]) / 2;
            }
            return averageNumbers;
        }
        return new double[0];
    }
}
