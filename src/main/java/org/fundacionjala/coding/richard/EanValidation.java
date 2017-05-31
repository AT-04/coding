package org.fundacionjala.coding.richard;

/**
 * Created by RichardSeverich on 5/26/2017.
 */
public class EanValidation {

    public static final int TREE = 3;
    public static final int TEN = 10;

    /**
     * @param firstNum it is the number with EAn code that we are going to verify.
     * @return false or true entered has the correct number EAN.
     */

    public boolean eanValidationCod(String firstNum) {
        char[] partsNum = firstNum.toCharArray();
        int numResult = 0;
        for (int i = 0; i < partsNum.length - 1; i = i + 2) {
            numResult += Character.getNumericValue(partsNum[i]);
            numResult += TREE * Character.getNumericValue(partsNum[i + 1]);
        }
        int checksum = numResult % TEN == 0 ? 0 : TEN - (numResult % TEN);

        return checksum == Character.getNumericValue(partsNum[partsNum.length - 1]);
    }
}
