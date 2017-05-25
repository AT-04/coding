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
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        for (String word : splitWords) {
            char[] character = word.substring(1, word.length() - 1).toCharArray();
            Arrays.sort(character);
            if (i < splitWords.length - 1) {
                stringBuffer.append(" ");
            }
            stringBuffer.append(word.charAt(word.length() - 1));
            stringBuffer.append(character);
            stringBuffer.append(word.charAt(0));
            splitWords[i] = stringBuffer.reverse().toString();
            i++;
            stringBuffer.delete(0, stringBuffer.length());
        }

        for (String sentence : splitWords) {
            stringBuffer.append(sentence);
        }
        return stringBuffer.toString();

    }
}
