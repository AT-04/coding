package org.fundacionjala.coding.jose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by JoseTorrez on 6/13/2017.
 */
public class FinalExamTest {
    /**
     *
     */
    @Test
    public void testEvaporatorOne() {
        assertEquals(22, FinalExam.evaporator(10, 10, 10), 0);
    }

    /**
     *
     */
    @Test
    public void testEvaporatorTwo() {
        assertEquals(29, FinalExam.evaporator(10, 10, 5), 0);
    }

    /***
     *
     */
    @Test
    public void testEvaporatorThree() {
        assertEquals(59, FinalExam.evaporator(100, 5, 5), 0);
    }

    /**
     *
     */
    @Test
    public void testEvaporatorFour() {
        assertEquals(37, FinalExam.evaporator(50, 12, 1), 0);
    }

    /**
     *
     */
    @Test
    public void testEvaporatorFive() {
        assertEquals(31, FinalExam.evaporator(47.5, 8, 8), 0);
    }

    /**
     *
     */
    @Test
    public void testEvaporatorSix() {
        assertEquals(459, FinalExam.evaporator(100, 1, 1), 0);
    }

    /**
     *
     */
    @Test
    public void testEvaporatorSeven() {
        assertEquals(459, FinalExam.evaporator(10, 1, 1), 0);
    }

    /**
     *
     */
    @Test
    public void testEvaporatorEight() {
        assertEquals(299, FinalExam.evaporator(100, 1, 5), 0);
    }

}
