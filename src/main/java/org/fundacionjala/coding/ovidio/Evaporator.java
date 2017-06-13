package org.fundacionjala.coding.ovidio;

/**
 * Created by OvidioMiranda on 6/13/2017.
 */
public final class Evaporator {

    /**
     *
     */
    private Evaporator() {
    }

    /**
     * @param content    content.
     * @param evapPerDay evap per day.
     * @param threshold  threshold.
     * @return int
     */
    public static int evaporator(double content, double evapPerDay, double threshold) {
        int result = 0;
        double percent = 100;
        while (percent > threshold) {
            percent -= percent * (evapPerDay / 100);
            result++;
        }
        return result;
    }

}















/*
    public static int evaporator(double content, double evap_per_day, double threshold) {

        int result = 0;
        double percent = 100;
        while (percent > threshold)
        {
            percent = percent - percent * (evap_per_day/100);
            result++;
        }
        return result;

    }
    */

