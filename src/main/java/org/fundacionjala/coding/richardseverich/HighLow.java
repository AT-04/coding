package org.fundacionjala.coding.richardseverich;

/**
 * Created by RichardSeverich on 6/12/2017.
 */
public class HighLow {

    /**
     * @param cad is a string.
     * @return String high and low.
     */
    public String highAndLow(String cad) {

        String[] arrayNum = cad.split(" ");
        int high = Integer.parseInt(arrayNum[0]);
        int low = Integer.parseInt(arrayNum[0]);

        for (int i = 0; i < arrayNum.length; i++) {
            if (Integer.parseInt(arrayNum[i]) > high) {
                high = Integer.parseInt(arrayNum[i]);
            }
            if (low > Integer.parseInt(arrayNum[i])) {
                low = Integer.parseInt(arrayNum[i]);
            }
        }
        return String.format("%d %d", high, low);
    }
}
