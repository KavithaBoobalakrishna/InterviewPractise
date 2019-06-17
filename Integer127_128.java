package com.tricky.javaoutputs;

/**
 * @author kaboobal
 *
 */
public class Integer127_128 {

  public static void main(String[] args) {

    Integer i1 = 127;
    Integer i2 = 127;
    System.out.println(i1 == i2);

    Integer i3 = 128;
    Integer i4 = 128;
    System.out.println(i3 == i4);
  }
}

// true
// false

// Since those values(-128 to 127) are cached, the representation of 127 will always point to the same object which
// makes the first i1 == i2 comparison true.

// New objects are created for 128 which will not be the same, causing the second i3 == i4 comparison to be false.