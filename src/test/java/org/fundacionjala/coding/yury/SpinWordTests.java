package test.java.org.fundacionjala.coding.yury;

import main.java.org.fundacionjala.coding.yury.SpinWord;
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
    public void theWordsMost5Inverted() {
        SpinWord spinWord = new SpinWord();
        assertEquals("hello sdlrow new", spinWord.invertedWords("hello worlds new"));
    }


}
