package org.fundacionjala.coding.abel;


import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by AbelBarrientos on 5/23/2017.
 */
public class SortInnerContent {

    /**
     * This method is used to sort the inner content of a word.
     * @param word This is the word parameter to sort.
     * @return String This return the word sorted.
     */
    public String sort(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(word.charAt(0));
        word.substring(1, word.length() - 1)
                .chars()
                .mapToObj(e -> (char) e)
                .sorted(Collections.reverseOrder())
                .forEach(character -> stringBuilder.append(character));
        stringBuilder.append(word.charAt(word.length() - 1));
        return stringBuilder.toString();
    }

    /**
     * This method sorts every word of the sentence.
     * @param sentence This is the string parameter to sort.
     * @return String This returns the sentence with spin words.
     */
    public String sortInnerContent(String sentence) {
        return Stream.of(sentence.split(" "))
                .map(word -> sort(word))
                .collect(Collectors.joining(" "));
    }
}
