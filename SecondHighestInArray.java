package com.demoexcercises;

/**
 * @author kaboobal
 *
 */
public class SecondHighestInArray {

  public static void main(String[] args) {

    int[] arr = { 14, 12, 13, 18, 19 };
    findSecongHighest(arr);

  }

  /**
   * @param arr
   */
  private static void findSecongHighest(int[] arr) {

    int first = Integer.MIN_VALUE;
    int second = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {

      if (arr[i] > first) {
        second = first;
        first = arr[i];

      } else if (arr[i] > second && arr[i] != first) {
        second = arr[i];
      }

    }
    System.out.println(second);
  }

}
