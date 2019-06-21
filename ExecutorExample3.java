package com.ExecutorServices;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author kaboobal
 *
 */
public class ExecutorExample3 {

  public static void main(String[] args) {

    int coreCount = Runtime.getRuntime().availableProcessors();
    System.out.println(coreCount);

    // Incase of IO Intensive task
    // ExecutorService executor = Executors.newFixedThreadPool(100);

    ExecutorService executor = Executors.newFixedThreadPool(coreCount);

    for (int i = 0; i < 100; i++) {
      executor.execute(new CPUIntensiveTask());
    }
  }

  static class CPUIntensiveTask implements Runnable {

    @Override
    public void run() {

      System.out.println("I AM THREAD: " + Thread.currentThread().getName());

    }

  }

}

// For IO Intensive task lets suppose requestiong data from database or from HTTP client all the threads goes int
// waiting state
