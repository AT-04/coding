package org.fundacionjala.coding.sergio;

/**
 * Created by SergioNavarro on 6/12/2017.
 */
final class  Multiples {
    /**
     *
     */
    private Multiples() {

    }

    /**
     *
     * @param num cc
     * @return cca
     */
    static int solution(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
