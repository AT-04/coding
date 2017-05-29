package org.fundacionjala.coding.sergio_spin_words;

/**
 * Created by Sergio on 28/05/2017.
 */
public final class Spin_words {

    private static final int CONDITION = 5;

    /**
     * CONSTRUCTOR.
     */
    private Spin_words() {

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
