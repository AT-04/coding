package org.fundacionjala.coding.abel;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * Create a function taking a positive integer as its parameter and returning a string containing the Roman Numeral
 * representation of that integer.
 * Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping
 * any digit with a value of zero. In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC.
 * 2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.
 * Example:
 * conversion.solution(1000); //should return "M"
 */
public class Conversion {

    private static final Map<Integer, String> FIRST_MAP = new HashMap<Integer, String>() {
        {
            put(1, "I");
            put(5, "V");
            put(10, "X");
        }
    };

    private static final Map<Integer, String> SECOND_MAP = new HashMap<Integer, String>() {
        {
            put(1, "X");
            put(5, "L");
            put(10, "C");
        }
    };

    private static final Map<Integer, String> THIRD_MAP = new HashMap<Integer, String>() {
        {
            put(1, "C");
            put(5, "D");
            put(10, "M");
        }
    };

    /**
     * Method to return the roman number representation according to the current Map.
     *
     * @param number number in Cardinal.
     * @param map    Map containing actual representation of values.
     * @return Roman representation as String.
     */
    private String getRomanRepresentation(int number, Map<Integer, String> map) {
        Map<Integer, String> resultMap = new HashMap<Integer, String>();
        resultMap.put(1, map.get(1));
        resultMap.put(2, String.format("%s%s", map.get(1), map.get(1)));
        resultMap.put(3, String.format("%s%s%s", map.get(1), map.get(1), map.get(1)));
        resultMap.put(4, String.format("%s%s", map.get(1), map.get(5)));
        resultMap.put(5, map.get(5));
        resultMap.put(6, String.format("%s%s", map.get(5), map.get(1)));
        resultMap.put(7, String.format("%s%s%s", map.get(5), map.get(1), map.get(1)));
        resultMap.put(8, String.format("%s%s%s%s", map.get(5), map.get(1), map.get(1), map.get(1)));
        resultMap.put(9, String.format("%s%s", map.get(1), map.get(10)));
        return resultMap.get(number);
    }

    /**
     * Method to solve and get the Roman Representation of any number.
     *
     * @param n Integer representation of number.
     * @return String Representation of number.
     */
    public String solution(int n) {
        StringBuilder result = new StringBuilder();
        while (n >= 1000) {
            result.append("M");
            n -= 1000;
        }
        if (n >= 100) {
            result.append(getRomanRepresentation(n / 100, THIRD_MAP));
            n %= 100;
        }
        if (n >= 10) {
            result.append(getRomanRepresentation(n / 10, SECOND_MAP));
            n %= 10;
        }
        if (n >= 1) {
            result.append(getRomanRepresentation(n / 1, FIRST_MAP));
        }
        return result.toString();
    }
}
