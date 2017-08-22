package org.fundacionjala.coding.yury;

/**
 * This method find a missing letter.
 */
public class FindLetter {
  /**
   * This method find a missing letter.
   *
   * @param array with characters.
   * @return missing letter.
   */
  public char findMissingLetter(char[] array) {
    for (int i = 1; i < array.length; i++) {
      if (array[i] != array[i - 1] + 1) {
        return (char) (array[i] - 1);
      }
    }
    return ' ';
  }
}
