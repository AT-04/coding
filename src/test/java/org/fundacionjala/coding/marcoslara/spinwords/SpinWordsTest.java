package org.fundacionjala.coding.marcoslara.spinwords;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Marcos Lara on 5/22/2017.
 */
public class SpinWordsTest {

    /**
     * This test proves that the result of spin spinning on an empty string is the same string.
     */
    @Test
    public void getSpinWordsOfAEmptyStringIsAEmptyString() {
        String word = "";
        assertEquals("", SpinWords.spinWords(word));
    }

    /**
     * This test proves that the result of spinning word on an short string (<=4 characters) is the same string.
     */
    @Test
    public void getSpinWordsOfAShortStringIsTheSameString() {
        String word = "abc";
        assertEquals("abc", SpinWords.spinWords(word));
    }

    /**
     * This test proves that the result of spinning word on an short string (<=4 characters) is the same string.
     */
    @Test
    public void getSpinWordsOfAStringWithTwoWords() {
        String word = "abc verify";
        assertEquals("abc yfirev", SpinWords.spinWords(word));
    }

    /**
     * This test proves the result of the spin words of the example string number one.
     */
    @Test
    public void getSpinWordsOfATheExampleStringNumberOne() {
        String word = "Hey fellow warriors";
        assertEquals("Hey wollef sroirraw", SpinWords.spinWords(word));
    }

    /**
     * This test proves the result of the spin words of the example string number two.
     */
    @Test
    public void getSpinWordsOfATheExampleStringNumberTwo() {
        String word = "This is a test";
        assertEquals("This is a test", SpinWords.spinWords(word));
    }

    /**
     * This test proves the result of the spin words of the example string number three.
     */
    @Test
    public void getSpinWordsOfATheExampleStringNumberThree() {
        String word = "This is another test";
        assertEquals("This is rehtona test", SpinWords.spinWords(word));
    }
}
