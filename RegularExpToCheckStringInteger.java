package com.demoexcercises;

/**
 * @author kaboobal
 *
 */
public class RegularExpToCheckStringInteger {
  public static void main(String[] args) {

    String str = "1234554557";
    String regex = "\\d+";

    if (str.matches(regex)) {
      System.out.println("The given string is an integer");
    } else {
      System.out.println("The string is not an integer");
    }

  }
}
