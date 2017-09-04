package org.fundacionjala.coding.jose;

import java.util.Stack;

/**
 * Created by JoseTorrez on 9/4/2017.
 * Your job is to create a calculator which evaluates expressions in Reverse Polish notation.
 * For example expression 5 1 2 + 4 * + 3 - (which is equivalent to
 * 5 + ((1 + 2) * 4) - 3 in normal notation) should evaluate to 14.
 * Note that for simplicity you may assume that there are always spaces between numbers and operations,
 * e.g. 1 3 + expression is valid, but 1 3+ isn't.
 * Empty expression should evaluate to 0.
 * Valid operations are +, -, *, /.
 * You may assume that there won't be exceptional situations (like stack underflow or division by zero).
 */
public class Calc {

    /**
     *This method is for calculate expressions in reverse.
     * @param expression String.
     * @return Double.
     */
    public double evaluate(String expression) {
        if ("".equals(expression)) {
            return 0;
        }
        Stack<Double> stack = new Stack<Double>();
        for (String s : expression.split("\\s")) {
            if ("+".equals(s)) {
                stack.push(stack.pop() + stack.pop());
            } else if ("-".equals(s)) {
                stack.push(-1 * (stack.pop() - stack.pop()));
            } else if ("*".equals(s)) {
                stack.push(stack.pop() * stack.pop());
            } else if ("/".equals(s)) {
                stack.push(1 / (stack.pop() / stack.pop()));
            } else {
                stack.push(Double.parseDouble(s));
            }
        }
        return stack.pop();
    }
}
