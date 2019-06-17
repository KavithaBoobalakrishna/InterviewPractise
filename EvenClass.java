package com.demo.threads.communication;

/**
 * @author kaboobal
 *
 */
public class EvenClass extends Thread {

  int limit;

  SharedClass sharedvariable;

  /**
   * The constructor.
   */
  public EvenClass(int limit, SharedClass sharedvariable) {

    this.limit = limit;
    this.sharedvariable = sharedvariable;
  }

  @Override
  public void run() {

    int evennumber = 2;
    while (evennumber <= this.limit) {
      this.sharedvariable.printEven(evennumber);
      evennumber = evennumber + 2;
    }
  }

}
