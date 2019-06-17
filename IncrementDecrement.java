package com.tricky.javaoutputs;

/**
 * @author kaboobal
 *
 */

class D {
  static int i = 1111;

  static {
    i = i-- - --i;
  }

  {
    i = i++ + ++i;
  }
}

class E extends D {
  static {
    i = --i - i--;
  }

  {
    i = ++i + i++;
  }
}

public class IncrementDecrement {

  public static void main(String[] args) {

    D d = new D();

    System.out.println(E.i);
  }

}

// OUTPUT: 6 will be the output
// step1: d. 1111-1109 =2 and e. 1-1 =0
// step2: d. 0+2 =2 and e. 3+3 =6 hence output will be 6
