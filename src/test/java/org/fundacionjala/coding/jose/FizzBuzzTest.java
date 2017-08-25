package org.fundacionjala.coding.jose;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by JoseTorrez on 8/25/2017.
 */
public class FizzBuzzTest {

  /**
   * Basic Tests.
   */
  @Test
  public void basicTest() {
    assertEquals("1", FizzBuzz.numberDivisor(1));
    assertEquals("Fizz", FizzBuzz.numberDivisor(3));
    assertEquals("Buzz", FizzBuzz.numberDivisor(5));
    assertEquals("13", FizzBuzz.numberDivisor(13));
    assertEquals("Fizz", FizzBuzz.numberDivisor(12));
    assertEquals("FizzBuzz", FizzBuzz.numberDivisor(15));
    assertEquals("113", FizzBuzz.numberDivisor(113));
    assertEquals("Fizz", FizzBuzz.numberDivisor(123));
    assertEquals("Buzz", FizzBuzz.numberDivisor(125));
    assertEquals("173", FizzBuzz.numberDivisor(173));
    assertEquals("FizzBuzz", FizzBuzz.numberDivisor(900));
    assertEquals("FizzBuzz", FizzBuzz.numberDivisor(150));


  }
}
