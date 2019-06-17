package com.tricky.javaoutputs;

/**
 * @author kaboobal
 *
 */
public class DoubleFloat {
  public static void main(String[] args) {

    display(1.14567822);
  }

  /**
   * @param d
   */
  private static void display(float d) {

    System.out.println("I am inside float");

  }

  private static void display(double d) {

    System.out.println("I am inside double");
  }

}
