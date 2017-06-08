package org.fundacionjala.coding.sergio;

/**
 * Created by Sergio on 04/06/2017.
 */
public final class EanValidation {

    private static final int VAL = 3;
    private static final int CONDITION = 10;

    /**
     * Default.
     */
    private EanValidation() {

    }

    /**
     *
     * @param entry any value of user entry.
     * @return CheckSum validation.
     */
    public static boolean validation(String entry) {
        String[] digits = entry.substring(0, entry.length() - 1).split("");
        int evenOddSum = 0;
        for (int i = 0; i < entry.length() - 1; i++) {
            evenOddSum += i % 2 != 0 ? Integer.parseInt(digits[i]) * VAL : Integer.parseInt(digits[i]);
        }
        evenOddSum = CONDITION - (evenOddSum % CONDITION);
        return evenOddSum == Integer.parseInt(entry.substring(entry.length() - 1, entry.length()));
    }
}
