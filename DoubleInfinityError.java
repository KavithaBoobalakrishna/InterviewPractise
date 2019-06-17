package com.tricky.javaoutputs;

/**
 * @author kaboobal
 *
 */
public class DoubleInfinityError {
  public static void main(String[] args) {

    System.out.println(1.0 / 0.0);
    double x = Double.NaN;
    System.out.println(x == Double.NaN);
  }

}

// OUTPUT: Infinity
// This doesn't throw any arithmetic exception as it is double primitive or Double class arithmetic

// 2. Sysout output is "false"
// The value of x is not equal to Double.NaN even if x is itself equal to Double.NaN