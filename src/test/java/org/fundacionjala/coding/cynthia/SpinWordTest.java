package org.fundacionjala.coding.cynthia;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by CynthiaTerrazas on 5/19/2017.
 */
public class SpinWordTest {

    /**
     * este test comprueba si se puede volcar una palabra con mas de cinco caracteres.
     */
    @Test
    public void volcarOneWordOfMoreThan5Caracters() {
        SpinWord spin = new SpinWord();
        assertEquals("aihtnyc", spin.result("cynthia"));
    }

    /**
     * este test comprueba que una palabra de menos de 4 letras no debe ser volcada.
     */
    @Test
    public void volcarOneOfCadenaOfLessThan5Caracters() {
        SpinWord spin = new SpinWord();
        assertEquals("jala", spin.result("jala"));
    }

    /**
     * este test comprueba que una cadena con dos palabras deben ser volcadas solo las palabras mayores a 5.
     */
    @Test
    public void volcarOneCadenaOfWordsWithTwoWords() {
        SpinWord spin = new SpinWord();
        assertEquals("hola aihtnyc", spin.result("hola cynthia"));
    }

    /**
     * este test comprueba que una cadena con tres palabras deben ser volcadas solo las palabras mayores a 5.
     */
    @Test
    public void volcarOneCadenaOfWordsWithThreeWords() {
        SpinWord spin = new SpinWord();
        assertEquals("noicadnuf jala oiraceb", spin.result("fundacion jala becario"));
    }

}
