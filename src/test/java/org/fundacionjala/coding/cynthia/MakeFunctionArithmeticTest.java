package org.fundacionjala.coding.cynthia;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by Cynthia on 9/11/2017.
 */
public class MakeFunctionArithmeticTest {

    /**
     *
     */
    @Test
    public void testBasic() {
        MakeFunctionArithmetic make = new MakeFunctionArithmetic();
        assertEquals("'add' should return the two numbers added together!", 3, make.arithmetic(1, 2, "add"));
        assertEquals("'subtract' should return a mimus b!", 6, make.arithmetic(8, 2, "subtract"));
        assertEquals("'multiply' should return a multiplied by b!", 10, make.arithmetic(5, 2, "multiply"));
        assertEquals("'divide' should return a divided by b!", 4, make.arithmetic(8, 2, "divide"));
    }
}
