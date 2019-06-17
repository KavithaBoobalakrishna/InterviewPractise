package com.demoexcercises;

/**
 * @author kaboobal
 *
 */
public class RevereseNumber {
  public static void main(String[] args) {

    int num = 189;
    revNum(num);
  }

  /**
   * @param num
   */
  private static void revNum(int num) {

    int res = 0;
    int temp = 0;

    while (num > 0) {

      temp = num % 10;
      res = res * 10 + temp;
      num = num / 10;
    }
    System.out.println("The reversed number is " + res);

  }

}
