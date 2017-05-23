package org.fundacionjala.coding.Richard_Severich_Sort_Inner_Content;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by RichardSeverich on 5/23/2017.
 */
public class SortInnerContent {

    private String firstCad;
    private String cadSortInner;
    private ArrayList<String> arrayList;

    /**
     * @param cad is a firs string
     */
    public SortInnerContent(String cad) {
        this.firstCad = cad;
        this.cadSortInner = "";
        arrayList = new ArrayList<String>();
        this.sortInner();
    }

    /**
     * This method sorts down the inner contents of a string.
     */
    public void sortInner() {

        extractStrings();
        int zisString;
        int zisArrayList;
        int zisArrayreverse;
        int indReverse;
        char[] reverseChar;
        zisArrayList = arrayList.size();

        for (int i = 0; i < zisArrayList; i++) {

            zisString = arrayList.get(i).length() - 1;
            reverseChar = new char[zisString - 1];
            for (int j = 1; j < zisString; j++) {     // este for  de positio 1 a final -1

                indReverse = j - 1;
                reverseChar[indReverse] = arrayList.get(i).charAt(j);
            }

            zisArrayreverse = reverseChar.length - 1;
            Arrays.sort(reverseChar);

            cadSortInner = cadSortInner + arrayList.get(i).charAt(0);
            for (int k = zisArrayreverse; k >= 0; k--) {
                cadSortInner = cadSortInner + reverseChar[k];
            }
            if (i == zisArrayList - 1) {
                cadSortInner = cadSortInner + arrayList.get(i).charAt(zisString);
            } else {
                cadSortInner = cadSortInner + arrayList.get(i).charAt(zisString) + " ";
            }

        }


    }

    /**
     * This is the method extracts from a list each word of the main chain.
     */
    private void extractStrings() {
        String cad = "";
        for (int i = 0; i < firstCad.length(); i++) {
            if (firstCad.charAt(i) != ' ') {
                cad = cad + firstCad.charAt(i);
                if (i == firstCad.length() - 1) {
                    arrayList.add(cad);
                }
            } else {
                arrayList.add(cad);
                cad = "";
            }
        }
    }

    /**
     * @return Returns the already changed string
     */
    public String getSortInner() {
        return cadSortInner;

    }
}
