package com.tricky.javaoutputs;

/**
 * @author kaboobal
 *
 */
class B {
  public static void staticMethod() {

    System.out.println("Static Method");
  }
}

public class StaticUsingObject {
  public static void main(String[] args) {

    B b = null;
    b.staticMethod();
  }

}

// output:
// Compiler throws the error as, The static method staticMethod() of type B should be accessed in a static way.