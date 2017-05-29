package org.fundacionjala.coding.sergio_spin_words;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sergio on 28/05/2017.
 */
public class spin_wordsTest {
    @Test
    public void spinOneWord() {
        String sentence = "warrior";

        assertEquals("roirraw", Spin_words.spinWord(sentence));
    }
    @Test
    public void sameWordsIsWordsLengthIsMinorToFive() {
        String sentence = "It is a Test";

        assertEquals("It is a Test", Spin_words.spinWord(sentence));
    }
    @Test
    public void sentenceIsEmptyReturnEmpty() {
        String sentence = "";

        assertEquals("", Spin_words.spinWord(sentence));
    }
    @Test
    public void sentenceHaveASpaceAtTheBeginningReturnWithoutSpace() {
        String sentence = " Sentence with a space";

        assertEquals("ecnetneS with a ecaps", Spin_words.spinWord(sentence));
    }
}