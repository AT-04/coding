package org.fundacionjala.coding.ovidio;

import java.util.HashMap;
import java.util.Map;

/**
 * Your task is to write function toLeetSpeak that converts a regular english sentence to Leetspeak.
 * More about LeetSpeak You can read at wiki -> https://en.wikipedia.org/wiki/Leet
 * Consider only uppercase letters (no lowercase letters, no numbers) and spaces.
 * For example:
 * toLeetSpeak("LEET") returns "1337"
 * {
 * A : '@',
 * B : '8',
 * C : '(',
 * D : 'D',
 * E : '3',
 * F : 'F',
 * G : '6',
 * H : '#',
 * I : '!',
 * J : 'J',
 * K : 'K',
 * L : '1',
 * M : 'M',
 * N : 'N',
 * O : '0',
 * P : 'P',
 * Q : 'Q',
 * R : 'R',
 * S : '$',
 * T : '7',
 * U : 'U',
 * V : 'V',
 * W : 'W',
 * X : 'X',
 * Y : 'Y',
 * Z : '2'
 */
public class ToLeetSpeak {

    /**
     *
     */
    private static final Map<Character, Character> ALPHABET = new HashMap<Character, Character>() {
        {
            put(' ', ' ');
            put('A', '@');
            put('B', '8');
            put('C', '(');
            put('D', 'D');
            put('E', '3');
            put('F', 'F');
            put('G', '6');
            put('H', '#');
            put('I', '!');
            put('J', 'J');
            put('K', 'K');
            put('L', '1');
            put('M', 'M');
            put('N', 'N');
            put('O', '0');
            put('P', 'P');
            put('Q', 'Q');
            put('R', 'R');
            put('S', '$');
            put('T', '7');
            put('U', 'U');
            put('V', 'V');
            put('W', 'W');
            put('X', 'X');
            put('Y', 'Y');
            put('Z', '2');

        }
    };

    /**
     * Method for translation.
     *
     * @param speak Receive the sentence.
     * @return String the translation of speak.
     */
    String toLeetSpeak(final String speak) {
        StringBuilder translation = new StringBuilder();
        for (Character a : speak.replaceAll("^[^A-Z]", "").toCharArray()) {
            translation.append(ALPHABET.get(a) == null ? "" : ALPHABET.get(a));
        }
        return translation.toString();
    }
}
