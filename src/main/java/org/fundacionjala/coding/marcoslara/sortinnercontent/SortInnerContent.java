package org.fundacionjala.coding.marcoslara.sortinnercontent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Marcos Lara on 5/23/2017.
 */
public final class SortInnerContent {
    private static final int MINIMUM_STRING_LENGTH = 3;

    /**
     * Constructor of the class.
     */
    private SortInnerContent() {
        
    }

    /**
     * The main method that does the transformation of the string.
     *
     * @return The sort inner content as a String
     */
    public static String getSortInnerContent(String words) {
        StringBuffer resultWords = new StringBuffer();
        String[] splitWords = words.split(" ");
        for (int i = 0; i < splitWords.length; i++) {
            if (splitWords[i].length() <= MINIMUM_STRING_LENGTH) {
                resultWords.append(splitWords[i]);
            } else {
                resultWords.append(splitWords[i].charAt(0));
                resultWords.append(getDescendingOrder(splitWords[i].substring(1, splitWords[i].length() - 1)));
                resultWords.append(splitWords[i].charAt(splitWords[i].length() - 1));
            }
            if (i + 1 < splitWords.length) {
                resultWords.append(" ");
            }
        }
        return resultWords.toString();
    }

    /**
     * This method performs the descending order of a string.
     *
     * @param substring The substring to be ordered in descending order
     * @return The substring ordered in descending order
     */
    private static String getDescendingOrder(String substring) {
        char[] charArray = substring.toCharArray();
        List<Character> listCharacters = new ArrayList<>();
        for (char c : charArray) {
            listCharacters.add(c);
        }
        Collections.sort(listCharacters, Collections.reverseOrder());
        return getStringFromList(listCharacters);
    }

    /**
     * This method converts a list of characters to a String.
     *
     * @param listCharacters List containing the characters to be concatenated in a single string.
     * @return The concatenated string.
     */
    private static String getStringFromList(List<Character> listCharacters) {
        StringBuilder stringConstructed = new StringBuilder(listCharacters.size());
        for (Character character : listCharacters) {
            stringConstructed.append(character);
        }
        return stringConstructed.toString();
    }
}
