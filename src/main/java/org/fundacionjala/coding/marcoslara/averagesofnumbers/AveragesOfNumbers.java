package org.fundacionjala.coding.marcoslara.averagesofnumbers;

/**
 * Created by Marcos Lara on 6/6/2017.
 */

public final class AveragesOfNumbers {

    /**
     * Private constructor required. These kind of classes are more like tools/utilities than being meant for objects.
     */
    private AveragesOfNumbers() {

    }

    /**
     * This method calculates the averages of an array of a .
     *
     * @param numbers The array of numbers.
     * @return The array of averages numbers.
     */
    public static double[] averages(int[] numbers) {
        if (numbers != null && numbers.length > 1) {
            double[] averages = new double[numbers.length - 1];
            for (int i = 0; i < averages.length; i++) {
                averages[i] = (double) (numbers[i] + numbers[i + 1]) / 2;
            }
            return averages;
        }
        return new double[0];
    }
}
