package org.fundacionjala.coding.jose;

/**
 * Created by JoseTorrez on 8/18/2017.
 */
public class Sequence {

  /**
   * Method to find the Sequence for a number iteration.
   *
   * @param numberIteration Integer.
   * @return Integer.
   */
  public long getScore(long numberIteration) {

    long score = 0;
    for (long controller = 1; controller <= numberIteration; controller++) {
      score += controller;
    }
    return score * 50;


  }
}
