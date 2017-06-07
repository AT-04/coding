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
    public int getCheckSum(String cadena) {
        int suma = 0;
        for (int i = 1; i < cadena.length(); i++) {
            if (i % 2 == 0) {
                int aux = Integer.parseInt(cadena.substring(i - 1, i));
                suma = suma + (aux * EVEN_POSITION);
            } else {
                int aux = Integer.parseInt(cadena.substring(i - 1, i));
                suma = suma + aux;
            }
        }
        return TEN_NUMBER - (suma % TEN_NUMBER);
    }

    /**
     * this method build the correct sentence.
     *
     * @param cad is the enter to the method.
     * @return true if the checksum is valid or false if not.
     */
    public boolean isValidEANCode(String cad) {
        return getCheckSum(cad) == Integer.parseInt(cad.substring(cad.length() - 1)) ? true : false;
    }
}
