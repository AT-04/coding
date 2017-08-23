package org.fundacionjala.coding.yury;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Administrator on 8/22/2017.
 */
public class DoubleLinear {


  private static int sequence(int n) {

    ArrayList list = new ArrayList();
    int initial = 1;
    int val = 0;
    int value = 1;
    list.add(1);
    for (int i = 0; i <= n; i++) {
      if (!list.contains(equationY((Integer) list.get(i)))) {
        list.add(equationY((Integer) list.get(i)));
      }
      if (!list.contains(equationZ((Integer) list.get(i)))) {
        list.add(equationZ((Integer) list.get(i)));
      }

      Collections.sort(list);
    }
    System.out.println(list);
    return (int) list.get(n);
  }

  private static int equationY(int value) {
    return 2 * value + 1;
  }

  private static int equationZ(int value) {
    return 3 * value + 1;
  }

  public static int dblLinear(int i) {
    return sequence(i);
  }


}
