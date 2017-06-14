package org.fundacionjala.coding.yury;


/**
 * Created by YuryOrtuno on 6/13/2017.
 */
public final class Exam {

    private static final int PORCENTAJE = 100;

    /**
     * Constructor.
     */
    private Exam() {
    }

    /**
     * @param content      of the evaporator.
     * @param evapPerDay gas lost every day.
     * @param umbral       percentage beyond which the evaporator is no longer useful.
     * @return day the evaporator will be out of use.
     */
    public static int evaporator(double content, double evapPerDay, double umbral) {

        int i = 0;
        double min = content * umbral / PORCENTAJE;
        while (content >= min) {
            content -= content * (evapPerDay / PORCENTAJE);
            i++;
        }
        return i;
    }
}
