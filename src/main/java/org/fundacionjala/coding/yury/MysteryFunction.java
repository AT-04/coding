package org.fundacionjala.coding.yury;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.function.IntBinaryOperator;

/**
 * Created by Administrator on 8/30/2017.
 */
public class MysteryFunction {

    public static int mystery(int n) {

        String binaryaux = Integer.toBinaryString(n);
        System.out.println(binaryaux.length());
        String binary = Integer.toBinaryString((int) Math.pow(2, binaryaux.length() - 1));
        List<List<String>> sequenceBinary = new ArrayList<List<String>>();
        StringJoiner stringJoiner = new StringJoiner("");
        for (int i = 0; i < binary.length(); i++) {

            for (int j=0;j<=(int) Math.pow(2, binaryaux.length() - 1);i++){
                sequenceBinary.add(new ArrayList<>());
                if (j==0){
                    sequenceBinary.get(i).add("");
                }

            }

            stringJoiner.add(binary.substring(i - 1, i));
            System.out.println(binary.substring(i - 1, i));
        }

        return 0;
    }
}
