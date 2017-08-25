package org.fundacionjala.coding.jose;

/**
 * Created by JoseTorrez on 8/25/2017.
 */
public final class FizzBuzz {
  /**
   * Default Constructor.
   */
  private FizzBuzz() {

  }
  /**
   * @param number Integer received.
   * @return String word or number.
   */
  public static String numberDivisor(Integer number) {
    String variable = "";
    while (number > 0) {
      if ((number % 3 == 0) && (number % 5 == 0)) {
        return "FizzBuzz";
      }
      if (number % 3 == 0) {
        return "Fizz";
      }
      if (number % 5 == 0) {
        return "Buzz";
      } else {
        return Integer.toString(number);
      }
    }
    return variable;
  }
}
