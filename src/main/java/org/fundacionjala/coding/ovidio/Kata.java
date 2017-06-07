package org.fundacionjala.coding.ovidio;


/**
 * Created by OvidioMiranda on 6/6/2017.
 */
public final class Kata {

    /**
     * Constructor.
     */
    private Kata() {
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
        for (int i = 0; i < ints.length - 1; i++) {
            result[i] = (ints[i] + ints[i + 1]) / 2.0;
        }
        return result;
    }
}



