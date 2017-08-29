package test.java.org.fundacionjala.coding.cynthia;

import static org.junit.Assert.assertEquals;

import main.java.org.fundacionjala.coding.cynthia.DetermineOddOrEven;
import org.junit.Test;

/**
 * Created by Administrator on 8/23/2017.
 */
public class DetermineOddOrEvenTest {
    @Test
    public void exampleTest() {
        assertEquals("odd", DetermineOddOrEven.oddOrEven(new int[] {2, 5, 34, 6}));
        assertEquals("even", DetermineOddOrEven.oddOrEven(new int[] {0}));
        assertEquals("even", DetermineOddOrEven.oddOrEven(new int[] {0, -1, -5}));
        assertEquals("odd", DetermineOddOrEven.oddOrEven(new int[] {10, 10, 10, 10 , 10, 10, 1}));
        assertEquals("even", DetermineOddOrEven.oddOrEven(new int[] {1, 1, 1, 1 , 1, 1}));
        assertEquals("odd", DetermineOddOrEven.oddOrEven(new int[] {25}));
    }
}
