package org.fundacionjala.coding.ovidio;


/**
 * Created by OvidioMiranda on 6/6/2017.
 */
public final class AveragesOfNumbers {

    /**
     * Constructor.
     */
    private AveragesOfNumbers() {
    }

    /**
     * This method calculates the averages of an array of a .
     *
     * @param ints The array with numbers integer.
     * @return The array of averages numbers.
     */
    public static double[] averages(int[] ints) {
        if (ints == null || ints.length <= 1) {
            return new double[0];
        }
        double[] result = new double[ints.length - 1];
        int i = 0;
        while (i < ints.length - 1) {
            result[i] = (ints[i] + ints[i + 1]) / 2.0;
            i++;
        }
        return result;
    }

}



