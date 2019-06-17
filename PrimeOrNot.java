package com.demoexcercises;

/**
 * @author kaboobal
 *
 */
public class PrimeOrNot {

  public static void main(String[] args) {

    int n = 21;
    if (isprime(n))
      System.out.println("Number is prime");
    else
      System.out.println("Number is not prime");
  }

  /**
   * @param n
   * @return
   */
  private static boolean isprime(int n) {

    int temp;
    boolean isPrime = true;
    for (int i = 2; i <= n / 2; i++) {

      temp = n % i;
      if (temp == 0) {
        isPrime = false;
      }
    }
    return isPrime;
  }

}
