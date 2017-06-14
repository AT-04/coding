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
        int[] arrayListInt = Arrays.asList(sentence.split(" ")).stream().mapToInt(Integer::parseInt).sorted().toArray();
        return String.format("%d %d", arrayListInt[arrayListInt.length - 1], arrayListInt[0]);
    }

}
