package org.fundacionjala.coding.cynthia;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

 /**
  * Created by CynthiaTerrazas on 5/29/2017.
  */
public class ShortInnerTest {
    /**
     * this test is the more basic test.
     */
    @Test
    public void changeOneWord() {
        ShortInner inner = new ShortInner();
        assertEquals("hola", inner.result("hola"));
    }

    /**
     * this test is for test ons sentence with two words.
     */
    @Test
    public void changetwoshortWords() {
        ShortInner inner = new ShortInner();
        assertEquals("hola lia", inner.result("hola lia"));
    }

    /**
     * this test is for test one large word.
     */
    @Test
    public void changeOneLargeWord() {
        ShortInner inner = new ShortInner();
        assertEquals("ctoonneedr", inner.result("contenedor"));
    }

    /**
     * this test is for test a large sentence with several words.
     */
    @Test
    public void changeASentencesWithMoreWords() {
        ShortInner inner = new ShortInner();
        assertEquals("srot the inner ctonnet in dsnnieedcg", inner.result("sort the inner content in descending"));
    }
     /**
      * this test is for test a short sentence with  words.
      */
     @Test
     public void changeASentencesWithMoreWords2() {
         ShortInner inner = new ShortInner();
         assertEquals("I am", inner.result("I am"));
     }
}



