package com.ExecutorServices;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @author kaboobal
 *
 */
public class ExecutorExample1 {

  public static void main(String[] args) {

    ExecutorService executor = Executors.newFixedThreadPool(5); // creating the threadpool of size 5

    // Using the Runnable interface overriding run()
    executor.submit(() -> System.out.println("Im a runnable task"));

    // Using the callable Interface overridding call()
    Future<Integer> futureTask = executor.submit(() -> {
      System.out.println("Im a callable task");
      return 1 + 1;
    });

    try {
      Integer result = futureTask.get(5, TimeUnit.SECONDS);
      // get the future result
      System.out.println("The future result is: " + result);

    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (ExecutionException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (TimeoutException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      executor.shutdown();
    }
  }

}
