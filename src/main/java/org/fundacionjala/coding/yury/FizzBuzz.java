package org.fundacionjala.coding.yury;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringJoiner;

/**
 * Created by Administrator on 8/25/2017.
 */
public class FizzBuzz {

    private final Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

    /**
     * This constructor.
     */
    public FizzBuzz() {
        linkedHashMap.put(15, "FizzBuzz");
        linkedHashMap.put(5, "Buzz");
        linkedHashMap.put(3, "Fizz");
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
            stringJoiner.add(i % 3 == 0 || i % 5 == 0 ? fizzOrBuzz(i) : String.valueOf(i));
        }
        return String.join(" ", String.valueOf(stringJoiner));
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
