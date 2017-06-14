package org.fundacionjala.coding.richardseverich;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by RichardSeverich on 6/13/2017.
 */
public class EvaporatorTest {

    private Evaporator evaporator;

    /**
     *
     */
    @Before
    public void setUp() {
        evaporator = new Evaporator();
    }

    /**
     *
     */
    @Test
    public void testEvaporatorOne() {
        assertEquals(22, evaporator.lifeEvaporator(10, 10, 10));
    }

    /**
     *
     */
    @Test
    public void testEvaporatorTwo() {
        assertEquals(29, evaporator.lifeEvaporator(10, 10, 5));
    }

    /**
     *
     */
    @Test
    public void testEvaporatorThree() {
        assertEquals(59, evaporator.lifeEvaporator(100, 5, 5));
    }

    /**
     *
     */
    @Test
    public void testEvaporatorFour() {
        assertEquals(37, evaporator.lifeEvaporator(50, 12, 1));
    }

    /**
     *
     */
    @Test
    public void testEvaporatorFive() {
        assertEquals(31, evaporator.lifeEvaporator(47.5, 8, 8));
    }

    /**
     *
     */
    @Test
    public void testEvaporatorSix() {
        assertEquals(459, evaporator.lifeEvaporator(100, 1, 1));
    }

    /**
     *
     */
    @Test
    public void testEvaporatorSeven() {
        assertEquals(459, evaporator.lifeEvaporator(10, 1, 1));
    }

    /**
     *
     */
    @Test
    public void testEvaporatorEight() {
        assertEquals(299, evaporator.lifeEvaporator(100, 1, 5));
    }
}
