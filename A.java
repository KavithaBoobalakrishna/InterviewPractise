package com.tricky.javaoutputs;

/**
 * @author kaboobal
 *
 */
public class A {

  A a = new A();

  public static void main(String[] args) {

    A a = new A();
  }

}

// Output: The class A constructor is called recursively when the object is created for class A
// in the main method hence we get stackoverflow error