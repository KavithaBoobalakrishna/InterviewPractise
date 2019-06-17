package com.tricky.javaoutputs;

/**
 * @author kaboobal
 *
 */
public class StringObjectNull {

  public static void main(String args[]) {

    nullCheck(null);
  }

  public static void nullCheck(String s) {

    System.out.println("String");
  }

  public static void nullCheck(Object s) {

    System.out.println("Object");
  }

  // public static void nullCheck(StringBuilder s) {
  //
  // System.out.println("stringbuilder");
  // }

  // when the above method is added the compiler throws error as below
  // The method nullCheck(String) is ambiguous for the type string object null

}

// Otherwise output: String
// Among overloaded methods the compiler chooses the most specific method
// String is child of object class and it is more specific in this case