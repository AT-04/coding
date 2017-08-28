package org.fundacionjala.coding.jose;

/**
 * Created by JoseTorrez on 8/25/2017.
 */
public final class FizzBuzz {

  public static final String FIZZ_BUZZ = "FizzBuzz";
  public static final int THREE = 3;
  public static final int FIVE = 5;
  public static final int ZERO = 0;
  public static final String FIZZ = "Fizz";
  public static final String BUZZ = "Buzz";

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
    while (number > 0) {
      if ((number % THREE == ZERO) && (number % FIVE == ZERO)
          || Integer.toString(number).contains("3") && Integer.toString(number).contains("5")) {
        return FIZZ_BUZZ;
      }
      if ((number % THREE == ZERO) || (Integer.toString(number).contains("3"))) {
        return FIZZ;
      }
      if ((number % FIVE == ZERO) || (Integer.toString(number).contains("5"))) {
        return BUZZ;
      } else {
        return Integer.toString(number);
      }
    }
    return "";
  }
}
