package org.fundacionjala.coding.jose;


/**
 * Created by JoseTorrez on 6/12/2017.
 */
public final class Multiplies {

    /**
     * Constructor.
     */
    private Multiplies() {
    }

    /**
     * Method for obtain the addition of multiplies.
     * @param number integer.
     * @return Integer.
     */
    public static int solutionMultiplies(int number) {
        int sum = 0;
        int i = 0;
        while (i < number) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
            i++;
        }
        return sum;
    }
}
