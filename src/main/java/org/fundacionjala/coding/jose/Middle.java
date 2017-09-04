package org.fundacionjala.coding.jose;

/**
 * Created by JoseTorrez on 9/4/2017.
 * You are going to be given a word. Your job is to return the middle character of the word. If the word's length
 * is odd, return the middle character. If the word's length is even, return the middle 2 characters.
 */
public class Middle {

    /**
     * This method get the middle of a word.
     *
     * @param word String received.
     * @return subWord String.
     */
    public String getMiddle(String word) {
        String subWord = "";
        int length = word.length();
        int half = length / 2;
        if (length % 2 == 0) {
            subWord = word.substring(half - 1, half + 1);
        } else {
            subWord = word.substring(half, half + 1);
        }
        return subWord;
    }
}
