package org.fundacionjala.coding.Richard_Severich_Sort_Inner_Content;


import java.util.Arrays;

/**
 * Created by RichardSeverich on 5/23/2017.
 */
public class SortInnerContent {

    /**
     * This method descrambles the inner contents of a string.
     *
     * @param cad This is the chain to which we will change its internal content to a descending order.
     * @return Returns the string to which we will change its internal contents to a descending order.
     */

    public String sortInner(String cad) {


        StringBuffer resultWords = new StringBuffer();
        String[] partsWords;
        partsWords = cad.split(" ");
        String cadDescending;

        for (int i = 0; i < partsWords.length; i++) {

            resultWords.append(partsWords[i].charAt(0));
            cadDescending = partsWords[i].substring(1, partsWords[i].length() - 1);
            cadDescending = getDescendingOrder(cadDescending);
            resultWords.append(cadDescending);
            resultWords.append(partsWords[i].charAt(partsWords[i].length() - 1));

            if (i < partsWords.length - 1) {
                resultWords.append(" ");
            }
        }

        return resultWords.toString();

    }

    /**
     * This method rolls down a querevide string as a parameter.
     *
     * @param string This parameter is the string that will be sorted in descending order.
     * @return A sorted string is returned in descending order.
     */
    private String getDescendingOrder(String string) {

        char[] charArray = string.toCharArray();
        Arrays.sort(charArray);
        StringBuffer result = new StringBuffer();

        for (int i = charArray.length - 1; i >= 0; i--) {
            result.append(charArray[i]);
        }
        return result.toString();
    }


}
