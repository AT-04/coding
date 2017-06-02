package org.fundacionjala.coding.ovidio;

import java.util.Arrays;
import java.util.Collections;
import java.util.StringJoiner;

/**
 * Created by OvidioMiranda on 5/26/2017.
 */
public class SortInnerContent {
    private static final int THREE = 3;

    /**
     * Function the sort the inner content of every word of a string in descending
     * order The inner content is the content of a word without first and last char.
     *
     * @param sentence Is a sentence with words.
     * @return returns the string but sort the inner content of every word in descending order.
     */
    public String sort(String sentence) {

        StringJoiner newSentence = new StringJoiner(" ");
        String[] wordsArray = sentence.split(" ");
        for (String word : wordsArray) {
            int wordLength = word.length();
            newSentence.add(wordLength > THREE ? sorTheInnerContent(word, wordLength) : word);
        }
        return newSentence.toString();
    }

    /**
     * Function the sort the inner content of only word of  in descending order without
     * first and last char.
     * @param word Is a words.
     * @param wordLength the string but sort the inner content
     * @return return the string but sort the inner content
     * of every word in descending order.
     */
    public String sorTheInnerContent(String word, int wordLength) {
        int positionLastLetter = wordLength - 1;
        String firstLetter = word.substring(0, 1);
        String lastLetter = word.substring(positionLastLetter);
        String[] wordDescendingOrder = word.substring(1, positionLastLetter).split("");
        Arrays.sort(wordDescendingOrder, Collections.reverseOrder());
        String middleLetters = String.join("", wordDescendingOrder);
        return String.join("", firstLetter, middleLetters, lastLetter);
    }
}

