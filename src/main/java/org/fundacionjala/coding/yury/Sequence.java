package org.fundacionjala.coding.yury;

/**
 * this class calculate the sequence.
 */
public final class Sequence {

  /**
   * Constructor.
   */
  private Sequence() {
  }

  /**
   * This method calculate the sequence.
   *
   * @param n is type long.
   * @return the result the sequence.
   */
  public static long getScore(long n) {
    long sum = 0;
    while (n > 0) {
      sum += n;
      n--;
    }
    return sum * 50;
  }
}
