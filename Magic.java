package com.demoexcercises;

/**
 * @author kaboobal
 *
 */
public class Magic {

  public static void main(String[] args) {

    int num = 981;
    findMagic(num);
  }

  /**
   * @param num
   */
  private static void findMagic(int num) {

    while (num > 9) {

      int sum = 0;
      while (num > 0) {
        sum += num % 10;
        num = num / 10;

      }
      num = sum;

    }
    if (num == 1)
      System.out.println("The number is a Magic number");
    else
      System.out.println("The number is not a Magic number");

  }
}
