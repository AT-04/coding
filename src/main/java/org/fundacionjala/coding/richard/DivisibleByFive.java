package org.fundacionjala.coding.richard;

import java.util.regex.Pattern;

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
public class DivisibleByFive {

    /**
     * @return Pattern compile.
     */
    public Pattern pattern() {
        return Pattern.compile("(0|1(10)*(0|11)(01*01|01*00(10)*(0|11))*1)+");
    }
}
