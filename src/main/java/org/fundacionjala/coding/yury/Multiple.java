package org.fundacionjala.coding.yury;

/**
 * Created by YuryOrtuno on 6/12/2017.
 */
public final class Multiple {
    private static final int THREE = 3;
    private static final int FIVE = 5;

    /**
     * Constructor.
     */
    private Multiple() {
    }

    /**
     * @param max number
     * @return sum multiples 3 and 5
     */
    public static int solution(int max) {

        int sum = 0;
        for (int i = 1; i < max; i++) {
            if (i % THREE == 0 || i % FIVE == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
