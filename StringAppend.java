package com.tricky.javaoutputs;

/**
 * @author kaboobal
 *
 */
public class StringAppend {
  public static void main(String[] args) {

    String s1 = "polynomi10";
    String s2 = "polynomi" + s1.length();

    System.out.println(s1 == s2); // returns false
    System.out.println(s1.equals(s2)); // returns true

  }

}
