package org.fundacionjala.coding.MultipliesJoseTorrez;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by JoseTorrez on 6/12/2017.
 */
public class MultipliesTest {

    /**
     *
     */
    @Test
    public void test() {
        assertEquals(23, Multiplies.solutionMultiplies(10));
        assertEquals(78, Multiplies.solutionMultiplies(20));
        assertEquals(9168, Multiplies.solutionMultiplies(200));
    }
}
