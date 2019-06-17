package com.tricky.javaoutputs;

/**
 * @author kaboobal
 *
 */
public class OperatorPrecedence {
  public static void main(String[] args) {

    String s1 = "abc";
    String s2 = "abc";
    System.out.println("s1 == s2 is:" + s1 == s2);
  }
}

// Output: false
// The '+' operator takes precedence over the '==' operator hence the expression turns out to be
// s1==s2 is:abc == abc which are obviously different strings and hence it prints false