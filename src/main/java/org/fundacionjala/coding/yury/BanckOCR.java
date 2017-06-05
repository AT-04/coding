package org.fundacionjala.coding.yury;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by YuryOrtuno on 5/22/2017.
 */
public class BanckOCR {
    public static final int MAX_PASSWORD_SIZE = 27;
    public static Map<String, String> map;

    public BanckOCR() {
        map = new HashMap<>();
        map.put(" _ | ||_|", "0");
        map.put("     |  |", "1");
        map.put(" _  _||_ ", "2");
        map.put(" _  _| _|", "3");
        map.put("   |_|  |", "4");
        map.put(" _ |_  _|", "5");
        map.put(" _ |_ |_|", "6");
        map.put(" _   |  |", "7");
        map.put(" _ |_||_|", "8");
        map.put(" _ |_| _|", "9");
    }


    /**
     * This method converter the input number to int.
     *
     * @param entry is String number
     * @return int number.
     */
    public String convertEntryToNumber(String entry) {

        String number = "";
        for (int i = 0; i < MAX_PASSWORD_SIZE; i = i + 3) {
            String isNumber = entry.substring(i, i + 3) +
                    entry.substring(i + 27, i + 30) + entry.substring(i + 54, i + 57);

        number += map.get(isNumber);

//
        }
        int intNumber = Integer.parseInt(number);

        return number;
    }
}
