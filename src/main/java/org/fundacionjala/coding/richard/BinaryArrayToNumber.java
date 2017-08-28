package org.fundacionjala.coding.richard;

import java.util.List;

/**
 * Created by Richard on 8/27/2017.
 * Given a list of binary numbers convert it to decimal
 */
public class BinaryArrayToNumber {

    /**
     * This method converts binary to decimal number.
     *
     * @param binary this variable contains a list with binary numbers.
     * @return a decimal number.
     */
    public int convertBinaryArrayToInt(List<Integer> binary) {
        int decimal = 0;
        for (int i = 0; i < binary.size(); i++) {
            decimal += binary.get(binary.size() - i - 1) * Math.pow(2, i);
        }
        return decimal;
    }
}
