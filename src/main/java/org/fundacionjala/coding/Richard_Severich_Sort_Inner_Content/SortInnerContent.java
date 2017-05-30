package org.fundacionjala.coding.Richard_Severich_Sort_Inner_Content;

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
     *
     * @param cad This is the chain to which we will change its internal content to a descending order.
     * @return Returns the string to which we will change its internal contents to a descending order.
     */

    public String sortInner(String cad) {

        String[] partsWords;
        partsWords = cad.split(" ");
        String cadDescending;
        StringJoiner stringJoiner = new StringJoiner(" ");
        String word;
        for (int i = 0; i < partsWords.length; i++) {

            if (partsWords.length < THREE) {
                word = partsWords[i];
            } else {
                cadDescending = partsWords[i].substring(1, partsWords[i].length() - 1);
                cadDescending = Stream.of(cadDescending.split("")).sorted(Comparator.reverseOrder())
                        .collect(Collectors.joining());
                word = String.join("", String.valueOf(partsWords[i].charAt(0)), cadDescending,
                        String.valueOf(partsWords[i].charAt(partsWords[i].length() - 1)));
            }
            stringJoiner.add(word);
        }
        return stringJoiner.toString();
    }
}
