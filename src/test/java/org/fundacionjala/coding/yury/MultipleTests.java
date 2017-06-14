package org.fundacionjala.coding.yury;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by YuryOrtuno on 6/12/2017.
 */
public class MultipleTests {
    /**
     */
    @Test
    public void test1() {
        assertEquals(23, Multiple.solution(10));
    }

    /**
     */
    @Test
    public void test2() {
        assertEquals(78, Multiple.solution(20));
    }

    /**
     */
    @Test
    public void test3() {
        assertEquals(9168, Multiple.solution(200));
    }
}
