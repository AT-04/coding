package org.fundacionjala.coding.cynthia;

/**
 * Created by Cynthia on 05/06/2017.
 */
public class EanValidation {

    private static final int EVEN_POSITION = 3;
    private static final int TEN_NUMBER = 10;

    /**
     * this method build the correct sentence.
     *
     * @param cadena is the enter to the method.
     * @return checksum number.
     */
    public boolean isValidEANCode(String cadena) {
        int sum = 0;
        for (int i = 1; i < cadena.length(); i++) {
            int aux = Integer.parseInt(cadena.substring(i - 1, i));
            sum += i % 2 == 0 ? aux * EVEN_POSITION : aux;
        }
        int checkSum = TEN_NUMBER - (sum % TEN_NUMBER);
        return checkSum == Integer.parseInt(cadena.substring(cadena.length() - 1));
    }
}
