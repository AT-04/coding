package org.fundacionjala.coding.jose;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by JoseTorrez on 6/6/2017.
 */
public class SortInnerTest {
    private SortInner sortInner;

    /**
     *
     */
    @Before
    public void initObjects() {

        sortInner = new SortInner();
    }
    /**
     *
     */
    @Test
    public void wordSorted() {

        assertEquals("guns", sortInner.sort("guns"));
    }

    /**
     *
     */
    @Test
    public void wordSorted2() {

        assertEquals("aniddg", sortInner.sort("adding"));
    }

    /**
     *
     */
    @Test
    public void wordSorted3() {

        assertEquals("hlleo", sortInner.sort("hello"));
    }

    /**
     *
     */
    @Test
    public void wordSorted4() {

        assertEquals("how was gonig", sortInner.innerContent("how was going"));
    }

    /**
     *
     */
    @Test
    public void wordSorted5() {

        assertEquals("evrey tnihg is fnie for me", sortInner.innerContent("every thing is fine for me"));
    }

    /**
     *
     */
    @Test
    public void wordSorted6() {

        assertEquals("I am", sortInner.innerContent("I am"));
    }
}
