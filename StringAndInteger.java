package com.tricky.javaoutputs;

/**
 * @author kaboobal
 *
 */
public class StringAndInteger {

  public static void main(String[] args) {

    Integer i = new Integer(null);

    String s = new String(null);
  }

}

// compiletime error at line 13 it says string(string) is ambiguous
// Because compiler will be ambiguous which constructor to call
// as String class has 5constructors which takes one argument of derived type