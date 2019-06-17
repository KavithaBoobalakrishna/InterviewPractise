package com.demoexcercises;

/**
 * @author kaboobal
 *
 */
public class GFG {

  /**
   * @param args
   */
  public static void main(String[] args) {

    String str = "mALAYALAM";
    if (isPalindrome(str))
      System.out.print("IS PALINDROME");
    else
      System.out.print("NOT A PALINDROME");

  }

  /**
   * @param str
   * @return
   */
  private static boolean isPalindrome(String str) {

    String temp = "";

    for (int i = str.length() - 1; i >= 0; i--) {
      temp = temp + str.charAt(i);

    }
    if (str.equalsIgnoreCase(temp))
      return true;
    else
      return false;
  }

}