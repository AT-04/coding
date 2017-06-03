package main.java.org.fundacionjala.coding.yury;

/**
 * Created by YuryOrtuno on 5/26/2017.
 */
public class EanValidation {
    public static final int ODD = 3;
    public static final int FORMULATE = 10;

    /**
     * @param string barcode
     * @return true there barcode is correct
     */
    public boolean validation(String string) {


        int more = 0;
        for (int i = 0; i < string.length() - 1; i++) {
            int number = Integer.parseInt(string.substring(i, i + 1));
            more += i % 2 == 0 ? number : number * ODD;
        }
        int checksum = more % FORMULATE == 0 ? 0 : FORMULATE - (more % FORMULATE);
        return checksum == Integer.parseInt(string.substring(string.length() - 1, string.length()));
    }
}
