package com.ExecutorServices;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author kaboobal create list of Callable tasks and run using invokeAll() Executor Service is used to create the
 *         thread pool
 */
public class ExecutorExample2 {
  public static void main(String[] args) {

    ExecutorService executor = Executors.newCachedThreadPool();
    List<Callable<Integer>> listOfCallable = Arrays.asList(

        () -> 1, () -> 2, () -> 3);

    try {
      List<Future<Integer>> futures = executor.invokeAll(listOfCallable);

      int sum = futures.stream().map(f -> {

        try {
          return f.get();
        } catch (Exception e) {
          throw new IllegalStateException(e);
        }
      }).mapToInt(Integer::intValue).sum();

      System.out.println(sum);

    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      executor.shutdown();
    }

  }

}
