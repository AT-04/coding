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
     * @param number adasd.
     * @return asdas.
     */
    public static int solution(int number) {
        int result = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }
        return result;
    }

}
