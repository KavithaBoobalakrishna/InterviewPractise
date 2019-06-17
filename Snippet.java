package com.tricky.javaoutputs;

/**
 * @author kaboobal
 *
 */
public class Snippet {
  public static void main(String[] args) {

    Integer i = new Integer(0);
    Integer j = new Integer(0);

    while (i <= j && j <= i && i != j) {
      System.out.println(i);
    }

    // output: infinite number of times the loop is executed and prints infinite 0s
  }

}
