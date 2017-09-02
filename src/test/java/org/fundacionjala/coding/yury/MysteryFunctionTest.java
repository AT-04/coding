package org.fundacionjala.coding.yury;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 8/30/2017.
 */
public class MysteryFunctionTest {

    private MysteryFunction mysteryFunction;

    /**
     * This method before.
     */
    @Before
    public void setUp() {
        mysteryFunction = new MysteryFunction();
    }

    /**
     * Test.
     *
     * @throws Exception exception.
     */
    @Test
    public void mystery() throws Exception {
        assertEquals("mystery(6) ", 5, mysteryFunction.mystery(6));
        assertEquals("mystery(9) ", 13, mysteryFunction.mystery(9));
        assertEquals("mystery(19) ", 26, mysteryFunction.mystery(19));
    }

    /**
     * Test.
     *
     * @throws Exception exception.
     */
    @Test
    public void mysteryInv() throws Exception {
        assertEquals("mysteryInv(5)", 6, mysteryFunction.mysteryInv(5));
        assertEquals("mysteryInv(13)", 9, mysteryFunction.mysteryInv(13));
        assertEquals("mysteryInv(26)", 19, mysteryFunction.mysteryInv(26));
    }

    /**
     * Test.
     *
     * @throws Exception exception.
     */
    @Test
    public void gray() throws Exception {
        assertEquals("gray code", mysteryFunction.nameOfMystery().toLowerCase());
    }
}
