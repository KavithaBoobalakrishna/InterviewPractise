package com.demoexcercises;

public class Fibonaci {

  public static void main(String[] args) {

    int n = 6;
    int number = fib(n);
    System.out.println("The " + n + " th fibonacci number is " + number);

  }

  /**
   * @param n
   * @return
   */
  private static int fib(int n) {

    int result;
    if (n == 0)
      result = 0;
    else if (n == 1)
      result = 1;
    else {
      result = fib(n - 1) + fib(n - 2);
    }
    return result;
  }
}
