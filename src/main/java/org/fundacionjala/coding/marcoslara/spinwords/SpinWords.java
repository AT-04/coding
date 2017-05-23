package org.fundacionjala.coding.marcoslara.spinwords;

/**
 * Created by Marcos Lara on 5/22/2017.
 */
public class SpinWords {

    private String word;
    private static final int SHORT_STRING_LENGTH = 4;

    /**
     * Overloaded constructor.
     *
     * @param word is the main string for operations.
     */
    public SpinWords(String word) {
        this.word = word;
    }

    /**
     * Is the main method that makes the operations for spin the words.
     *
     * @return The concatenation result
     */
    public String getSpinWords() {
        StringBuffer spinWords = new StringBuffer();
        String[] splitWords = word.split(" ");
        for (int i = 0; i < splitWords.length; i++) {
            if (splitWords[i].length() <= SHORT_STRING_LENGTH) {
                spinWords.append(splitWords[i]);
            } else {
                spinWords.append(invertString(splitWords[i]));
            }
            if (i + 1 < splitWords.length) {
                spinWords.append(" ");
            }
        }
        return spinWords.toString();
    }

    /**
     * This method is responsible for inverting a string.
     *
     * @param word It receives the string parameter to which the investment should be made.
     * @return The inverted string is returned
     */
    public String invertString(String word) {
        StringBuilder invertedWord = new StringBuilder(word);
        invertedWord = invertedWord.reverse();
        return invertedWord.toString();
    }
}
