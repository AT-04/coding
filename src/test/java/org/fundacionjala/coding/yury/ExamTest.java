package org.fundacionjala.coding.yury;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by YuryOrtuno on 6/13/2017.
 */
public class ExamTest {

    /**
     */
    @Test
    public void testEvaporatorOne() {
        assertEquals(22, Exam.evaporator(10, 10, 10));
    }

    /**
     */
    @Test
    public void testEvaporatorTwo() {
        assertEquals(29, Exam.evaporator(10, 10, 5));
    }

    /**
     */
    @Test
    public void testEvaporatorThree() {
        assertEquals(59, Exam.evaporator(100, 5, 5));
    }

    /**
     */
    @Test
    public void testEvaporatorFour() {
        assertEquals(37, Exam.evaporator(50, 12, 1));
    }

    /**
     */
    @Test
    public void testEvaporatorFive() {
        assertEquals(31, Exam.evaporator(47.5, 8, 8));
    }

    /**
     */
    @Test
    public void testEvaporatorSix() {
        assertEquals(459, Exam.evaporator(100, 1, 1));
    }

    /**
     */
    @Test
    public void testEvaporatorSeven() {
        assertEquals(459, Exam.evaporator(10, 1, 1));
    }

    /**
     */
    @Test
    public void testEvaporatorEight() {
        assertEquals(299, Exam.evaporator(100, 1, 5));
    }
}
