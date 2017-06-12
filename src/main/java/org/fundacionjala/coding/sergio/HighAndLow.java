package org.fundacionjala.coding.sergio;

/**
 * Created by SergioNavarro on 6/12/2017.
 */
final class HighAndLow {

    /**
     *
     */
    private HighAndLow() {

    }
    /**
     *
     * @param s dss
     * @return aaa
     */
    static String resolve(String s) {
        String[] numbers = s.split(" ");
        int min = Integer.parseInt(numbers[0]);
        int max = min;
        for (String number : numbers) {
            if (Integer.parseInt(number) > max) {
                max = Integer.parseInt(number);
            }
            if (Integer.parseInt(number) < min) {
                min = Integer.parseInt(number);
            }
        }
        return String.format("%d %d", max, min);
    }
}


