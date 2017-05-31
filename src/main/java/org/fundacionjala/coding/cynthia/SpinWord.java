package org.fundacionjala.coding.cynthia;


import java.util.StringJoiner;

/**
 * clase spin words.
 */
public class SpinWord {

    public static final int LIMIT = 5;
    /**
     * este metodo vuelca una cadena de las palabras que tienen mas de cinco caracteres.
     *
     * @param    sentencia sample parameter for a method
     * @return     cadena
     */

    public String result(String sentencia) {
        StringJoiner cadena = new StringJoiner(" ");
        String[] setWords = sentencia.split(" ");
        for (String word : setWords) {
            cadena.add(word.length() >= LIMIT ? new StringBuilder(word).reverse().toString() : word);
        }
        return cadena.toString();
    }
}
