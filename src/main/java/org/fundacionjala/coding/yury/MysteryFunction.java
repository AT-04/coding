package org.fundacionjala.coding.yury;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 8/30/2017.
 */
public class MysteryFunction {

    public static int mystery(int n) {
        List<List<String>> sequenceBinary = new ArrayList<List<String>>();
        int size = Integer.toBinaryString(n).length();
        sequenceBinary = generateSequence(size, sequenceBinary);
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (Integer.parseInt(sequenceBinary.get(i).get(n)) == 1) {
                sum += Math.pow(2, size - 1 - i);
            }
        }
        return sum;
    }

    private static List<List<String>> generateSequence(int size, List<List<String>> sequenceBinary) {

        for (int i = 0; i < size; i++) {
            int k = 1;
            int j = 0;
            int ban = 0;
            int value = 0;
            sequenceBinary.add(new ArrayList<>());
            while (j < (int) Math.pow(2, size)) {
                while (k < (int) Math.pow(2, size - i)) {
                    if (ban == 0) {
                        k++;
                    }
                    if (j >= (int) Math.pow(2, size)) break;
                    else {
                        sequenceBinary.get(i).add(value % 2 == 0 ? "0" : "1");
                        j++;
                    }
                    k++;
                }
                value++;
                ban = 1;
                k = 0;
            }
        }
        return sequenceBinary;
    }

    public static int mysteryInv(int n) {
        List<List<String>> sequenceBinary = new ArrayList<List<String>>();
        int size = Integer.toBinaryString(n).length();
        sequenceBinary = generateSequence(size, sequenceBinary);
        for (int j = 0; j < (int) Math.pow(2, size); j++) {
            int sum = 0;
            for (int i = 0; i < size; i++) {
                if (Integer.parseInt(sequenceBinary.get(i).get(j)) == 1) {
                    sum += Math.pow(2, size - 1 - i);
                }
            }
            if (sum == n) {
                return j;
            }
        }
        return 0;
    }
}
