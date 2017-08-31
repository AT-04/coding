package org.fundacionjala.coding.yury;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 8/30/2017.
 */
public class MysteryFunctionTest {

    @Test
    public void mystery() throws Exception {
        assertEquals("mystery(6) ", 5, MysteryFunction.mystery(6));
        assertEquals("mystery(9) ", 13, MysteryFunction.mystery(9));
        assertEquals("mystery(19) ", 26, MysteryFunction.mystery(19));
    }
}
