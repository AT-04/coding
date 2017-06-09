package org.fundacionjala.coding.yury;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by YuryOrtuno on 5/22/2017.
 */
public class BanckOCRTests {
    private BanckOCR banckOCR;

    /**
     */
    @Before
    public void before() {
        banckOCR = new BanckOCR();
    }

    /**
     * Convert String to number.
     */
    @Test
    public void convertedNumber() {
        String input = "    _  _     _  _  _  _  _ "
                + "  | _| _||_||_ |_   ||_||_|"
                + "  ||_  _|  | _||_|  ||_| _|";
        assertEquals("123456789", banckOCR.convert(input));
    }

    /**
     * Convert String to number and check si all are number.
     */
    @Test
    public void convertedNumberCase1() {
        String input = "    _  _     _  _  _  _  _ "
                + "  | _| _| _||_ |_   ||_|| |"
                + "  ||_  _|  | _||_|  ||_| _|";
        assertEquals("123?5678?", banckOCR.convert(input));
    }

    /**
     * Calculate sum of the value is equals 0.
     */
    @Test
    public void historyTwoCase1() {
        String input = "457508000";
        assertTrue(banckOCR.validCheckSum(input));
    }


    /**
     * Check contain question marc.
     */
    @Test
    public void historyThreeContainQuestion() {
        String input = "4575?8000";
        assertEquals("4575?8000 ILL", banckOCR.check(input));
    }

    /**
     * Check if of the value is different 0 and show message ERR.
     */
    @Test
    public void historyThreeContainCase2() {
        String input = "664371495";
        assertEquals("664371495 ERR", banckOCR.check(input));

    }

    /**
     * Test for check read a file.
     */
    @Test
    public void readFile() {
        String fileName = "src/test/resources/prueba.txt";
        assertEquals("1234567890", banckOCR.readFile(fileName));
    }

    /**
     * test case 1 of history two.
     */
    @Test
    public void case1() {
        String fileName = "src/test/resources/caso1.txt";
        assertEquals("457508000", banckOCR.solve(fileName));
    }

    /**
     * test case 2 of history two.
     */
    @Test
    public void case3() {
        String fileName = "src/test/resources/caso3.txt";
        assertEquals("664371495 ERR", banckOCR.solve(fileName));
    }

    /**
     * test case 3 of history two.
     */
    @Test
    public void case2() {
        String fileName = "src/test/resources/caso2.txt";
        assertEquals("457?08?00 ILL", banckOCR.solve(fileName));
    }
}
