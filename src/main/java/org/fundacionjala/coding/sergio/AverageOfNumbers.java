package org.fundacionjala.coding.sergio;

/**
 * Created by SergioNavarro on 6/6/2017.
 */
public final class AverageOfNumbers {
    /**
     * By Default.
     */
    private AverageOfNumbers() {

    }
    /**
     *
     * @param ints The input array.
     * @return The averages method.
     */
    static double[] averages(int[] ints) {
        return ints == null || ints.length <= 1 ? new double[0] : getDoubles(ints);
    }

    /**
     *
     * @param ints same input array.
     * @return operation.
     */
    private static double[] getDoubles(int[] ints) {
        double[] prueba = new double[ints.length - 1];
        for (int i = 0; i < ints.length - 1; i++) {
            prueba[i] = (double) (ints[i] + ints[i + 1]) / 2;
        }
        return prueba;
    }
}
