package org.fundacionjala.coding.abel;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by AbelBarrientos on 5/22/2017.
 */
public class SpinWords {

    public static final int REVERSE_LENGTH = 5;

    /**
     * This method is used to spin the sentence, where words with length above
     * five letters are reversed.
     * @param sentence This is the string parameter to spin.
     * @return String This returns the sentence with spin words.
     */
    public String spinWords(String sentence) {
        return Stream.of(sentence.split(" "))
                .map(word -> (word.length() >= REVERSE_LENGTH) ? new StringBuilder(word).reverse().toString() : word)
                .collect(Collectors.joining(" "));

    }
}
