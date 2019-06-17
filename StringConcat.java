package com.tricky.javaoutputs;

/**
 * @author kaboobal
 *
 */
public class StringConcat {
  public static void main(String[] args) {

    String s1 = "abc";
    String s2 = "ab".concat("cd"); // ab + cd ;

    s1 += "d";

    System.out.println(s1 == s2);
  }

}

// Output : False
// As string direct concatenation results in creating of different strings