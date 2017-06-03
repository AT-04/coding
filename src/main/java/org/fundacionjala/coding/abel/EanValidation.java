package org.fundacionjala.coding.abel;


/**
 * Created by AbelBarrientos on 5/26/2017.
 */
public final class EanValidation {

    public static final int PAIR_POSITION = 3;
    public static final int TEN = 10;

    /**
     * The constructor.
     */
    private EanValidation() { }

    /**
     * This method validate a checksum.
     * @param checksum String to validate.
     * @return boolean The result.
     */
    public static boolean validate(String checksum) {
        char[] charArray = checksum.substring(0, checksum.length() - 1).toCharArray();
        int sum = 0;
        for (int i = 0; i < charArray.length; i++) {
            int intValue = Integer.parseInt(String.valueOf(charArray[i]));
            sum += i % 2 == 0 ? intValue : intValue * PAIR_POSITION;
        }
        int realChecksum = (sum % TEN == 0) ? 0 : TEN - (sum % TEN);
        return realChecksum == Integer.parseInt(checksum.substring(checksum.length() - 1));
    }
}
