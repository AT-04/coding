package main.java.org.fundacionjala.coding.yury;

/**
 * Created by YuryOrtuno on 5/23/2017.
 */
public class SpinWord {
    public static final int REVERSE_LENGTH = 5;

    /**
     * @param string sentence for test
     * @return result
     */
    public String invertedWords(String string) {
        String[] listWords = string.split(" ");
        for (int i = 0; i < listWords.length; i++) {
            if (listWords[1].length() > REVERSE_LENGTH) {
                listWords[1] = new StringBuilder(listWords[1]).reverse().toString();
            }
        }
        return String.join(" ", listWords);
    }
}
