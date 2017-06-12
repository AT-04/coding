package org.fundacionjala.coding.yury;


import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by YuryOrtuno on 6/12/2017.
 */
public class HighestAndLowest {

    /**
     * @param string number.
     * @return highest and lowest.
     */
    public String highAndLow(String string) {

        LinkedList<Integer> list = new LinkedList<>();
        String[] listNumber = string.split(" ");
        for (String number : listNumber) {
            list.add(Integer.parseInt(number));
        }
        Collections.sort(list);
        return String.format("%d %d", list.getLast(), list.getFirst());
    }
}
