package org.fundacionjala.coding.yury;

import java.util.LinkedList;

/**
 * Created by JRPNHP48 Team.
 */

public final class Calc {
  private int contDigit = -1;
  private int contOperator = 0;
  private double num1;
  private double num2;
  private LinkedList<String> copy;

  /**
   * This constructor.
   */
  public Calc() {
    copy = new LinkedList();
  }

  /**
   * This method evaluated expression.
   *
   * @param rpn operation.
   * @return result of operation.
   */
  public double evaluate(String rpn) {
    if (rpn.isEmpty()) {
      return 0;
    }
    String[] token = rpn.split(" ");
    for (int i = 0; i < token.length; i++) {
      switch (token[i]) {
        case "+":
          changeVariable();
          copy.add((String.valueOf(num2 + num1)));
          break;
        case "-":
          changeVariable();
          copy.add((String.valueOf(num2 - num1)));
          break;
        case "*":
          changeVariable();
          copy.add((String.valueOf(num2 * num1)));
          break;
        case "/":
          changeVariable();
          copy.add((String.valueOf(num2 / num1)));
          break;
        default:
          copy.add(token[i]);
          break;
      }
    }
    return !isValidRpnExpression(rpn) ? Double.parseDouble(copy.getLast()) : Double.parseDouble(copy.get(0));
  }

  /**
   * this method change the variable format.
   */
  private void changeVariable() {
    num1 = Double.parseDouble(copy.pollLast());
    num2 = Double.parseDouble(copy.pollLast());
  }

  /**
   * This method validate expression.
   *
   * @param rpn operation.
   * @return if expresion is validate.
   */
  public boolean isValidRpnExpression(String rpn) {
    for (String token : rpn.split(" ")) {
      if (isNumeric(token)) {
        contDigit++;
      } else if (isValidOperator(token)) {
        contOperator++;
        if (contOperator > contDigit) {
          return false;
        }
      } else {
        return false;
      }
    }
    return contOperator == contDigit;
  }

  /**
   * @param string operator.
   * @return boolean.
   */
  private static boolean isValidOperator(String string) {
    return string.equals("+") || string.equals("-") || string.equals("*") || string.equals("/");
  }

  /**
   * this method verify that a number is digit.
   *
   * @param string for evaluate.
   * @return boolean.
   */
  private static boolean isNumeric(String string) {
    try {
      Integer.parseInt(string);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }
}
