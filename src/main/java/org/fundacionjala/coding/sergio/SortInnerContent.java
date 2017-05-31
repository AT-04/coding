package org.fundacionjala.coding.sergio;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by SergioNavarro on 5/31/2017.
 */
public class SortInnerContent {

    public static final int SIZE = 3;

    public static String sortReverse(String sentence) {
        return Stream.of(sentence.split(" "))
                .map(word -> (word.equals(null) || word.equals("")) ? null :"")
                .collect(Collectors.joining());

                }
                //.map(word-> (word == null || word == "") ? null : ""0);


        //return "hi all floks";
    }

    private static void sort(String element) {

    }
}
