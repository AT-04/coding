package org.fundacionjala.coding.ovidio;

import java.util.Arrays;

/**
 * Created by OvidioMiranda on 6/12/2017.
 */

public final class HighestAndLowest {
    /**
     *
     */
    private HighestAndLowest() {
    }

    /**
     * @param sentence is String.
     * @return new String.
     */
    public static String highAndLow(String sentence) {
        String[] numbersArray = sentence.split(" ");
        int[] arrayListInt = new int[numbersArray.length];
        int i = 0;
        for (String number : numbersArray) {
            arrayListInt[i] = Integer.parseInt(number);
            i++;
        }
        Arrays.sort(arrayListInt);
        return String.format("%d %d", arrayListInt[arrayListInt.length - 1], arrayListInt[0]);
    }

}
