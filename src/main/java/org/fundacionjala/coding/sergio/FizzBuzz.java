package org.fundacionjala.coding.sergio;

/**
 * Created by SergioNavarro on 8/25/2017.
 */
public class FizzBuzz {

    /**
     * @param num input.
     * @return return.
     */
    public String[] resolve(int num) {
        String[] result = new String[num];
        boolean normal = true;
        for (int i = 1; i <= num; i++) {
            normal = true;
            if (i % 3 == 0 && i % 5 == 0) {
                result[i - 1] = "FizzBuzz";
                normal = false;
            }
            if (i % 3 == 0 && normal) {
                result[i - 1] = "Fizz";
                normal = false;
            }
            if (i % 5 == 0 && normal) {
                result[i - 1] = "Buzz";
                normal = false;
            }
            if (normal) {
                result[i - 1] = Integer.toString(i);
            }
        }
        return result;
    }
}
