package org.fundacionjala.coding.ovidio;

/**
 * Created by OvidioMiranda on 6/12/2017.
 */
public final class MultiplesOfThreeAndFive {
    /**
     *
     */
    private MultiplesOfThreeAndFive() {
    }

    /**
     *
     * @param max adasd.
     * @return asdas.
     */
    public static int solution(int max) {
        int result = 0;
        for (int i = 0; i < max; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }
        return result;
    }

}
