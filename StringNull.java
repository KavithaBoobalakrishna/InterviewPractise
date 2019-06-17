package com.tricky.javaoutputs;

/**
 * @author kaboobal
 *
 */
public class StringNull {
  public static void main(String[] args) {

    String str = null;
    String str1 = "abc";
    System.out.println(str1.equals("abc") | str.equals(null));

  }

}

// OUTPUT: Null pointer exception on evaluation of right side statement str.equals(null)
