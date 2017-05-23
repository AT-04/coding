package org.fundacionjala.coding.yury;

/**
 * Created by YuryOrtuno on 5/22/2017.
 */
public class BanckOCR {
    public static final int MAX_PASSWORD_SIZE = 27;


    /**
     * This method converter the input number to int.
     *
     * @param entry is String number
     * @return int number.
     */
    public static int convertEntryToNumber(String entry) {

        String number = "";
        for (int i = 0; i < MAX_PASSWORD_SIZE; i = i + 3) {
            String isNumber = entry.substring(i, i + 3) +
                    entry.substring(i + 27, i + 30) + entry.substring(i + 54, i + 57);

            switch (isNumber) {

                case " _ | ||_|":
                    number += "0";
                    break;
                case "     |  |":
                    number += "1";
                    break;
                case " _  _||_ ":
                    number += "2";
                    break;
                case " _  _| _|":
                    number += "3";
                    break;
                case "   |_|  |":
                    number += "4";
                    break;
                case " _ |_  _|":
                    number += "5";
                    break;
                case " _ |_ |_|":
                    number += "6";
                    break;
                case " _   |  |":
                    number += "7";
                    break;
                case " _ |_||_|":
                    number += "8";
                    break;
                case " _ |_| _|":
                    number += "9";
                    break;

                default:
                    number += " _  _||  ";
            }
        }
        int intNumber = Integer.parseInt(number);

        return intNumber;
    }
}
