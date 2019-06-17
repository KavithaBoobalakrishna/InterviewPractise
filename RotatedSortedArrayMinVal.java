package com.demoexcercises;

/**
 * @author kaboobal
 *
 *         Time complexity of this program is O(logn)
 */
public class RotatedSortedArrayMinVal {
  public static void main(String[] args) {

    int[] arr = { 3, 4, 5, 1, 2 };
    int n = arr.length;
    int val = finMin(arr, 0, n - 1);
    System.out.println("The Min value is " + val);

  }

  /**
   * @param arr
   * @param i
   * @param j
   * @return
   */
  private static int finMin(int[] arr, int low, int high) {

    // Handle if the array was not rotated
    if (high < low)
      return arr[0];

    if (high == low)
      return arr[low];

    int mid = low + (high - low) / 2;

    if (high > mid && arr[mid + 1] < arr[mid])
      return arr[mid + 1];

    if (low < mid && arr[mid] < arr[mid - 1])
      return arr[mid];

    if (arr[high] > arr[mid])
      return finMin(arr, low, mid - 1);
    return finMin(arr, mid + 1, high);
  }

}
