package org.fundacionjala.coding.yury;

import org.junit.Test;
    import static org.junit.Assert.assertEquals;
    import org.junit.runners.JUnit4;

public class FindLetterTest {
  @Test
  public void exampleTests() {
    assertEquals('e', FindLetter.findMissingLetter(new char[] { 'a','b','c','d','f' }));
    assertEquals('P', FindLetter.findMissingLetter(new char[] { 'O','Q','R','S' }));
  }
}