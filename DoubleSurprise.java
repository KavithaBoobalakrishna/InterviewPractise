package com.tricky.javaoutputs;

/**
 * @author kaboobal
 *
 */
public class DoubleSurprise {
  public static void main(String[] args) {

    System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
    // System.out.println(Double.MIN_VALUE < 0.0d); //returns false

  }
}

// OUTPUT: 0.0
// The Min value of double is also a positive number i.e., 2^(-1074)
// Hence 0.0 is returned as minimum among 0.0 and double.MIN_VALUE

// NOTE: Double.MIN_VALUE is the smallest positive non-zero value which can be represented by a Java double