package com.tricky.javaoutputs;

import java.io.IOException;

/**
 * @author kaboobal
 *
 */
public class TryCatchException {
  public static void main(String[] args) {

    try {
      throw new IOException("Hello");
    } catch (IOException | Exception e) {
      System.out.println(e.getMessage());
    }
  }

}

// OUTPUT: The compiler throws - The exception IOException is already caught by the alternative Exception