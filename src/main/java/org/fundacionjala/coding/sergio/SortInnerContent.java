package org.fundacionjala.coding.sergio;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by SergioNavarro on 5/31/2017.
 */
public class SortInnerContent {


    public static String[] sortReverse(String sentence) {
        String[] cadenas = sentence.split(" ");
        for (String ele: cadenas) {
            if(ele.length()>3) {
                ele = SortInnerContent.sort(ele);
            }
        }
        return cadenas;
    }

    private static String sort(String ele) {
        String sorted1 = Stream.of(ele.substring(1, ele.length()-1))
        .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
        return String.join("", ele.substring(0, 1), sorted1, ele.substring(ele.length()-1, ele.length()));
    }


    /**private static void sort(String word) {
        Stream.of(word)
                .sorted(Comparator.reverseOrder());
    }
    /**return Stream.of(sentence.split(" "))
                .map(word -> (word.length() >= SIZE) ?SortInnerContent.sort(word.substring(1, word.length()-1).)
                .collect(Collectors.joining());**/

    }

    /**private static boolean validation(String sentence) {
        String[] cadenas = sentence.split(" ");
        for (String element : cadenas) {
            if(element.toUpperCase() == true) {
                return true;
            }

        }
        return true;
    }**/





