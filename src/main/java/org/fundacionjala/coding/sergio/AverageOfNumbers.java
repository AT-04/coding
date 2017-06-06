package org.fundacionjala.coding.sergio;

/**
 * Created by SergioNavarro on 6/6/2017.
 */
public class AverageOfNumbers {
    public static double[] averages(int[] ints) {
        double[] prueba = new double[4];
        for (int i = 0; i < ints.length-1; i++) {
            prueba[i] = (ints[1]+ints[i+1])/2;
        }
        return prueba;
    }
}
