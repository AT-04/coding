package org.fundacionjala.coding.cynthia;

/**
 * You are going to be given a word. Your job is to return the middle character of the word.
 * If the word's length is odd, return the middle character.
 * If the word's length is even, return the middle 2 characters.
 *
 * <p>
 * #Examples:
 * <p>
 * Kata.getMiddle("test") should return "es"
 * <p>
 * Kata.getMiddle("testing") should return "t"
 * <p>
 * Kata.getMiddle("middle") should return "dd"
 * <p>
 * Kata.getMiddle("A") should return "A"
 * <p>
 */

public class MiddleCharacter {

    /**
     * this method is for get the middle character.
     *
     * @param word String.
     * @return the middle character.
     */
    public String getMiddle(String word) {
        int middle = word.length() / 2;
        return word.substring(middle - (word.length() % 2 == 0 ? 1 : 0), middle + 1);
    }
}

