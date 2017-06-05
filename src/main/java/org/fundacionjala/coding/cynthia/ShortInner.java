package org.fundacionjala.coding.cynthia;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by CynthiaTerrazas on 5/30/2017.
 */
public class ShortInner {
    /**
     * this method build the correct sentence.
     *
     * @param cadena is the enter to the method.
     * @return cadenaTotal is the final result.
     */
    public String result(String cadena) {
        StringJoiner cadenaTotal = new StringJoiner(" ");
        String[] arrayCadena = cadena.split(" ");
        for (String word : arrayCadena) {
            cadenaTotal.add(this.change(word));
        }
        return cadenaTotal.toString().trim();
    }

    /**
     * this method order and changed the string.
     *
     * @param word is the enter to this method.
     * @return cadena with initial position and final position.
     */
    private String change(String word) {
        if (word.length() == 1) {
            return word;
        } else {
            String ini = word.substring(0, 1);
            String fin = word.substring(word.length() - 1);
            StringBuilder cadena = new StringBuilder();
            List<String> lista = Arrays.asList(word.substring(1, word.length() - 1).split(""));
            Collections.sort(lista);
            for (String letra : lista) {
                cadena.append(letra);
            }
            return String.join("", ini, cadena.reverse().toString(), fin);
        }
    }
}

