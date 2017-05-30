package org.fundacionjala.coding.marcoslara.eanvalidation;

/**
 * Created by Marcos Lara on 5/26/2017.
 */
public final class EanValidator {

    private static final int NUMBER_OF_DIGITS = 13;
    private static final int MODULE_DIVIDEND = 10;
    private static final int EAN_MULTIPLIER = 3;
    private static final int ZERO_ASCII = 48;

    /**
     * Private constructor required. These kind of classes are more like tools/utilities than being meant for objects.
     */
    private EanValidator() {

    }

    /**
     * @param eanCode Is the code represented by a String object that will be validated.
     * @return Returns the result of the validation (true or false).
     */
    public static boolean validate(String eanCode) {
        char[] digits = eanCode.toCharArray();
        int checksum = 0;
        for (int i = 0; i < NUMBER_OF_DIGITS - 1; i++) {
            checksum += (i + 1) % 2 == 0 ? (digits[i] - ZERO_ASCII) * EAN_MULTIPLIER : digits[i] - ZERO_ASCII;
        }
        checksum = checksum % MODULE_DIVIDEND == 0 ? 0 : MODULE_DIVIDEND - (checksum % MODULE_DIVIDEND);
        digits[NUMBER_OF_DIGITS - 1] = (char) (checksum + ZERO_ASCII);
        return eanCode.equals(new String(digits));
    }
}
