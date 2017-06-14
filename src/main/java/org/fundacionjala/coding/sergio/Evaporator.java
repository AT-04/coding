package org.fundacionjala.coding.sergio;

/**
 * Created by SergioNavarro on 6/13/2017.
 */
final class Evaporator {
    /**
     *
     */
    private Evaporator() {

    }

    /**
     *
     */
    private static final int PERCENTAGES = 100;

    /**
     *
     * @param contentGas content.
     * @param evapoPerDay evap per day.
     * @param threshold limit.
     * @return days.
     */
    static int evaporator(double contentGas, int evapoPerDay, int threshold) {
        int days = 0;
        double start = contentGas;
        while (start * threshold / PERCENTAGES < contentGas) {
            contentGas -= contentGas * evapoPerDay / PERCENTAGES;
            days += 1;
        }
        return days;
    }
}
