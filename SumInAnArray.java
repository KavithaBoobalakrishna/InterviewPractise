package com.demoexcercises;

import java.util.Arrays;

/**
 * @author kaboobal
 *
 */
public class SumInAnArray {

  public static void main(String[] args) {

    int sum = 8;
    int[] arr = { 1, 2, 3, 5, 7, 6 };
    Arrays.sort(arr);

    findIntheArray(sum, arr);

  }

  /**
   * @param sum
   * @return
   */
  private static void findIntheArray(int sum, int[] arr) {

    int low = 0;

    int high = arr.length - 1;

    while (low < high) {

      if (arr[low] + arr[high] == sum)
        System.out.println(arr[low] + " " + arr[high]);

      if (arr[low] + arr[high] < sum)
        low++;

      else
        high--;

    }

  }

}
