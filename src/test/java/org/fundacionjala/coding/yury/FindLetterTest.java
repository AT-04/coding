package org.fundacionjala.coding.yury;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test.
 */
public class FindLetterTest {

  private FindLetter findLetter;

  /**
   * This Before.
   */
  @Before
  public void setUp() {
    findLetter = new FindLetter();
  }

  /**
   * Example Test.
   */
  @Test
  public void exampleTests() {
    assertEquals('e', findLetter.findMissingLetter(new char[]{'a', 'b', 'c', 'd', 'f'}));
    assertEquals('P', findLetter.findMissingLetter(new char[]{'O', 'Q', 'R', 'S'}));
    assertEquals(' ', findLetter.findMissingLetter(new char[]{'P', 'Q', 'R', 'S'}));
  }
}
