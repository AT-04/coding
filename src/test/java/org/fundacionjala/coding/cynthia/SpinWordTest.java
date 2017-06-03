package org.fundacionjala.coding.cynthia;

import org.junit.Test;

import static org.fundacionjala.coding.cynthia.SpinWord.result;
import static org.junit.Assert.assertEquals;

/**
 * Created by CynthiaTerrazas on 5/19/2017.
 */
public class SpinWordTest {

    /**
     * este test comprueba si se puede volcar una palabra con mas de cinco caracteres.
     */
    @Test
    public void volcarOneWordOfMoreThan5Caracters() {
        assertEquals("aihtnyc", result("cynthia"));
    }

    /**
     * este test comprueba que una palabra de menos de 4 letras no debe ser volcada.
     */
    @Test
    public void volcarOneOfCadenaOfLessThan5Caracters() {
        assertEquals("jala", result("jala"));
    }

    /**
     * este test comprueba que una cadena con dos palabras deben ser volcadas solo las palabras mayores a 5.
     */
    @Test
    public void volcarOneCadenaOfWordsWithTwoWords() {
        assertEquals("hola aihtnyc", result("hola cynthia"));
    }

    /**
     * este test comprueba que una cadena con tres palabras deben ser volcadas solo las palabras mayores a 5.
     */
    @Test
    public void volcarOneCadenaOfWordsWithThreeWords() {
        assertEquals("noicadnuf jala oiraceb", result("fundacion jala becario"));
    }

}
