package com.demo.threads.communication;

/**
 * @author kaboobal
 *
 */
public class MainClass {

  public static void main(String[] args) {

    SharedClass sharedvariable = new SharedClass();

    OddClass oddthread = new OddClass(20, sharedvariable);
    oddthread.setName("odd-thread");

    EvenClass eventhread = new EvenClass(20, sharedvariable);
    eventhread.setName("even-thread");

    oddthread.start();
    eventhread.start();
  }

}
