package org.fundacionjala.coding.yury;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Administrator on 8/22/2017.
 */
public class DoubleLinear {


    private static int sequence(int n) {

        ArrayList list = new ArrayList();
        list.add(1);
        int i = 0;
        while (list.size() < 1.5 * n) {
            if (!list.contains(equationY((Integer) list.get(i)))) {
                list.add(equationY((Integer) list.get(i)));
            }
            if (!list.contains(equationZ((Integer) list.get(i)))) {
                list.add(equationZ((Integer) list.get(i)));
            }
            Collections.sort(list);
            i++;
        }
        return (int) list.get(n);
    }

    private static boolean condition(ArrayList list, int i, int n) {
        return list.size() >= n && equationY((Integer) list.get(i)) >= (int) list.get(n);
    }

    private static int equationY(int value) {
        return 2 * value + 1;
    }

    private static int equationZ(int value) {
        return 3 * value + 1;
    }

    static int dblLinear(int i) {
        return sequence(i);
    }

}
