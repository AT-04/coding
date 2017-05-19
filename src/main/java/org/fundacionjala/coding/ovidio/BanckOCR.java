package org.fundacionjala.coding;

/**
 * Created by OvidioMiranda on 5/16/2017.
 */
public class BanckOCR {


    public static String convertyEntryToNumber(String entry) {

        String value = "";
        switch (entry) {

            case "     |  |":
                value = "1";
                break;
            case " _  _||_ ":
                value = "2";
                break;
            case " _  _| _|":
                value = "3";
                break;
            case "   |_|  |":
                value = "4";
                break;
            case " _ |_  _|":
                value = "5";
                break;
            case " _ |_ |_|":
                value = "6";
                break;
            case "_  | |":
                value = "7";
                break;
            case " _ |_||_|":
                value = "8";
                break;
            case " _ |_| _|":
                value = "9";
                break;
            default:
                value = "Invalid";
                break;
        }
        return value;


    }
}
