package main.java.org.fundacionjala.coding.yury;

import java.util.Arrays;


/**
 * Created by YuryOrtuno on 5/25/2017.
 */
public class InnerContent {

    /**
     * @param string content the sentence for sort inner content
     * @return the sentece whit Sort Inner Content
     */
    public String innerWord(String string) {
        String[] splitWords = string.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < splitWords.length; i++) {
            char[] character = splitWords[i].substring(1, splitWords[i].length() - 1).toCharArray();
            Arrays.sort(character);
            stringBuilder.append(splitWords[i].charAt(splitWords[i].length() - 1));
            stringBuilder.append(character);
            stringBuilder.append(splitWords[i].charAt(0));
            splitWords[i] = stringBuilder.reverse().toString();
            stringBuilder.delete(0, stringBuilder.length());
        }
        return String.join(" ", splitWords);

    }
}
