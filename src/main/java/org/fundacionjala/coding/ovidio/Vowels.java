package org.fundacionjala.coding.ovidio;

import java.util.ArrayList;

/**
 * Created by Simon on 06/09/2017.
 */
public class Vowels {
    /**
     * get the number of vowels.
     *
     * @param str word.
     * @return count of vowels.
     */
    public int getCount(String str) {
        int vowelsCount = 0;
        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        for (char letter : str.toLowerCase().toCharArray()) {
            if (vowels.contains(letter)) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
