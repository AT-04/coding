package org.fundacionjala.coding.jose;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by JoseTorrez on 8/28/2017.
 */
public class SmallestIntegerFinderTest {

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
    Constructor<SmallestIntegerFinder> constructor = SmallestIntegerFinder.class.getDeclaredConstructor();
    assertTrue(Modifier.isPrivate(constructor.getModifiers()));
    constructor.setAccessible(true);
    constructor.newInstance();
  }

  /**
   * First Test.
   */
  @Test
  public void example1() {
    int expected = 11;
    int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78, 56, 232, 12, 11, 43});
    assertEquals(expected, actual);
  }

  /**
   * Second Test.
   */
  @Test
  public void example2() {
    int expected = -33;
    int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78, 56, -2, 12, 8, -33});
    assertEquals(expected, actual);
  }

  /**
   * Third Test.
   */
  @Test
  public void example3() {
    int expected = Integer.MIN_VALUE;
    int actual = SmallestIntegerFinder.findSmallestInt(new int[]{0, Integer.MIN_VALUE, Integer.MAX_VALUE});
    assertEquals(expected, actual);
  }
}
