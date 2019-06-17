package com.demoexcercises;

/**
 * @author kaboobal
 *
 */
public class Stringfirstlast {

  public static void main(String[] args) {

    String str = "ABCDEF";
    String newstring = firstLast(str);
    System.out.println("The new string is" + newstring);

  }

  /**
   * @param str
   */
  private static String firstLast(String str) {

    String str1 = "";
    int n = str.length() - 1;

    for (int i = 0; i <= n / 2; i++) {

      str1 += str.charAt(i);

      if ((n / 2) == (n - i)) {
        continue;
      } else {
        str1 += str.charAt(n - i);
      }

    }

    return str1;

    // TODO Auto-generated method stub

  }

}
