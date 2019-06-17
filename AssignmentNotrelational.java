package com.tricky.javaoutputs;

/**
 * @author kaboobal
 *
 */
public class AssignmentNotrelational {
  public static void main(String[] args) {

    boolean a = false;

    if (a = true) {
      System.out.println("a = true");
    } else {
      System.out.println("a = false");
    }
  }

}

// OUTPUT: a = true
// Carefully observe the operator is assignment a=true and not relational "=="