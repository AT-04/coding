package org.fundacionjala.coding.yury;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by YuryOrtuno on 5/23/2017.
 */
public class SpinWord {
    public static final int REVERSE_LENGTH = 5;
    private List<String> wordList;

    /**
     * The default constructor.
     */
    public SpinWord() {
        wordList = new ArrayList<>();
    }


    /**
     * This method inverted a word.
     *
     * @param string word
     * @return word inverted
     */
    public String reverse(String string) {
        StringBuffer buffer = new StringBuffer(string);
        return buffer.reverse().toString();
    }

    /**
     * @param string word
     */
    public void setWords(String string) {
        String[] words = string.split(" ");
        for (String word : words) {
            wordList.add(word);
        }
    }

    /**
     * @param string sentence word
     * @return string word
     */
    public String invertedWords(String string) {
        setWords(string);
//        String words = "";
        StringBuffer words = new StringBuffer();
        for (int i = 0; i < wordList.size(); i++) {

            if (wordList.get(i).length() > REVERSE_LENGTH) {
                words.append(reverse(wordList.get(i)));
            } else {
                words.append(wordList.get(i));
            }
            if (i != wordList.size() - 1) {
                words.append(" ");
            }

        }

        return words.toString();
    }
}
