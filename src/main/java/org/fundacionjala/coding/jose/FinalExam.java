package org.fundacionjala.coding.jose;

/**
 * Created by JoseTorrez on 6/13/2017.
 */
public final class FinalExam {

    /**
     * Constructor.
     */
    private FinalExam() {

    }

    /**
     * @param content   double.
     * @param perDay    double.
     * @param threshold double.
     * @return Double.
     */
    public static double evaporator(double content, double perDay, double threshold) {

        threshold = threshold / 100;
        perDay = perDay / 100;
        return Math.ceil(Math.log(threshold) / Math.log(1 - perDay));

    }
}
