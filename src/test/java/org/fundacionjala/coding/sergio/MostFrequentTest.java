package org.fundacionjala.coding.sergio;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class MostFrequentTest {

    /**
     *
     */
    @Test
    public void tests() {
        assertEquals(2, MostFrequent.mostFrequentItemCount(new int[]{3, -1, -1}));
        assertEquals(5, MostFrequent.mostFrequentItemCount(new int[]{3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3}));
    }
}
