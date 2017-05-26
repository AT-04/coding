package org.fundacionjala.coding.Jose;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by JoseTorrez on 5/19/2017.
 */
public class Word {


        public static final int REVERSE_LENGTH = 5;

        /**
         * The default constructor.
         */
        public Word() {
        }

        /**
         * This method is used to spin the sentence, where words with length above
         * five letters are reversed.
         * @param sentence This is the string parameter to spin.
         * @return String This returns the sentence with spin words.
         */
        public String Words (String sentence) {
            return Stream.of(sentence.split(" "))
                    .map(word -> (word.length() >= REVERSE_LENGTH) ? new StringBuilder(word).reverse().toString() : word)
                    .collect(Collectors.joining(" "));

        }

}
