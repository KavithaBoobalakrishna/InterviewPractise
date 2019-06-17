package com.tricky.javaoutputs;

/**
 * @author kaboobal
 *
 */
public class BreakErrorClass {

  public static void main(String[] args) {

    if (true)
      break;
  }
}

// Compiler throws the error as break statement cannot be used outside a loop or a switch