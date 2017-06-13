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
     * @param max number.
     * @return number.
     */
    public static int solution(int max) {
        int  sum=0, i=0;
        while(i<max)
        {
            sum += (i % 3 == 0 || i % 5 == 0) ? i : 0;
            i++;
        }
        return sum;
    }




}
