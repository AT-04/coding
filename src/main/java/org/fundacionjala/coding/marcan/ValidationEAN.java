package org.fundacionjala.coding.marcan;

/**
 * Created by MarcandeaCabrera on 5/26/2017.
 */
public class ValidationEAN {
    private static final int VALUE_THEN = 10;
    private static final int THREE = 3;
    private static final int ZERO = 0;

    /**
     * This is a method for processing the string.
     *
     * @param string is the sequence.
     * @return boolean.
     */
    public boolean verifyStringEAN(String string) {
        int cheksum = 0;
        for (int i = 0; i < string.length() - 1; i++) {
            int dates = Integer.parseInt(string.substring(i, i + 1));
            cheksum += i % 2 != ZERO ? dates * THREE : dates;
        }
        cheksum = cheksum % VALUE_THEN == ZERO ? ZERO : VALUE_THEN - (cheksum % VALUE_THEN);
        return cheksum == Integer.parseInt(string.substring(string.length() - 1, string.length()));
    }
}
