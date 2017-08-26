package org.fundacionjala.coding.marcos;

/**
 * Created by Administrator on 6/13/2017.
 */
public final class Evaporator {

    /**
     * Private constructor for final classes and static methods.
     */
    private Evaporator() {

    }

    /**
     * This method calculates the days in which the evaporator is no longer useful.
     *
     * @param content    The initial content of the evaporator in ml.
     * @param percentage The quantity in percentage that the gas lose everyday.
     * @param threshold  The minimum percentage.
     * @return The days of life longer useful.
     */
    public static int evaporator(double content, double percentage, double threshold) {
        int days = 0;
        double contentAux = content;
        while (contentAux > content * (threshold * 0.01)) {
            contentAux -= contentAux * (percentage * 0.01);
            days++;
        }
        return days;
    }
}
