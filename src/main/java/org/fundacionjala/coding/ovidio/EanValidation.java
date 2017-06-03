package org.fundacionjala.coding.ovidio;

import java.util.Arrays;

/**
 * Created by OvidioMiranda on 6/2/2017.
 */
public class EanValidation {
    static final int TWO = 2;
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
        int calcChecksum;
        int lastNumber = Integer.parseInt(eanCode.substring(eanCode.length() - 1));
        String twelveDigits = eanCode.substring(0, eanCode.length() - 1);
        int[] digits = twelveDigits.chars().map(c -> c -= '0').toArray();
        int result = Arrays.stream(digits).map(d -> d % TWO == 0 ? d : d * TREE).sum();
        calcChecksum = (result % TEN == 0) ? 0 : TEN - (result % TEN);
        return calcChecksum == lastNumber;
    }

}

