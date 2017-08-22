package org.fundacionjala.coding.yury;

/**
 * this class calculate the sequence.
 */
public class Sequence {

  /**
   * This method calculate the sequence.
   *
   * @param n is type long.
   * @return the result the sequence.
   */
  public long getScore(long n) {
    long sum = 0;
    while (n > 0) {
      sum += n;
      n--;
    }
    return sum * 50;
  }
}
