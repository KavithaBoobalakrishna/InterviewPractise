package com.tricky.javaoutputs;

/**
 * @author kaboobal
 *
 */
public class StaticVariableInnerClass {

  public static void main(String[] args) {

    final class Constants {
      public static String name = "PI";
    }

    Thread thread = new Thread(new Runnable() {

      @Override
      public void run() {

        System.out.println(Constants.name);
      }

    });

    thread.start();
  }

}

// OUTPUT
// The compiler throws the error as : the fieldname cannot be declared static in non static inner type
// Simply which means you can use static variables in static or toplevel class
