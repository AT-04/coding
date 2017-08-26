package org.fundacionjala.coding.yury;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringJoiner;

/**
 * Created by Administrator on 8/25/2017.
 */
public class FizzBuzz {

    public static final int FIFTEEN = 15;
    public static final int FIVE = 5;
    public static final int THREE = 3;
    private final Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

    /**
     * This constructor.
     */
    public FizzBuzz() {
        linkedHashMap.put(FIFTEEN, "FizzBuzz");
        linkedHashMap.put(FIVE, "Buzz");
        linkedHashMap.put(THREE, "Fizz");
    }

    /**
     * This method generate sequence.
     *
     * @param n is value final of sequence.
     * @return sequence.
     */
    public String sequence(int n) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 1; i <= n; i++) {
            stringJoiner.add(i % THREE == 0 || i % FIVE == 0 ? fizzOrBuzz(i) : String.valueOf(i));
        }
        return stringJoiner.toString();
    }

    /**
     * This method search condition.
     *
     * @param i is number to calculate.
     * @return answer.
     */
    private String fizzOrBuzz(int i) {
        for (Map.Entry<Integer, String> integer : linkedHashMap.entrySet()) {
            if (i % integer.getKey() == 0) {
                return integer.getValue();
            }
        }
        return "";
    }
}
