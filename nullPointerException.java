package com.tricky.javaoutputs;

/**
 * @author kaboobal
 *
 */

class C {
  int methodOfA() {

    return (true ? null : 0);
  }
}

public class nullPointerException {
  public static void main(String[] args) {

    C c = new C();
    c.methodOfA();

  }

}

// Output:
// Null pointer exception at runtime