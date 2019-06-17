package com.demoexcercises;

/**
 * @author kaboobal
 *
 */
public class CountTheChar {

  public static void main(String[] args) {

    String input = "ASSTTTCCCC";
    countAndDisplay(input);

  }

  /**
   * @param input
   */
  private static void countAndDisplay(String input) {

    char previous = input.charAt(0);

    StringBuilder sb1 = new StringBuilder();
    sb1.append(previous);

    int count = 1;

    for (int i = 1; i < input.length(); i++) {

      if (input.charAt(i) == previous) {

        count++;

      } else {

        sb1.append(count);
        sb1.append(input.charAt(i));
        count = 1;

      }

      previous = input.charAt(i);
    }
    sb1.append(count);

    System.out.println("The modified string is " + sb1);

  }

}
