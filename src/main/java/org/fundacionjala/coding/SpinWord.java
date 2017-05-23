package org.fundacionjala.coding;

import java.util.StringJoiner;

/**
 * Created by MarcandeaCabrera on 5/19/2017.
 */

public class SpinWord {
    private String cadena;
    private String[] auxiliarWord;
    private StringJoiner stringJoiner;
    public static final int LENGTH_REVERSE = 5;

    /**
     * The following method is the constructor.
     *
     * @param cadena send for make the operation.
     */
    public SpinWord(String cadena) {
        this.cadena = cadena;
        stringJoiner = new StringJoiner(" ");
    }

    /**
     * Reverse the words.
     *
     * @param string return reverse word.
     * @return string
     */
    public String reverse(String string) {
        StringBuffer stringBuffer = new StringBuffer(string);
        stringBuffer.reverse();
        return stringBuffer.toString();
    }

    /**
     * Call process.
     *
     * @return string
     */
    public String reverseProcess() {
        auxiliarWord = cadena.split(" ");
        return reverseWord();
    }

    /**
     * Reverse Word major to five character.
     *
     * @return string
     */
    public String reverseWord() {
        for (String word : auxiliarWord) {
            if (word.length() > LENGTH_REVERSE) {
                word = reverse(word);
                stringJoiner.add(word);
            } else {
                stringJoiner.add(word);
            }
        }
        return stringJoiner.toString();
    }
}
