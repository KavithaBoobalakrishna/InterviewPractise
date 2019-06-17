package com.demo.threads.communication;

/**
 * @author kaboobal
 *
 */
public class SharedClass {
  boolean isoddprinted = false;

  synchronized void printEven(int evennumber) {

    while (!this.isoddprinted) {

      try {
        wait();
      }

      catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    System.out.println(Thread.currentThread().getName() + " : " + evennumber);
    this.isoddprinted = false;

    try {
      Thread.sleep(1000);

    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    notify();

  }

  /**
   * @param oddnumber
   */
  synchronized void printOdd(int oddnumber) {

    while (this.isoddprinted) {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    System.out.println(Thread.currentThread().getName() + " : " + oddnumber);
    this.isoddprinted = true;

    try {
      Thread.sleep(1000);

    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    notify();

  }

}
