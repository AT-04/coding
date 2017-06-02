package org.fundacionjala.coding.richardseverich;

import java.util.Comparator;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by RichardSeverich on 5/23/2017.
 */
public class SortInnerContent {

    public static final int THREE = 3;

    /**
     * This method descrambles the inner contents of a string.
     * @param cad This is the chain to which we will change its internal content to a descending order.
     * @return Returns the string to which we will change its internal contents to a descending order.
     */

    public String sortInner(String cad) {

        String[] partsWords;
        partsWords = cad.split(" ");
        String cadDescending;
        StringJoiner stringJoiner = new StringJoiner(" ");
        String word;
        for (String itemWord : partsWords) {
            if (partsWords.length < THREE) {
                word = itemWord;
            } else {
                cadDescending = itemWord.substring(1, itemWord.length() - 1);
                cadDescending = Stream.of(cadDescending.split("")).sorted(Comparator.reverseOrder())
                        .collect(Collectors.joining());
                word = String.join("", itemWord.substring(0, 1), cadDescending,
                        itemWord.substring(itemWord.length() - 1));
            }
            stringJoiner.add(word);
        }
        return stringJoiner.toString();
    }
}
