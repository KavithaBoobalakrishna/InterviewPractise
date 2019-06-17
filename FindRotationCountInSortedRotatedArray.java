package com.demoexcercises;

/**
 * @author kaboobal
 *
 */

// Here timecomplexity is O(n);

public class FindRotationCountInSortedRotatedArray {

  public static void main(String[] args) {

    int[] arr = { 4, 5, 1, 2, 3 };
    int n = arr.length;
    System.out.println("The No of rotations are " + findNoOfRotations(arr, n));
  }

  /**
   * @param arr
   * @param n
   * @return
   */
  private static int findNoOfRotations(int[] arr, int n) {

    int min = arr[0];
    int min_index = -1;

    for (int i = 0; i < n; i++) {

      if (min > arr[i]) {
        min = arr[i];
        min_index = i;
      }
    }
    return min_index;
  }
}
