package org.fundacionjala.coding.richard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Richard on 9/5/2017.
 * <p>
 * Define a regular expression which tests if a given string representing a binary number is divisible by 5.
 * Examples:
 * 5 divisible by 5
 * DivisibleByFive.pattern().matcher('101').matches() == true
 * 35 divisible by 5
 * DivisibleByFive.pattern().matcher('10000111').matches() == true
 * 666 not divisible by 5
 * DivisibleByFive.pattern().matcher('0000001010011010').matches() == false
 * Note:
 * This can be solved by creating a Finite State Machine that evaluates if a string representing a
 * number in binary base is divisible by given number.
 * The detailed explanation for dividing by 3 is here
 * The FSM diagram for dividing by 5 is here
 */
public class DivisibleByFiveTest {

    private static Object[][] testArr = new Object[][]{
            new Object[]{false, ""},
            new Object[]{false, "abc"},
            new Object[]{true, "000"},
            new Object[]{true, "101"},
            new Object[]{true, "1010"},
            new Object[]{true, "10100"},
            new Object[]{true, Integer.toBinaryString(65020)},

            new Object[]{false, "10110101"},
            new Object[]{false, "1110001"},

            new Object[]{false, Integer.toBinaryString(21)},
            new Object[]{false, Integer.toBinaryString(15392)},
            new Object[]{false, Integer.toBinaryString(23573)},
            new Object[]{false, Integer.toBinaryString(19344)},

            new Object[]{false, Integer.toBinaryString(43936)},
            new Object[]{false, Integer.toBinaryString(32977)},
            new Object[]{false, Integer.toBinaryString(328)},
            new Object[]{false, Integer.toBinaryString(5729)}
    };

    /**
     *
     */
    @Test
    public void exampleTests() {
        DivisibleByFive divisibleByFive = new DivisibleByFive();
        for (Object[] arr : testArr) {
            boolean exp = (boolean) arr[0];
            String toTest = (String) arr[1];
            assertEquals(String.format("Should work with '%s':", toTest), exp, divisibleByFive.pattern()
                    .matcher(toTest).matches());
        }
    }
}
