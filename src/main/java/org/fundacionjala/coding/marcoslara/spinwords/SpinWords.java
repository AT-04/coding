package org.fundacionjala.coding.marcoslara.spinwords;

/**
 * Created by Marcos Lara on 5/22/2017.
 */
public final class SpinWords {

    private static final int SHORT_STRING_LENGTH = 4;

    /**
     * Private constructor required. These kind of classes are more like tools/utilities than being meant for objects.
     */
    private SpinWords() {

    }

    /**
     * Is the main method that makes the operations for spin the words.
     *
     * @param sentence Is the original sentence.
     * @return The concatenation result
     */
    public static String spinWords(String sentence) {
        String[] splitWords = sentence.split(" ");
        for (int i = 0; i < splitWords.length; i++) {
            if (splitWords[i].length() > SHORT_STRING_LENGTH) {
                splitWords[i] = new StringBuilder(splitWords[i]).reverse().toString();
            }
        }
        return String.join(" ", splitWords);
    }
}
