package com.demoexcercises;

/**
 * @author kaboobal
 *
 */
public class RangeOfPrimeNumbers {
  public static void main(String[] args) {

    int n = 100;
    printPrime(n);
  }

  /**
   * @param n
   */
  private static void printPrime(int n) {

    String primeNumbers = " ";
    int count = 0;

    for (int i = 1; i <= n; i++) {
      int counter = 0;
      for (int num = i; num >= 1; num--) {
        if (i % num == 0) {
          counter = counter + 1;
        }
      }
      if (counter == 2) {
        // Appended the Prime number to the String
        primeNumbers = primeNumbers + i + " ";
      }
    }
    System.out.println("Prime numbers from 1 to n are :");
    System.out.println(primeNumbers);
  }
}
