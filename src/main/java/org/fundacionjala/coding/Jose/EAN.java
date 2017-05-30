package org.fundacionjala.coding.Jose;

/**
 * Created by JoseTorrez on 5/30/2017.
 */
public class EAN {
    public static final int POSITION = 3;
    public static final int TEN = 10;

    /**
     * Constructor.
     */
    public EAN() {
    }
    /**
     * Method for validate CheckSum.
     * @return boolean result
     * @param string validate.
     */
    public boolean validate(String string) {
     int sum = 0;
     for (int i = 0; i < string.length() - 1; i++) {
         int number = Integer.parseInt(string.substring(i, i + 1));
         sum += i % 2 == 0 ? number : number * POSITION;
     }
     int checksum = sum % TEN == 0 ? 0 : TEN - (sum % TEN);
     return checksum == Integer.parseInt(string.substring(string.length() - 1, string.length()));
    }
}
