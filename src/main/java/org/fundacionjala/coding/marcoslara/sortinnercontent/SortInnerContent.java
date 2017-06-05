package org.fundacionjala.coding.marcoslara.sortinnercontent;

import java.util.Comparator;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Marcos Lara on 5/23/2017.
 */
public final class SortInnerContent {
    private static final int MINIMUM_STRING_LENGTH = 3;

    /**
     * Private constructor required. These kind of classes are more like tools/utilities than being meant for objects.
     */
    private SortInnerContent() {

    }

    /**
     * The main method that does the transformation of the string.
     *
     * @param sentence The original sentence.
     * @return The sort inner content as a String.
     */
    public static String sortInnerContent(String sentence) {
        String[] splitWords = sentence.split(" ");
        StringJoiner innerContent = new StringJoiner(" ");
        for (String splitWord : splitWords) {
            innerContent.add(splitWord.length() > MINIMUM_STRING_LENGTH ? descendingOrder(splitWord) : splitWord);
        }
        return innerContent.toString();
    }

    /**
     * Method that process a single word.
     *
     * @param splitWord Is the original word.
     * @return The inner word sorted in descending order.
     */
    private static String descendingOrder(String splitWord) {
        String descendingOrder = Stream.of(splitWord.substring(1, splitWord.length() - 1).split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
        return splitWord.replace(splitWord.subSequence(1, splitWord.length() - 1),
                descendingOrder.subSequence(0, descendingOrder.length()));
    }
}
