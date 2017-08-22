package org.fundacionjala.coding.yury;

/**
 * Created by yuryy on 22/8/2017.
 */
public class FindLetter {
  public static char findMissingLetter(char[] array) {
    for (int i = 1; i < array.length; i++) {
      if (array[i] != array[i - 1] + 1) {
        return (char) (array[i] - 1);
      }
    }
    return ' ';
  }
}
