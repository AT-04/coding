package org.fundacionjala.coding.richard;

import java.util.Comparator;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by RichardSeverich on 5/23/2017.
 */
public class SortInnerContent {

    private static final int THREE = 3;

    /**
     * @param cad This is the chain to which we will change its internal content to a descending order.
     * @return Returns the string to which we will change its internal contents to a descending order.
     */
    public String sortInner(String cad) {
        String[] partsWords = cad.split(" ");
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (String itemWord : partsWords) {
            stringJoiner.add(partsWords.length < THREE ? itemWord : sortDescInnerContent(itemWord));
        }
        return stringJoiner.toString();
    }

    /**
     * @param itemWord This is the chain to which we will change content to a descending order.
     * @return Returns the changed string in descending order.
     */
    private String sortDescInnerContent(String itemWord) {
        String cadDescending = Stream.of(itemWord.substring(1, itemWord.length() - 1).split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
        return String.join("", itemWord.substring(0, 1), cadDescending,
                itemWord.substring(itemWord.length() - 1));
    }
}
