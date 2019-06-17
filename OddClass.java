package com.demo.threads.communication;

/**
 * @author kaboobal
 *
 */
public class OddClass extends Thread {

  int limit;

  SharedClass sharedvariable;

  /**
   * The constructor.
   */
  public OddClass(int limit, SharedClass sharedvariable) {

    this.limit = limit;
    this.sharedvariable = sharedvariable;
  }

  @Override
  public void run() {

    int oddnumber = 1;
    while (oddnumber <= this.limit) {
      this.sharedvariable.printOdd(oddnumber);
      oddnumber = oddnumber + 2;
    }
  }

}
