package org.fundacionjala.coding.cynthia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by CynthiaTerrazas on 5/30/2017.
 */
public class ShortInner {
    /**
     * this method build the correct sentence.
     * @param cadena is the enter to the method.
     * @return cadenaTotal is the final result.
     */
    public String result(String cadena) {
        StringBuilder cadenaTotal = new StringBuilder();
        String[] arrayCadena = cadena.split(" ");
        for (String word : arrayCadena) {
            cadenaTotal.append(" ");
            cadenaTotal.append(this.change(word));
        }
        return cadenaTotal.toString().trim();
    }

    /**
     * this method order and changed the string.
     * @param word is the enter to this method.
     * @return cadena with initial position and final position.
     */
    private String change(String word) {
        char ini = word.charAt(0);
        char fin = word.charAt(word.length() - 1);
        StringBuilder cadena = new StringBuilder();
        List<Character> lista = new ArrayList<>();
        for (int i = 1; i < word.length() - 1; i++) {
            lista.add(word.charAt(i));
        }
        Collections.sort(lista);
        for (char letra : lista) {
            cadena.append(letra);
        }
        return ini + cadena.reverse().toString() + fin;
    }
}
