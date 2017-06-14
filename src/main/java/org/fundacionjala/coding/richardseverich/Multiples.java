package org.fundacionjala.coding.richardseverich;

/**
 * Created by RichardSeverich on 6/12/2017.
 */
public class Multiples {

    /**
     * @param number Is number.
     * @return return Sum of multiples of 3 and 5.
     */
    public int solution(int number) {
        int result = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }
        return result;
    }
}
