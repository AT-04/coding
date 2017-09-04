package org.fundacionjala.coding.ovidio;

/**
 * Created by Simon on 03/09/2017.
 */
public class GetMiddle {
    /**
     * Get Middle of Word.
     *
     * @param word word.
     * @return middle.
     */
    public String getMiddle(String word) {
        int length = word.length();
        int middle = length / 2;
        return length % 2 != 0 ? String.valueOf(word.charAt(middle)) : word.substring(middle - 1, middle + 1);
    }
}
