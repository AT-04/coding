package org.fundacionjala.coding.MarcoM_spin_word;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 5/29/2017.
 */
public class TestSpinWord {
    /**
     * verify.
     */
    @Test
    public void returnWord() {
        SpinWorld k = new SpinWorld();
        assertEquals("abd j", k.reverse("abd j"));
    }

    /**
     *verify.
     */
    @Test
    public void returnWordTwo() {
        SpinWorld k = new SpinWorld();
        assertEquals("hola mund", k.reverse("hola mund"));
    }
}
