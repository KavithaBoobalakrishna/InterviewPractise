package com.demoexcercises;

import java.util.Arrays;

/**
 * @author kaboobal
 *
 */
public class DeleteArrayIndexValue {

  public static void main(String[] args) {

    int[] arr = { 1, 2, 3, 4, 5 };
    int index = 2;
    deleteIndexElement(arr, index);
  }

  /**
   * @param arr
   * @param index
   */
  private static void deleteIndexElement(int[] arr, int index) {

    int[] anotherarray = new int[arr.length - 1];
    for (int i = 0, k = 0; i < arr.length; i++) {

      if (i == index)
        continue;

      anotherarray[k++] = arr[i];
    }

    System.out.println("Altered array" + Arrays.toString(anotherarray));

  }

}
