package com.tricky.javaoutputs;

/**
 * @author kaboobal
 *
 */
@FunctionalInterface
public interface functionalinterface {

  public void display();

  // public void display1();
  // if the above abstract method is added it says annotation "@FunctionalInterface is invalid as the
  // functionalinterface is not a Functional interface"
  default void display2() {

    System.out.println("I am default");
  }

  static void display3() {

    System.out.println("I am Static");
  }

}
