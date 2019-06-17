package com.tricky.javaoutputs;

/**
 * @author kaboobal
 *
 */
class static1 {
  static void run() {

    System.out.println("I am parent");
  }
}

class static2 extends static1 {

  static void run() {

    System.out.println("I am child");
  }

}

public class StaticOverride {

  public static void main(String[] args) {

    static1.run();
  }
}

// OUTPUT: Can we override private and static methods?
// No, static methods cannot be overridden even if you create a similar method with
// same return type and same method arguments in child class then it will hide the superclass method,
// this is known as method hiding.