package org.fundacionjala.coding.ovidio_sortInnerContent;

import java.util.Arrays;
import java.util.Collections;
import java.util.StringJoiner;

/**
 * Created by OvidioMiranda on 5/26/2017.
 */
public class SortInnerContent {

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
            newSentence.add(sorTheInnerContent(word));
        }
        return newSentence.toString();
    }

    /**
     * Function the sort the inner content of only word of  in descending order without
     * first and last char.
     *
     * @param word Is a words.
     * @return returns the string but sort the inner content of every word in descending order.
     */
    public String sorTheInnerContent(String word) {
        final int positionLastLetter = word.length() - 1;
        final String firstLetter = word.substring(0, 1);
        final String lastLetter = word.substring(positionLastLetter);
        StringBuilder newString = new StringBuilder(firstLetter);
        if (positionLastLetter > 0) {
            String[] wordDescendingOrder = word.substring(1, positionLastLetter).split("");
            Arrays.sort(wordDescendingOrder, Collections.reverseOrder());
            newString.append(String.join("", wordDescendingOrder)).append(lastLetter);
        }
        return newString.toString();
    }


}

