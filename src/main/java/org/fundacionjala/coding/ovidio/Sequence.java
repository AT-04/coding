package org.fundacionjala.coding.ovidio;

/**
 * Created by OvidioMiranda on 8/18/2017.
 */
public class Sequence {

     /**
     * Get Score.
     *
     * @param n Long.
     * @return Long
     */
    public  long getScore(final long n) {
        return 25 * n * (n + 1);
    }
}
