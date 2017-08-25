package org.fundacionjala.coding.jose;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Created by JoseTorrez on 8/25/2017.
 */
public class FizzBuzzTest {

  /**
   * This test assert the modifier of the Sequence private constructor class.
   *
   * @throws NoSuchMethodException     throw when no private constructor is defined.
   * @throws IllegalAccessException    throw when can not access to the constructor.
   * @throws InvocationTargetException throw when can not be perform a invocation.
   * @throws InstantiationException    throw when a instantiation can not be performed.
   */
  @Test
  public void privateConstructorTest() throws NoSuchMethodException, IllegalAccessException,
      InvocationTargetException, InstantiationException {
    Constructor<FizzBuzz> constructor = FizzBuzz.class.getDeclaredConstructor();
    assertTrue(Modifier.isPrivate(constructor.getModifiers()));
    constructor.setAccessible(true);
    constructor.newInstance();
  }

  /**
   * Basic Tests.
   */
  @Test
  public void basicTest() {
    assertEquals("1", FizzBuzz.numberDivisor(1));
    assertEquals("Fizz", FizzBuzz.numberDivisor(3));
    assertEquals("Buzz", FizzBuzz.numberDivisor(5));
    assertEquals("Fizz", FizzBuzz.numberDivisor(13));
    assertEquals("Fizz", FizzBuzz.numberDivisor(12));
    assertEquals("FizzBuzz", FizzBuzz.numberDivisor(15));
    assertEquals("Fizz", FizzBuzz.numberDivisor(113));
    assertEquals("Fizz", FizzBuzz.numberDivisor(123));
    assertEquals("Buzz", FizzBuzz.numberDivisor(125));
    assertEquals("Fizz", FizzBuzz.numberDivisor(173));
    assertEquals("FizzBuzz", FizzBuzz.numberDivisor(900));
    assertEquals("FizzBuzz", FizzBuzz.numberDivisor(150));
    assertEquals("FizzBuzz", FizzBuzz.numberDivisor(53));


  }
}
