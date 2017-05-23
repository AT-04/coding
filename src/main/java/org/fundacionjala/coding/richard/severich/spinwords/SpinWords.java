package org.fundacionjala.coding.richard.severich.spinwords;

import java.util.ArrayList;

/**
 * Created by RichardSeverich on 5/22/2017.
 */
public class SpinWords {
    private String spinWord;
    private String word;
    private ArrayList<String> arrayList;


    /**
     * This method is the constructor of this class.
     *
     * @param word the parameter contains the initial string.
     */
    public SpinWords(String word) {
        this.word = word;
        this.spinWord = "";
        arrayList = new ArrayList<String>();
        this.spin();
    }

    /**
     * @return Returns the already changed string
     */
    public String getSpinWord() {
        return spinWord;

    }

    /**
     * This is the method that overturns strings that are more than 4 characters long.
     */

    public void spin() {


        extractStrings();

        final int for4 = 4;
        int zisString;
        int zisArrayList;
        String reverseString;
        zisArrayList = arrayList.size();

        for (int i = 0; i < zisArrayList; i++) {

            zisString = arrayList.get(i).length();
            if (zisString > for4) {
                reverseString = new StringBuilder(arrayList.get(i)).reverse().toString();
                if (i == zisArrayList - 1) {
                    spinWord = spinWord + reverseString;
                } else {
                    spinWord = spinWord + reverseString + " ";
                }

            } else {
                if (i == zisArrayList - 1) {
                    spinWord = spinWord + arrayList.get(i);
                } else {
                    spinWord = spinWord + arrayList.get(i) + " ";
                }

            }

        }

    }

    /**
     * This is the method extracts from a list each word of the main chain.
     */
    private void extractStrings() {
        String cad = "";
        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) != ' ') {
                cad = cad + word.charAt(i);
                if (i == word.length() - 1) {
                    arrayList.add(cad);
                }
            } else {
                arrayList.add(cad);
                cad = "";
            }
        }
    }
}
