package org.fundacionjala.coding.Jose;


/**
 * Created by JoseTorrez on 5/19/2017.
 */
public class Word {


    public static final int LENGTH = 5;

    /**
     * This method is used to spin the sentence, where words with length above
     * five letters are reversed.
     *
     * @param sentence This is the string parameter to spin.
     * @return String This returns the sentence with spin words.
     */
    public String words(String sentence) {
        String[] stringSentence = sentence.trim().split(" ");
        for (int i = 0; i < stringSentence.length; i++) {
            if (stringSentence[i].length() >= LENGTH) {
                stringSentence[i] = new StringBuilder(stringSentence[i]).reverse().toString();
            }
        }
        return String.join(" ", stringSentence);
    }

}

