package org.fundacionjala.coding.jose;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by JoseTorrez on 6/6/2017.
 */
public class SortInner {
    /**
     * This method sorted a single word.
     * @param word This is the word parameter to sort.
     * @return String This return the word sorted.
     */
    public String sort(String word) {
        String innerDescSorted = Stream.of(word.substring(1, word.length() - 1)
                .split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
        return String.join("", word.substring(0, 1), innerDescSorted, word.substring(word.length() - 1));
    }

    /**
     * This method sorted sentences.
     * @param sentence This is the string parameter to sort.
     * @return String This returns the sentence sorted.
     */
    public String innerContent(String sentence) {
        return Stream.of(sentence.split(" "))
                .map(word -> word.length() <= 2 ? word : sort(word))
                .collect(Collectors.joining(" "));
    }
}
