package org.fundacionjala.coding.richardseverich;

/**
 * Created by RichardSeverich on 6/13/2017.
 */
public class Evaporator {


    private static final int HUNDRED = 100;

    /**
     * @param content content.
     * @param pper    days.
     * @param umbral  limit.
     * @return days Life.
     */
    public int lifeEvaporator(double content, int pper, int umbral) {
        double limit = (content * umbral) / HUNDRED;
        int days = 0;
        while (content > limit) {
            content += -(content * pper) / HUNDRED;
            days++;
        }
        return days;
    }
}
