package com.tricky.javaoutputs;

/**
 * @author kaboobal
 *
 */
public class CommentsExecute {

  // public static void main(String[] args)
  // {
  // // the line below this gives an output
  // // \u000d
  // System.out.println("comment executed");
  // }

  public static void main(String[] args) {

    // the line below this gives an output
    // \u000d
    System.out.println("comment executed");
  }
}

// OUTPUT : comment executed
// The compiler treats the unicode character {u000d} as nextline and hence sysout is executed