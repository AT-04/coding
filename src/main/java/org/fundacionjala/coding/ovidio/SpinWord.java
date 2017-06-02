package org.fundacionjala.coding.ovidio_spinwords;

import java.util.StringJoiner;


/**
 * Created by OvidioMiranda on 5/19/2017.
 */
public class SpinWord {

    /**
     * Function that takes in a string and returns the same string
     * but with all five or more letter words reversed.
     *
     * @param sentence Is a sentence with words.
     * @return returns the same string but with all five or more letter words reversed .
     */
    public String spinWords(String sentence) {
        final int maxLetters = 5;
        StringJoiner newSentence = new StringJoiner(" ");
        String[] wordsArray = sentence.split(" ");
        for (String word : wordsArray) {
            newSentence.add(word.length() >= maxLetters ? new StringBuilder(word).reverse() : word);
        }
        return newSentence.toString();
    }

}
