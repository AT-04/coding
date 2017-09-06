package org.fundacionjala.coding.yury;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * This class Double linear.
 */
public class DoubleLinearTest {
    /**
     * This method testing.
     *
     * @param actual   value.
     * @param expected value.
     */
    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }

    /**
     * Test.
     */
    @Test
    public void test() {
        DoubleLinear doubleLinear = new DoubleLinear();
        System.out.println("Fixed Tests dblLinear");
        testing(doubleLinear.dblLinear(10), 22);
        testing(doubleLinear.dblLinear(20), 57);
        testing(doubleLinear.dblLinear(30), 91);
        testing(doubleLinear.dblLinear(50), 175);
        testing(doubleLinear.dblLinear(10), 22);
        testing(doubleLinear.dblLinear(20), 57);
        testing(doubleLinear.dblLinear(30), 91);
    }
}
