package com.demoexcercises;

/**
 * @author kaboobal
 *
 */
public class StringToInt {

  public static void main(String[] args) {

    String str = "-12345";
    stringToInt(str);
  }

  /**
   * @param str
   */
  private static void stringToInt(String str) {

    int number = 0;
    boolean isnegative = false;
    int i = 0;

    if (str.charAt(0) == '-') {
      isnegative = true;
      i = 1;
    }

    while (i < str.length()) {
      number *= 10;
      number += str.charAt(i++) - '0';
    }

    if (isnegative) {
      number = -number;
    }

    System.out.println(number);

  }
}
