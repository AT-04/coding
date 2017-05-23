package org.fundacionjala.coding.yury;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by YuryOrtuno on 5/23/2017.
 */
public class SpinWordTests {


    /**
     *
     */
    @Test
    public void aSingleReverse() {
        SpinWord spinWord = new SpinWord();
        assertEquals("sdlrow", spinWord.reverse("worlds"));
    }

    /**
     *
     */
    @Test
    public void theWordsMost5Inverted() {
        SpinWord spinWord = new SpinWord();
        assertEquals("hello sdlrow new", spinWord.invertedWords("hello worlds new"));
    }


}
