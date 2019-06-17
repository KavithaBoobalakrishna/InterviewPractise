package com.tricky.javaoutputs;

/**
 * @author kaboobal
 *
 */

class Static {
  static int i;
}

public class StaticIntialize {
  public static void main(String[] args) {

    Static s = new Static();
    System.out.println(Static.i);
  }

}

// OUTPUT: Irrespective of whether i is static or non static the output is 0.

// But if you add the same i inside main method and try to print
// a. if the i is non static: The local variable i may not be initialized.
// b. if the i is static : Illegal modifier for parameter i,only final is permitted
