package org.fundacionjala.coding.richard;

import java.util.Random;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Richard on 8/19/2017.
 * square of squares
 * You like building blocks. You especially like building blocks that are squares. And what you even like more, is to
 * arrange them into a square of square building blocks!
 * However, sometimes, you can't arrange them into a square. Instead, you end up with an ordinary rectangle! Those
 * blasted things! If you just had a way to know, whether you're currently working in vain… Wait! That's it! You just
 * have to check if your number of building blocks is a perfect square.
 * Task
 * Given an integral number, determine if it's a square number:
 * In mathematics, a square number or perfect square is an integer that is the square of an integer; in other words,
 * it is the product of some integer with itself.
 */
public class SquareTest {

    /**
     *
     */
    @Test
    public void shouldWorkForSomeExamples() {
        Square square = new Square();
        assertEquals("negative numbers aren't square numbers", false, square.isSquare(-1));
        assertEquals("3 isn't a square number", false, square.isSquare(3));
        assertEquals("4 is a square number", true, square.isSquare(4));
        assertEquals("25 is a square number", true, square.isSquare(25));
        assertEquals("26 isn't a square number", false, square.isSquare(26));
    }

    /**
     *
     */
    @Test
    public void shouldWorkForRandomSquareNumbers() {
        Square square = new Square();
        Random rand = new Random();
        for (int i = 0; i < 100; ++i) {
            int randomNum = rand.nextInt(0x0fff);
            int randomSq = randomNum * randomNum;
            assertEquals(String.format("%d is a square number", randomSq), true, square.isSquare(randomSq));
        }
    }
}
