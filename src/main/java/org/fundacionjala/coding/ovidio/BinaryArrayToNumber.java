package org.fundacionjala.coding.ovidio;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Simon on 27/08/2017.
 * Ones and Zeros.
 * Given an array of one's and zero's convert the equivalent binary value to an integer.
 * <p>
 * Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1
 */
public class BinaryArrayToNumber {
    /**
     * Convert Binary Array To Int.
     * @param binary Array.
     * @return int Decimal Number.
     */
    public int convertBinaryArrayToInt(List<Integer> binary) {
        String numberBinary = binary.stream().map(digit -> digit.toString()).collect(Collectors.joining(""));
        return Integer.parseInt((numberBinary.toString()), 2);
    }
}
