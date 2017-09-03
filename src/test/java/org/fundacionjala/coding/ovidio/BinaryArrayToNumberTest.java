package org.fundacionjala.coding.ovidio;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by Simon on 27/08/2017.
 */
public class BinaryArrayToNumberTest {
    private BinaryArrayToNumber binaryArrayToNumber;

    /**
     *
     */
    @Before
    public void setUp() {
        binaryArrayToNumber = new BinaryArrayToNumber();
    }

    /**
     *
     */
    @Test
    public void convertBinaryArrayToInt() {
        assertEquals(1, binaryArrayToNumber.convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 0, 0, 1))));
        assertEquals(15, binaryArrayToNumber.convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 1, 1, 1))));
        assertEquals(6, binaryArrayToNumber.convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 1, 1, 0))));
        assertEquals(9, binaryArrayToNumber.convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 0, 0, 1))));
    }
}
