package org.fundacionjala.coding.sergio;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by SergioNavarro on 5/31/2017.
 */
public final class SortInnerContent {
    private static final int CONDITION = 3;

    /**
     *
     */
    private SortInnerContent() {
    }
    /**
     *
     * @param sentence Imput sentence.
     * @return the sentence with inner.
     */
    public static String reverseSort(String sentence) {
        return Stream.of(sentence.split(" "))
                .map(word -> word.length() > CONDITION ? SortInnerContent.sort(word) : word)
                .collect(Collectors.joining(" "));
    }

    /**
     *
     * @param word to sort.
     * @return inner sort word.
     */
    private static String sort(String word) {
        String sorted = Stream.of(word.substring(1, (word.length() - 1)).split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
        return String.join("", word.substring(0, 1), sorted, word.substring(word.length() - 1, word.length()));
    }
}






