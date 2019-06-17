package com.demoexcercises;

/**
 * @author kaboobal
 *
 */
public class Stringarrayequality {

  public static void main(String[] args) {

    String[] str1 = { "jave", "long", "love", "lifa", };
    String[] str2 = { "love", "life", "java", "long" };

    findEquality(str1, str2);

  }

  /**
   * @param str1
   * @param str2
   */
  private static void findEquality(String[] str1, String[] str2) {

    for (int i = 0; i < str1.length; i++) {
      for (int j = 0; j < str2.length; j++) {
        if (str1[i].equals(str2[j])) {
          System.out.println("The common strings are " + str1[i]);

        } else {
          continue;
        }

      }
    }

  }

}
