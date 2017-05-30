package org.fundacionjala.coding.sergio;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Sergio on 28/05/2017.
 */
public class SpinWordsTest {
    /**
     *
     */
    @Test
    public void spinOneWord() {
        String sentence = "warrior";

        assertEquals("roirraw", SpinWords.spinWord(sentence));
    }

    /**
     *
     */
    @Test
    public void sameWordsIsWordsLengthIsMinorToFive() {
        String sentence = "It is a Test";

        assertEquals("It is a Test", SpinWords.spinWord(sentence));
    }

    /**
     *
     */
    @Test
    public void sentenceIsEmptyReturnEmpty() {
        String sentence = "";

        assertEquals("", SpinWords.spinWord(sentence));
    }

    /**
     *
     */
    @Test
    public void sentenceHaveASpaceAtTheBeginningReturnWithoutSpace() {
        String sentence = " Sentence with a space";

        assertEquals("ecnetneS with a ecaps", SpinWords.spinWord(sentence));
    }
}
