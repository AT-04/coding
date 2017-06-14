package org.fundacionjala.coding.abel;


/**
 * Created by AbelBarrientos on 6/13/2017.
 */
public final class Evaporator {

    /**
     *
     */
    private Evaporator() {
    }

    /**
     * Calculate the days before passing threshold.
     *
     * @param content    Double.
     * @param evapPerDay Evaporation per Day.
     * @param threshold  Threshold.
     * @return Integer.
     */
    public static int evaporator(double content, int evapPerDay, int threshold) {
        double doubleThreshold = content * threshold / 100;
        int days;
        for (days = 0; content > doubleThreshold; days++) {
            content -= content * evapPerDay / 100;
        }
        return days;
    }
}
