package com.demoexcercises;

/**
 * @author kaboobal
 *
 */
public class ArrayRotation {

  public static void main(String[] args) {

    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

    rotateArrayby(arr, 3);
    display(arr);
  }

  /**
   * @param arr
   * @param i
   */
  private static void rotateArrayby(int[] arr, int n) {

    for (int i = 0; i < n; i++)
      rotateArray(arr);

  }

  /**
   * @param arr
   */
  private static void rotateArray(int[] arr) {

    int temp = arr[0];
    int n = arr.length;
    int i;
    for (i = 0; i < n - 1; i++) {

      arr[i] = arr[i + 1];
    }
    arr[i] = temp;

  }

  private static void display(int[] arr) {

    for (int ar : arr)
      System.out.print(ar);
  }
}
