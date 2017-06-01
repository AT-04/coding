package org.fundacionjala.coding;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by MarcandeaCabrera on 5/19/2017.
 */
public class SpinWordTest {

    /**
     *Verify words less than or equal to five characters.
     */
    @Test
    public void wordLessOrEqualsThanFiveCharacters() {
        SpinWord cad = new SpinWord();
        assertEquals("Hola mundo", cad.reverseWord("Hola mundo"));
    }

    /**
     *Verify words smaller or longer or equals than five characters.
     */
    @Test
    public void wordLessEqualsOrLongerThanFiveCharacters() {
        SpinWord cad = new SpinWord();
        assertEquals("Hola sodnum aednacram mundos", cad.reverseWord("Hola mundos marcandea sodnum"));
    }


}
