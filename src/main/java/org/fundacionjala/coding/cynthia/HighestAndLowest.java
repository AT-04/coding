package org.fundacionjala.coding.cynthia;

/**
 * Created by CynthiaTerrazas on 6/12/2017.
 */
public final class HighestAndLowest {

    /**
     * constructor.
     */
    private HighestAndLowest() {
    }

    /**
     * @param cadena number.
     * @return calculate value.
     */
    public static String calculated(String cadena) {
        String[] setNumbers = cadena.split(" ");
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        for (String word : setNumbers) {
            int numero = Integer.parseInt(word);
            if (numero >= mayor) {
                mayor = numero;
            }
            if (numero <= menor) {
                menor = numero;
            }
        }
        return String.format("%d %d", mayor, menor);
    }
}
