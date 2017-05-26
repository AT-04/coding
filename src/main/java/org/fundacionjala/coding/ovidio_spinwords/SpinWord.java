package org.fundacionjala.coding.ovidio_spinwords;

import java.util.StringJoiner;

/**
 * Created by OvidioMiranda on 5/26/2017.
 */

public class SpinWord {

    private String sentence;


    /**
     * Constructor for objects of SpinWord.
     */
    public SpinWord() {
        this("");
    }

    /**
     * Constructor for objects of SpinWord with a parameter.
     *
     * @param sentence Is a word.
     */
    public SpinWord(String sentence) {
        this.sentence = sentence;
    }


    /**
     * Function that takes in a string and returns the same string
     * but with all five or more letter words reversed.
     *
     * @return returns the same string but with all five or more letter words reversed .
     */
    public String spinWords() {
        final Integer maxLetters = 5;
        StringJoiner aux = new StringJoiner(" ");
        String[] wordsArray = sentence.split(" ");
        for (String word : wordsArray) {
            aux = word.length() >= maxLetters ? aux.add(new StringBuilder(word).reverse()) : aux.add(word);
        }
        return aux.toString();
    }


}