package org.fundacionjala.coding.ovidio_eanValidation;


import java.util.Arrays;

/**
 * Created by OvidioMiranda on 5/26/2017.
 */
public class EanValidation {
    static final int TREE = 3;
    static final int TEN = 10;

    /**
     * Function Validate a given EAN-Code.
     *
     * @param eanCode Is a code EAN is a 13-digits barcode consisting of 12-digits data
     *                followed by a single-digit checksum.
     * @return bool Return true if the given EAN-Code is valid, otherwise false.
     */
    public Boolean validate(String eanCode) {
        int result;
        int calcChecksum;
        int positionLastNumber;
        int lastNumber;
        positionLastNumber = eanCode.length() - 1;
        lastNumber = Integer.parseInt(eanCode.substring(positionLastNumber));
        String twelveDigits = eanCode.substring(0, positionLastNumber);
        int[] digits;
        digits = twelveDigits.chars().map(c -> c -= '0').toArray();
        result = Arrays.stream(digits).map(d -> d % 2 == 0 ? d : d * TREE).sum();
        calcChecksum = (result % TEN == 0) ? 0 : TEN - (result % TEN);
        return calcChecksum == lastNumber;
    }
}
