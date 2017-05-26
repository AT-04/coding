package org.fundacionjala.coding.Marcan;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by MarcandeaCabrera on 5/23/2017.
 */
public class SortContentTest {
    /**
     * This test is for verify word inverse.
     */
    @Test
    public void firstTest(){
        SortContent sortContent=new SortContent();
        assertEquals("Mrcaan",sortContent.sortContent("Marcan"));
    }

}
