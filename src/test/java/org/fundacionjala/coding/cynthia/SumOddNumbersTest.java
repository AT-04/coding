package org.fundacionjala.coding.cynthia;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by Cynthia on 9/11/2017.
 */
public class SumOddNumbersTest {

    /**
     *
     */
        @Test
        public void test1() {
            SumOddNumbers sumOddNumbers = new SumOddNumbers();
            assertEquals(1, sumOddNumbers.rowSumOddNumbers(1));
            assertEquals(74088, sumOddNumbers.rowSumOddNumbers(42));
            assertEquals(8, sumOddNumbers.rowSumOddNumbers(2));
            assertEquals(27, sumOddNumbers.rowSumOddNumbers(3));
            assertEquals(64, sumOddNumbers.rowSumOddNumbers(4));
            assertEquals(125, sumOddNumbers.rowSumOddNumbers(5));
        }

}
