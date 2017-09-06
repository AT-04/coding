package org.fundacionjala.coding.yury;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by Administrator on 8/22/2017.
 */
public class DoubleLinear {

    /**
     * This method generate sequence.
     *
     * @param n position.
     * @return value.
     */
    private int sequence(int n) {
        Deque<Integer> dequeY = new ArrayDeque();
        Deque<Integer> dequeZ = new ArrayDeque();
        int count = 0, value = 1;
        while (true) {
            if (count >= n) {
                return value;
            }
            dequeY.addLast(equationY(value));
            dequeZ.addLast(equationZ(value));
            value = Math.min(dequeY.peekFirst(), dequeZ.peekFirst());
            if (value == dequeY.peekFirst()) {
                dequeY.removeFirst();
            }
            if (value == dequeZ.peekFirst()) {
                dequeZ.removeFirst();
            }
            count++;
        }
    }

    /**
     * This method calculate equation Y.
     *
     * @param value is value.
     * @return answer of equation.
     */
    private int equationY(int value) {
        return 2 * value + 1;
    }

    /**
     * This method calculate equation Z.
     *
     * @param value is value.
     * @return answer of equation.
     */
    private int equationZ(int value) {
        return 3 * value + 1;
    }

    /**
     * This method calculate sequence.
     *
     * @param i is position.
     * @return value.
     */
    public int dblLinear(int i) {
        return sequence(i);
    }

}
