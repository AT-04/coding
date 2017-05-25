package org.fundacionjala.coding.abel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by AbelBarrientos on 5/22/2017.
 */
public class SpinWords {

    public static final int REVERSE_LENGTH = 5;
    private List<String> stringList;

    /**
     * The default constructor.
     */
    public SpinWords() {
        stringList = new ArrayList<>();
    }

    /**
     * This method is used to reverse the content of a string.
     * @param string This is the string parameter to reverse method,
     * @return String This returns the reverse of a string.
     */
    @Deprecated
    public String reverse(String string) {
        StringBuffer stringBuffer = new StringBuffer(string).reverse();
        return stringBuffer.toString();
    }

    /**
     * This method is used to get all the words of a sentence.
     * @param sentence This is the string parameter to get words.
     * @return List<String> This returns a list of words in a sentence.
     */
    @Deprecated
    public List<String> getWords(String sentence) {
        String[] words = sentence.split(" ");
        stringList.addAll(Arrays.asList(words));
        return stringList;
    }

    /**
     * This method is used to spin the sentence, where words with length above
     * five letters are reversed.
     * @param sentence This is the string parameter to spin.
     * @return String This returns the sentence with spin words.
     */
    public String spinWords(String sentence) {
        return Stream.of(sentence.split(" "))
                .map(word -> (word.length() >= REVERSE_LENGTH) ? new StringBuilder(word).reverse().toString() : word)
                .collect(Collectors.joining(" "));

    }
}
