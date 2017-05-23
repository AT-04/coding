package org.fundacionjala.coding.abel;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by AbelBarrientos on 5/23/2017.
 */
public class SortInnerContent {

    private List<String> stringList;

    /**
     * The default constructor.
     */
    public SortInnerContent() {
        stringList = new ArrayList<>();
    }

    /**
     * This method is used to sort the inner content of a word.
     * @param word This is the word parameter to sort.
     * @return String This return the word sorted.
     */
    public String sort(String word) {
        char[] charArray = word.toCharArray();

        List<Character> charList = getInnerContent(word, charArray);

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(charArray[0]);
        for (Character character: charList) {
            stringBuffer.append(character);
        }
        stringBuffer.append(charArray[word.length() - 1]);

        return stringBuffer.toString();
    }

    /**
     * This method is used to obtain the inner content of a word.
     * @param word This is the word parameter.
     * @param charArray This is the array to extract characters.
     * @return List<Character> Returns a list containing all inner content chars.
     */
    private List<Character> getInnerContent(String word, char[] charArray) {
        List<Character> charList = new ArrayList<>();
        for (int i = 1; i < word.length() - 1; i++) {
            charList.add(charArray[i]);
        }
//        Arrays.sort(charArray, Collections.reverseOrder());
        Collections.sort(charList, Collections.reverseOrder());
        return charList;
    }

    /**
     * This method is used to get all the words of a sentence.
     * @param sentence This is the string parameter to get words.
     * @return List<String> This returns a list of words in a sentence.
     */
    public List<String> getWords(String sentence) {
        String[] words = sentence.split(" ");
        stringList.addAll(Arrays.asList(words));
        return stringList;
    }

    /**
     * This method sorts every word of the sentence.
     * @param sentence This is the string parameter to sort.
     * @return String This returns the sentence with spin words.
     */
    public String sortInnerContent(String sentence) {
        List<String> strList = getWords(sentence);
        StringJoiner stringJoiner = new StringJoiner(" ");
        strList.stream().forEach(string -> stringJoiner.add(sort(string)));
        return stringJoiner.toString();
    }
}
