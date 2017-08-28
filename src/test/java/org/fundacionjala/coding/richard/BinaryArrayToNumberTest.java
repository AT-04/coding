package org.fundacionjala.coding.richard;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Richard on 8/27/2017.
 * Given a list of binary numbers convert it to decimal
 */
public class BinaryArrayToNumberTest {

    /**
     *
     */
    @Test
    public void convertBinaryArrayToInt() {
        BinaryArrayToNumber binaryArrayToNumber = new BinaryArrayToNumber();
        assertEquals(1, binaryArrayToNumber
                .convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 0, 0, 1))));
        assertEquals(15, binaryArrayToNumber
                .convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 1, 1, 1))));
        assertEquals(6, binaryArrayToNumber
                .convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 1, 1, 0))));
        assertEquals(9, binaryArrayToNumber
                .convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 0, 0, 1))));
    }
}
