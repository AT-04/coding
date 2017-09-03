package org.fundacionjala.coding.jose;

import java.util.stream.IntStream;

/**
 * Created by JoseTorrez on 8/28/2017.
 * Given an array of integers your solution should find the smallest integer.
 * For example:
 * Given [34, 15, 88, 2] your solution will return 2
 * Given [34, -345, -1, 100] your solution will return -345
 * You can assume for the purpose of this kata, that the supplied array will not be empty.
 */
public final class SmallestIntegerFinder {

  /**
   * Default Constructor.
   */
  private SmallestIntegerFinder() {

  }

  /**
   * This method is for find the smallest integer in an array list.
   *
   * @param arrayNumbers list of numbers.
   * @return smallest Integer.
   */
  public static int findSmallestInt(int[] arrayNumbers) {
    return IntStream.of(arrayNumbers).min().getAsInt();
  }
}
