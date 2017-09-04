package org.fundacionjala.coding.abel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class for testing Roman Number Representation.
 */
public class ConversionTest {

    private Conversion conversion = new Conversion();

    /**
     * Sample test to run.
     */
    @Test
    public void shouldCovertToRoman() {
        assertEquals("solution(1) should equal to I", "I", conversion.solution(1));
        assertEquals("solution(4) should equal to IV", "IV", conversion.solution(4));
        assertEquals("solution(6) should equal to VI", "VI", conversion.solution(6));
        assertEquals("solution(6) should equal to XVI", "XVI", conversion.solution(16));
        assertEquals("solution(6) should equal to MDXXLVII", "MDCCLVII", conversion.solution(1757));
    }
}
