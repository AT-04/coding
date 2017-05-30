package org.fundacionjala.coding.sergio;

/**
 * Created by Sergio on 28/05/2017.
 */
public final class SpinWords {

    private static final int CONDITION = 5;

    /**
     * CONSTRUCTOR.
     */
    private SpinWords() {

    }

    /**
     *
     * @param sentence IS THE SENTENCE ENTRY.
     * @return THE SENTENCE WITH WORD > 5 SPINNED.
     */

    public static String spinWord(String sentence) {
        String[] stringWords = sentence.trim().split(" ");
        for (int i = 0; i < stringWords.length; i++) {
            if (stringWords[i].length() >= CONDITION) {
                stringWords[i] = new StringBuilder(stringWords[i]).reverse().toString();
            }
        }
        return String.join(" ", stringWords);
    }
}
